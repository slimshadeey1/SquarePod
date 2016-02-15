package com.square1app.contacts;

import java.lang.Override;
import java.lang.String;

class setUser implements IsetUser {
  private String userid;

  setUser(String userid) {
    this.userid = userid;}

  public String getuserid() {
    return this.userid;}

  public void setuserid(String userid) {
    this.userid = userid;}
}
