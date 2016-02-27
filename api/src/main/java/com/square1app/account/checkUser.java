package com.square1app.account;

class checkUser implements IcheckUser {
    private String ownerid;

    public checkUser(String ownerid) {
        this.ownerid = ownerid;
    }

    @Override public String getOwnerid() {
        return ownerid;
    }

    @Override public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }
}
