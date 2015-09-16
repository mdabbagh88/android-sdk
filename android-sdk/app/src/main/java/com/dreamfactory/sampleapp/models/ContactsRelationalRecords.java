package com.dreamfactory.sampleapp.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ContactsRelationalRecords {
    @JsonProperty("resource")
    public List<ContactsRelationalRecord> record = new ArrayList<>();
}
