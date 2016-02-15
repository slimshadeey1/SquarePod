package com.square1app.contacts.getuse;

import com.square1app.contacts.Icard;

import java.lang.Override;
import java.lang.String;

public class card implements Icard {
  private String ownerid;

  public card(String ownerid) {
    this.ownerid = ownerid;}

  public String getownerid() {
    return this.ownerid;}

  public void setownerid(String ownerid) {
    this.ownerid = ownerid;}
}
