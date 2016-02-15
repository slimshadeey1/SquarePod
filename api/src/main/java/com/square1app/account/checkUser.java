package com.square1app.account;

import java.lang.Override;
import java.lang.String;

class checkUser implements IcheckUser {
  private String username;

  checkUser(String username) {
    this.username = username;}

  @Override
  String getusername() {
    return this.username;}

  @Override
  void setusername(String username) {
    this.username = username;}
}
