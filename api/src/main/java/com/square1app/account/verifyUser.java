package com.square1app.account;

class verifyUser implements IverifyUser {
    private String username;

    verifyUser(String username) {
        this.username = username;
    }

    @Override public String getusername() {
        return this.username;
    }

    @Override public void setusername(String username) {
        this.username = username;
    }
}
