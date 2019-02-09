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


}
