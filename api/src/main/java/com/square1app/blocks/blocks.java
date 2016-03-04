package com.square1app.blocks;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import com.square1app.Constants;

import javax.inject.Named;

@Api(
    name = "blocks",
    version = "v1",
    clientIds = {Constants.API_EXPLORER_CLIENT_ID},

    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "Square1app.com", ownerName = "Square 1", packagePath = "com.Square1app"))
class blocks implements Iblocks {

    @Override public Iblock block(@Named("ownerid")String ownerid, @Named("targetid")String targetID, @Named("token")String token) {
        return new block();
    }


    @Override public Iunblock unblock(@Named("ownerid")String ownerid, @Named("targetid")String targetID, @Named("token")String token) {
        return new unblock();
    }


    @Override public Ilist list(@Named("ownerid")String ownerid, @Named("targetid")String targetID, @Named("token")String token) {
        return new list();
    }
}
