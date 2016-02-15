package com.square1app.blocks;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiNamespace;
import java.lang.Override;

@Api(
    name = "blocks",
    version = "v1",
    description = "Square 1 API",
    namespace = @ApiNamespace(ownerDomain = "Square1app.com", ownerName = "Square 1", packagePath = "com.Square1app.blocks")
)
class blocks implements Iblocks {
  @Override
  public Iblock block() {
    return block();
  }

  @Override
  public Iunblock unblock() {
    return unblock();
  }

  @Override
  public Ilist list() {
    return list();
  }
}
