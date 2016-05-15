package com.grubjack.t99.dao;

import com.grubjack.t99.model.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by user on 12.05.2016.
 */

@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void addUser(User user) {
        getCurrentSession().save(user);
    }

    public void updateUser(User user) {
        User userToUpdate = getUser(user.getId());
        userToUpdate.setName(user.getName());
        userToUpdate.setAge(user.getAge());
        userToUpdate.setAdmin(user.getAdmin());
        sessionFactory.getCurrentSession().update(userToUpdate);
    }

    public User getUser(int id) {
        return getCurrentSession().get(User.class, id);
    }

    public void deleteUser(int id) {
        User user = getUser(id);
        if (user != null)
            getCurrentSession().delete(user);
    }

    public List<User> getUsers() {
        List<User> users = (List<User>) getCurrentSession()
                .createCriteria(User.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
        return users;
    }

    public List<User> getUsersByName(String name) {
//        List<User> users = (List<User>) getCurrentSession().createCriteria(User.class).add(Restrictions.ilike("name", name, MatchMode.ANYWHERE)).list();
        List<User> users = (List<User>) getCurrentSession().createCriteria(User.class).add(Restrictions.eq("name", name).ignoreCase()).list();
        return users;
    }


}
