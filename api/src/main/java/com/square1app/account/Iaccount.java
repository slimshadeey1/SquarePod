package com.square1app.account;

import java.lang.String;
import javax.inject.Named;

interface Iaccount {
  IregisterUser registerUser();

  IverifyUser verifyUser(@Named( = "username") String username);

  IcheckUser checkUser(@Named( = "username") String username);

  IresetUser resetUser(@Named( = "username") String username);

  IremoveUser removeUser();
}
