package com.square1app.objects;

/**
 * Created by benbyers on 2/26/16.
 */
public class User implements IUser {
    private IAuth authentication;
    private VCard vCard;
    private String username;
    private String ownerID;
    private String phonenumber;
    private String email;
    private String FullName;
    private String photoURL;
    private String Location;

    public User(String ownerID) {
        this.ownerID = ownerID;
    }

    @Override public IAuth getAuthentication() {
        return authentication;
    }

    @Override public void setAuthentication(IAuth authentication) {
        this.authentication = authentication;
    }

    @Override public VCard getvCard() {
        return vCard;
    }

    @Override public void setvCard(VCard vCard) {
        this.vCard = vCard;
    }

    @Override public String getUsername() {
        return username;
    }

    @Override public void setUsername(String username) {
        this.username = username;
    }

    @Override public String getOwnerID() {
        return ownerID;
    }

    @Override public void setOwnerID(String ownerID) {
        this.ownerID = ownerID;
    }

    @Override public String getPhonenumber() {
        return phonenumber;
    }

    @Override public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override public String getEmail() {
        return email;
    }

    @Override public void setEmail(String email) {
        this.email = email;
    }

    @Override public String getFullName() {
        return FullName;
    }

    @Override public void setFullName(String fullName) {
        FullName = fullName;
    }

    @Override public String getPhotoURL() {
        return photoURL;
    }

    @Override public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    @Override public String getLocation() {
        return Location;
    }

    @Override public void setLocation(String location) {
        Location = location;
    }
}
