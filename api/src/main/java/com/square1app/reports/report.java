package com.square1app.reports;

import java.lang.Override;
import java.lang.String;

class report implements Ireport {
  private String userid;

  report(String userid) {
    this.userid = userid;}

  public String getuserid() {
    return this.userid;
  }


  public void setuserid(String userid) {
    this.userid = userid;
  }
}
