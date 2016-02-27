package com.square1app.contacts;

class setUser implements IsetUser {
    private String userid;
    private String[] vcards;
    private String user;

    setUser(String userid, String user) {
        this.userid = userid;
        this.user = user;
    }

    @Override public String getUserid() {
        return userid;
    }

    @Override public void setUserid(String userid) {
        this.userid = userid;
    }

    @Override public String[] getVcards() {
        return vcards;
    }

    @Override public void setVcards(String[] vcards) {
        this.vcards = vcards;
    }
}
