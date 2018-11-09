package com.money.entity;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@Table(name = "tb_person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private long Id;

    @NotEmpty
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotEmpty
    @Column(name = "LAST_NAME")
    private String lastName;

    @NotEmpty
    @Column(name = "MOBILE")
    private String mobile;

    @NotEmpty
    @Column(name = "EMAIL")
    private String email;


    public Person() {
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
