package com.example.springboot311.dao;

import com.example.springboot311.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void createUser(User user) {
        em.persist(user);
    }

    @Override
    public User readUser(int id) {
        User u = em.find(User.class, id);
        return u;
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }


    @Override
    public void deleteUser(int id) {
        em.remove(em.find(User.class, id));
    }


    @Override
    public List<User> getUsers() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }


    @Override
    public User getUserByName(String name) {
        return em.createQuery("select u from User u where u.username=:name",
                User.class).setParameter("name", name).getSingleResult();
    }
}
