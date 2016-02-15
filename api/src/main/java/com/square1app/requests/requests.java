package com.square1app.requests;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import java.lang.Override;

@Api(
    name = "requests",
    version = "v1",
    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "square1app.com", ownerName = "Square 1", packagePath = "com.square1.requests")
)
class requests implements Irequests {
  public Ilist list() {
    return list();
  }

  public IacceptUser acceptUser() {
    return acceptUser();
  }

  public IrejectUser rejectUser() {
    return rejectUser();
  }
}
