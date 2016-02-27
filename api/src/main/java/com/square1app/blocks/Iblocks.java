package com.square1app.blocks;

/**
 * Created by benbyers on 2/27/16.
 */
public interface Iblocks {
    Iblock block(String ownerid, String targetID, String token);

    Iunblock unblock(String ownerid, String targetID, String token);

    Ilist list(String ownerid, String targetID, String token);
}
