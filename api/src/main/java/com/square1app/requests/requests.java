package com.square1app.requests;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

@Api(
    name = "requests",
    version = "v1",
    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "square1app.com", ownerName = "Square 1", packagePath = "com.square1"))
class requests implements Irequests {
    @Override public Ilist list(@Named("ownerid")String ownerid,@Named("targetid") String targetID,@Named("token") String token) {
        return new list();
    }

    @Override public IacceptUser acceptUser(@Named("ownerid")String ownerid,@Named("targetid") String targetID,@Named("token") String token) {
        return new acceptUser();
    }

    @Override public IrejectUser rejectUser(@Named("ownerid") String ownerid,@Named("targetid") String targetID,@Named("token") String token) {
        return new rejectUser();
    }
}
