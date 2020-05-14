package com.example.springboot.demographqlservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class BaseObject {

  private String id; // unique
  
  private String name; // not unique

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
