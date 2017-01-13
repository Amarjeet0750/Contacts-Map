package com.example.contactsmap.contacts_map;

/**
 * Created by AmaRguRiyA on 12-01-2017.
 */

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

import com.example.contactsmap.contacts_map.map.Map;
import com.example.contactsmap.contacts_map.service.Json;

public class AndroidTabList extends TabActivity {
    // TabSpec Names
    private static final String CONTACTS = "All Contatcts";
    private static final String MAP = "Contacts Map";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.androidtablist);

        TabHost tabHost = getTabHost();

        // Inbox Tab
        TabSpec inboxSpec = tabHost.newTabSpec(CONTACTS);
        // Tab Icon
        inboxSpec.setIndicator(CONTACTS);
        Intent inboxIntent = new Intent(this, Json.class);
        // Tab Content
        inboxSpec.setContent(inboxIntent);

        // Outbox Tab

        TabSpec outboxSpec = tabHost.newTabSpec(MAP);
        outboxSpec.setIndicator(MAP);

        Intent outboxIntent = new Intent(this, Map.class);
        outboxSpec.setContent(outboxIntent);


        // Adding all TabSpec to TabHost
        tabHost.addTab(inboxSpec); // Adding Inbox tab
        tabHost.addTab(outboxSpec); // Adding Outbox tab
    }
}
