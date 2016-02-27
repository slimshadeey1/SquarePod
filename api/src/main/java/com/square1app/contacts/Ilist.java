package com.square1app.contacts;

/**
 * Created by benbyers on 2/27/16.
 */
public interface Ilist {
    String[] getVcards();

    void setVcards(String[] vcards);

    String getOwnerid();

    void setOwnerid(String ownerid);
}
