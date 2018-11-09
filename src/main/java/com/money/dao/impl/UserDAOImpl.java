package com.money.dao.impl;

import com.money.dao.UserDAO;
import com.money.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
    private static final Logger log = LoggerFactory.getLogger(UserDAOImpl.class);
    private static final String TAG = UserDAOImpl.class.getSimpleName();
    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    @Override
    public List<Person> listUser() {
        Session session = sessionFactory.getCurrentSession();
        String query="FROM Person";
        List<Person> list = session.createQuery(query).list();
        for (Person person : list) {
            log.info(TAG,"Person List Item  : " + person);
        }
        return list;
    }
    @Override
    public void addUser(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.save(person);
        log.info(TAG,"new person added! " + person);
    }
}
