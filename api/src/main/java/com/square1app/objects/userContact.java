package com.square1app.objects;

/**
 * Created by benbyers on 2/26/16.
 */
public class userContact extends User implements IuserContact {
    private String locationRequested;
    private String dateRequested;
    private boolean confirmed;
    private String confirmedDate;

    public userContact(String ownerID, String locationRequested, String dateRequested,
        boolean confirmed) {
        super(ownerID);
        this.locationRequested = locationRequested;
        this.dateRequested = dateRequested;
        this.confirmed = confirmed;
    }

    public userContact(String ownerID, String locationRequested, String dateRequested,
        boolean confirmed, String confirmedDate) {
        super(ownerID);
        this.locationRequested = locationRequested;
        this.dateRequested = dateRequested;
        this.confirmed = confirmed;
        this.confirmedDate = confirmedDate;
    }

    public userContact(String ownerID, String locationRequested, String dateRequested) {
        super(ownerID);
        this.locationRequested = locationRequested;
        this.dateRequested = dateRequested;
    }

    @Override public String getLocationRequested() {
        return locationRequested;
    }

    @Override public void setLocationRequested(String locationRequested) {
        this.locationRequested = locationRequested;
    }

    @Override public String getDateRequested() {
        return dateRequested;
    }

    @Override public void setDateRequested(String dateRequested) {
        this.dateRequested = dateRequested;
    }

    @Override public boolean isConfirmed() {
        return confirmed;
    }

    @Override public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Override public String getConfirmedDate() {
        return confirmedDate;
    }

    @Override public void setConfirmedDate(String confirmedDate) {
        this.confirmedDate = confirmedDate;
    }
}
