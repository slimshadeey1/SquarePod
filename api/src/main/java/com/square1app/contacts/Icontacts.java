package com.square1app.contacts;

import com.square1app.contacts.getuse.Iusername;

import java.lang.String;
import javax.inject.Named;


interface Icontacts {
  Iusername getUsername(@Named("ownerid") String ownerid);

  Iusername addUsername(@Named("ownerid") String ownerid);

  Icard card(@Named( = "ownerid") String ownerid);

  Icard card(@Named( = "ownerid") String ownerid);

  Iqr qr(@Named( = "ownerid") String ownerid);

  Iqr qr(@Named( = "ownerid") String ownerid);

  IsetUser setUser(@Named( = "userid") String userid);

  Ilist list();
}
