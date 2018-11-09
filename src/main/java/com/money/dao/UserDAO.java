package com.money.dao;

import com.money.entity.Person;

import java.util.List;

public interface UserDAO {
    public List<Person> listUser();
    public void addUser(Person person);
}
