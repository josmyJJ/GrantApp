package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student_Application {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  // Create many to many for student and application
}
