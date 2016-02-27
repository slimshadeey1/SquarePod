package com.square1app.account;

import java.lang.Override;
import java.lang.String;

class checkUser implements IcheckUser {
  private String username;

  checkUser(String username) {
    this.username = username;}

  public String getusername() {
    return this.username;}


  public void setusername(String username) {
    this.username = username;}
}
