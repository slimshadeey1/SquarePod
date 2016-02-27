package com.square1app.account;

class registerUser implements IregisterUser {
    private String phonenumber;
    private String vcard;
    private String fullname;
    private String email;
    private String token;

    public registerUser(String phonenumber, String vcard, String fullname, String email,
        String token) {
        this.phonenumber = phonenumber;
        this.vcard = vcard;
        this.fullname = fullname;
        this.email = email;
        this.token = token;
    }

    @Override public String getPhonenumber() {
        return phonenumber;
    }

    @Override public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override public String getVcard() {
        return vcard;
    }

    @Override public void setVcard(String vcard) {
        this.vcard = vcard;
    }

    @Override public String getFullname() {
        return fullname;
    }

    @Override public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override public String getEmail() {
        return email;
    }

    @Override public void setEmail(String email) {
        this.email = email;
    }

    @Override public String getToken() {
        return token;
    }

    @Override public void setToken(String token) {
        this.token = token;
    }
}
