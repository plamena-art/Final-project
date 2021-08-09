package com.plamena.app;

import java.util.List;

public class App {
    public static void main ( String[] args )
    {
        ContactService contactService = new ContactService();
        System.out.println( "Hello Plamena" );
        StepItUpContact plamena = new StepItUpContact("plamena", "email");


        //add Plamena to contacts
        contactService.addContact(plamena);

        //print all contacts
        List<StepItUpContact> contacts = contactService.getAllContacts();
        for (StepItUpContact contact : contacts ) {
            System.out.println(contact.getName());
        }
    }



}
