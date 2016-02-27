package com.square1app.contacts;


import java.lang.String;
import javax.inject.Named;


interface Icontacts {
  Iusername getUsername(@Named("ownerid") String ownerid);


  Icard getCard(@Named("ownerid") String ownerid);


  Iqr getQr(@Named("ownerid") String ownerid);


  IsetUser setUser(@Named("userid") String userid);

  Ilist list();
}
