package com.square1app.contacts.adduse;

import com.square1app.contacts.Iqr;

import java.lang.String;

public class qr implements Iqr {
  private String ownerid;

  public qr(String ownerid) {
    this.ownerid = ownerid;}

  public String getownerid() {
    return this.ownerid;}

  public void setownerid(String ownerid) {
    this.ownerid = ownerid;}
}
