package com.square1app.account;

import java.lang.String;

class verifyUser implements IverifyUser {
  private String username;

  verifyUser(String username) {
    this.username = username;}

  public String getusername() {
    return this.username;}

  public void setusername(String username) {
    this.username = username;}
}
