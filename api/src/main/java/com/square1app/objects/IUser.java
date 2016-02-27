package com.square1app.objects;

/**
 * Created by benbyers on 2/26/16.
 */
public interface IUser {
    IAuth getAuthentication();

    void setAuthentication(IAuth authentication);

    VCard getvCard();

    void setvCard(VCard vCard);

    String getUsername();

    void setUsername(String username);

    String getOwnerID();

    void setOwnerID(String ownerID);

    String getPhonenumber();

    void setPhonenumber(String phonenumber);

    String getEmail();

    void setEmail(String email);

    String getFullName();

    void setFullName(String fullName);

    String getPhotoURL();

    void setPhotoURL(String photoURL);

    String getLocation();

    void setLocation(String location);
}
