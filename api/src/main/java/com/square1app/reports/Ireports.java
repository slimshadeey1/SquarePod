package com.square1app.reports;

import java.lang.String;
import javax.inject.Named;

interface Ireports {
  Ireport report(@Named("userid") String userid);
}
