package com.square1app.reports;

/**
 * Created by benbyers on 2/27/16.
 */
public interface Ireport {
    String getOwnerid();

    void setOwnerid(String ownerid);

    String getDate();

    void setDate(String date);

    String getTargetid();

    void setTargetid(String targetid);
}
