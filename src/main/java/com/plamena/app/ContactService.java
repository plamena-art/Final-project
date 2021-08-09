package com.plamena.app;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    private List<StepItUpContact> stepItUpContacts = new ArrayList<>();
    public void addContact(StepItUpContact contact) {
        stepItUpContacts.add(contact);
    }

    public List<StepItUpContact> getAllContacts() {
        return stepItUpContacts;
    }
}




