package com.money.service;

import com.money.entity.Person;

import java.util.List;

public interface UserService {
    public List<Person> listPerson();
    public void addUser(Person person);

}
