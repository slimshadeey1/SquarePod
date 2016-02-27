package com.square1app.objects;

import ezvcard.property.Email;
import ezvcard.property.Telephone;

import java.util.List;

/**
 * Created by benbyers on 2/26/16.
 */
public interface IVCard {
    String getLastName();

    String getFirstName();

    String getFullName();

    List<String> getPrefix();

    List<Telephone> getPhoneNumbers();

    List<Email> getEmails();

    ezvcard.VCard getVcard();

    String getInput();
}
