package com.example.demo.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Admin {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotNull
  private String Name;

  @NotNull
  private String email;

  private Boolean accept;

  private Boolean deny;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getAccept() {
    return accept;
  }

  public void setAccept(Boolean accept) {
    this.accept = accept;
  }

  public Boolean getDeny() {
    return deny;
  }

  public void setDeny(Boolean deny) {
    this.deny = deny;
  }
}
