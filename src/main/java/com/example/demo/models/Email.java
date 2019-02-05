package com.example.demo.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
public class Email {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String subject;
  private LocalDateTime dateSent;

  @Size(min=3, max=140)
  private String messageContent;


  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "course_id")
  private Course course;


  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "sender_id")
  private User sender;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "receiver_id")
  private User receiver;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public LocalDateTime getDateSent() {
    return dateSent;
  }

  public void setDateSent(LocalDateTime dateSent) {
    this.dateSent = dateSent;
  }

  public String getMessageContent() {
    return messageContent;
  }

  public void setMessageContent(String messageContent) {
    this.messageContent = messageContent;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public User getSender() {
    return sender;
  }

  public void setSender(User sender) {
    this.sender = sender;
  }

  public User getReceiver() {
    return receiver;
  }

  public void setReceiver(User receiver) {
    this.receiver = receiver;
  }
}
