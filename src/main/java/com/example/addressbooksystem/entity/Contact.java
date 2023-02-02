package com.example.addressbooksystem.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private Long phoneNumber;
    @Column(name = "email_id")
    private String emailId;
   /* @Column(name = "area")
    private String area;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "zip")
    private int zip;*/
}
