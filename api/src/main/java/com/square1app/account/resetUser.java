package com.square1app.account;

import java.lang.Override;
import java.lang.String;

class resetUser implements IresetUser {
  private String username;

  resetUser(String username) {
    this.username = username;}

  public String getusername() {
    return this.username;}

  public void setusername(String username) {
    this.username = username;}
}
