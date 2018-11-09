package com.money.service.impl;

import com.money.dao.UserDAO;
import com.money.entity.Person;
import com.money.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    @Override
    public List<Person> listPerson() {
        return  userDAO.listUser();
    }

    @Override
    public void addUser(Person person) {
        userDAO.addUser(person);
    }
}
