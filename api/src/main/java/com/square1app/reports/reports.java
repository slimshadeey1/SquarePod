package com.square1app.reports;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import com.square1app.Constants;

import javax.inject.Named;

@Api(
    name = "reports",
    version = "v1",
    description = "Square 1 API",
    clientIds = {Constants.API_EXPLORER_CLIENT_ID},

    namespace = @ApiNamespace(ownerDomain = "square1app.com", ownerName = "Square 1", packagePath = "com.square1app"))
class reports implements Ireports {

    public Ireport report(@Named("ownerid")String ownerid, @Named("token")String authtoken, @Named("date")String date,
        @Named("targetid")String targetid) {
        return new report(ownerid, date, targetid);
    }
}
