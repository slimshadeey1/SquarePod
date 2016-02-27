package com.square1app.objects;

/**
 * Created by benbyers on 2/27/16.
 */
public interface IuserContact extends IUser {
    String getLocationRequested();

    void setLocationRequested(String locationRequested);

    String getDateRequested();

    void setDateRequested(String dateRequested);

    boolean isConfirmed();

    void setConfirmed(boolean confirmed);

    String getConfirmedDate();

    void setConfirmedDate(String confirmedDate);
}
