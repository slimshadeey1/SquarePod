package com.square1app.requests;

/**
 * Created by benbyers on 2/27/16.
 */
public interface Irequests {
    Ilist list(String ownerid, String targetID, String token);

    IacceptUser acceptUser(String ownerid, String targetID, String token);

    IrejectUser rejectUser(String ownerid, String targetID, String token);
}
