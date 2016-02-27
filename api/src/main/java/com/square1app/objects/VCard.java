package com.square1app.objects;

import ezvcard.Ezvcard;
import ezvcard.property.Email;
import ezvcard.property.Telephone;

import java.util.List;

/**
 * Created by benbyers on 2/26/16.
 */
public class VCard implements IVCard {
    private String input;
    private ezvcard.VCard vcard;

    public VCard(String input) {
        this.input = input;
        vcard = Ezvcard.parse(input).first();
    }

    @Override public String getLastName() {
        return vcard.getStructuredName().getFamily();
    }

    @Override public String getFirstName() {
        return vcard.getStructuredName().getGiven();
    }

    @Override public String getFullName() {
        return vcard.getFormattedName().getValue();
    }

    @Override public List<String> getPrefix() {
        return vcard.getStructuredName().getPrefixes();
    }

    @Override public List<Telephone> getPhoneNumbers() {
        return vcard.getTelephoneNumbers();
    }

    @Override public List<Email> getEmails() {
        return vcard.getEmails();
    }

    @Override public ezvcard.VCard getVcard() {
        return vcard;
    }

    @Override public String getInput() {
        return input;
    }
}
