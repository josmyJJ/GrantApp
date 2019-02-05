package com.example.demo.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Application {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotNull
  String email;

  @NotNull
  Boolean Accept;

  @NotNull
  Boolean Reject;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id")
  private User user;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getAccept() {
    return Accept;
  }

  public void setAccept(Boolean accept) {
    Accept = accept;
  }

  public Boolean getReject() {
    return Reject;
  }

  public void setReject(Boolean reject) {
    Reject = reject;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
