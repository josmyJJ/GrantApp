package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String firstName;
  private String lastName;
  private String highestEdu;
  private String major;
  private String veteranStatus;
  private String workAuth;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
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

  public String getHighestEdu() {
    return highestEdu;
  }

  public void setHighestEdu(String highestEdu) {
    this.highestEdu = highestEdu;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public String getVeteranStatus() {
    return veteranStatus;
  }

  public void setVeteranStatus(String veteranStatus) {
    this.veteranStatus = veteranStatus;
  }

  public String getWorkAuth() {
    return workAuth;
  }

  public void setWorkAuth(String workAuth) {
    this.workAuth = workAuth;
  }
}
