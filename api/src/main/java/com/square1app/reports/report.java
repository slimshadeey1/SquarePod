package com.square1app.reports;

class report implements Ireport {
    private String ownerid;
    private String date;
    private String targetid;

    public report(String ownerid, String date, String targetid) {
        this.ownerid = ownerid;
        this.date = date;
        this.targetid = targetid;
    }

    @Override public String getOwnerid() {
        return ownerid;
    }

    @Override public void setOwnerid(String ownerid) {
        this.ownerid = ownerid;
    }

    @Override public String getDate() {
        return date;
    }

    @Override public void setDate(String date) {
        this.date = date;
    }

    @Override public String getTargetid() {
        return targetid;
    }

    @Override public void setTargetid(String targetid) {
        this.targetid = targetid;
    }
}
