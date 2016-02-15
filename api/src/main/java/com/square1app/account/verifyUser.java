package com.square1app.account;

import java.lang.Override;
import java.lang.String;

class verifyUser implements IverifyUser {
  private String username;

  verifyUser(String username) {
    this.username = username;}

  @Override
  String getusername() {
    return this.username;}

  @Override
  void setusername(String username) {
    this.username = username;}
}
