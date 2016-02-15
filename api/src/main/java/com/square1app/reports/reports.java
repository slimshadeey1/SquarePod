package com.square1app.reports;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import java.lang.Override;
import java.lang.String;
import javax.inject.Named;

@Api(
    name = "reports",
    version = "v1",
    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "square1app.com", ownerName = "Square 1", packagePath = "com.square1app.reports")
)
class reports implements Ireports {

  public Ireport report(@Named("userid") String userid) {
    return new report(userid);
  }
}
