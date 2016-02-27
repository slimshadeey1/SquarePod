package com.square1app.account;

class resetUser implements IresetUser {
    private String ownerid;

    resetUser(String ownerid) {
        this.ownerid = ownerid;
    }

    @Override public String getOwnerid() {
        return this.ownerid;
    }

    @Override public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }
}
