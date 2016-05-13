package com.grubjack.t99.controller;

import com.grubjack.t99.model.User;
import com.grubjack.t99.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.List;

/**
 * Created by user on 12.05.2016.
 */

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addUserPage() {
        ModelAndView modelAndView = new ModelAndView("add-user-form");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addingUser(@ModelAttribute("user") User user) {

        user.setCreatedDate(new Date());

        ModelAndView modelAndView = new ModelAndView("home");
        userService.addUser(user);

        String message = "User was successfully added.";
        modelAndView.addObject("message", message);

        return modelAndView;
    }


    @RequestMapping(value = "/list")
    public ModelAndView listOfUsers(@RequestParam(required = false) Integer page) {
        ModelAndView modelAndView = new ModelAndView("list-of-users");

        List<User> users = userService.getUsers();

        PagedListHolder<User> pagedListHolder = new PagedListHolder<User>(users);
        pagedListHolder.setPageSize(10);
        modelAndView.addObject("maxPages", pagedListHolder.getPageCount());

        if (page == null || page < 1 || page > pagedListHolder.getPageCount()) page = 1;

        modelAndView.addObject("page", page);
        if (page == null || page < 1 || page > pagedListHolder.getPageCount()) {
            pagedListHolder.setPage(0);
        } else if (page <= pagedListHolder.getPageCount()) {
            pagedListHolder.setPage(page - 1);
        }
        modelAndView.addObject("users", pagedListHolder.getPageList());

        return modelAndView;
    }


    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public ModelAndView editUserPage(@RequestParam(value = "id", required = true) Integer id,
                                     Model model) {

        model.addAttribute("user", userService.getUser(id));

        ModelAndView modelAndView = new ModelAndView("edit-user-form");
        return modelAndView;
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editingUser(@ModelAttribute("user") User user,
                                    @RequestParam(value = "id", required = true) Integer id) {

        userService.updateUser(user);

        String message = "User with id " + id + " was successfully edited.";

        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public ModelAndView deleteUser(@RequestParam(value = "id", required = true) Integer id) {
        userService.deleteUser(id);

        ModelAndView modelAndView = new ModelAndView("home");
        String message = "User with id " + id + " was successfully deleted.";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @RequestMapping(value = "/search")
    public ModelAndView getSearchByName(
            @RequestParam(value = "name", required = true) String name, @RequestParam(required = false) Integer page) {
        ModelAndView modelAndView = new ModelAndView("result-list");
        modelAndView.addObject("name", name);
        List<User> users = userService.getUsersByName(name);

        PagedListHolder<User> pagedListHolder = new PagedListHolder<User>(users);
        pagedListHolder.setPageSize(10);
        modelAndView.addObject("maxPages", pagedListHolder.getPageCount());

        if (page == null || page < 1 || page > pagedListHolder.getPageCount()) page = 1;

        modelAndView.addObject("page", page);
        if (page == null || page < 1 || page > pagedListHolder.getPageCount()) {
            pagedListHolder.setPage(0);
        } else if (page <= pagedListHolder.getPageCount()) {
            pagedListHolder.setPage(page - 1);
        }
        modelAndView.addObject("users", pagedListHolder.getPageList());


        return modelAndView;
    }


}
