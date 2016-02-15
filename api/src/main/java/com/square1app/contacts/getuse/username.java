package com.square1app.contacts.getuse;

import com.square1app.contacts.Iusername;

import java.lang.Override;
import java.lang.String;

public class username implements Iusername {
  private String ownerid;

  public username(String ownerid) {
    this.ownerid = ownerid;}

  public String getownerid() {
    return this.ownerid;}

  public void setownerid(String ownerid) {
    this.ownerid = ownerid;}
}
