package com.square1app.contacts;

class userlist implements Ilist {
    private String[] vcards;
    private String ownerid;

    public userlist(String ownerid) {
        this.ownerid = ownerid;
    }

    @Override public String[] getVcards() {
        return vcards;
    }

    @Override public void setVcards(String[] vcards) {
        this.vcards = vcards;
    }

    @Override public String getOwnerid() {
        return ownerid;
    }

    @Override public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }
}
