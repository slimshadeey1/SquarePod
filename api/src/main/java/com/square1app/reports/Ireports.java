package com.square1app.reports;

import javax.inject.Named;

interface Ireports {
    Ireport report(@Named("ownerid") String ownerid, String authtoken, String date,
        String targetid);
}
