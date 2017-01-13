package com.example.contactsmap.contacts_map.map;
/**
 * Created by AmaRguRiyA on 12-01-2017.
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.example.contactsmap.contacts_map.R;
import java.util.ArrayList;
import java.util.HashMap;

public class ContactsMap  extends FragmentActivity {
    private static final String TAG_CONTACTS_LIST = "list";
    private static final String TAG_LATITUDE_LIST = "latitude_list";
    private static final String TAG_LONGITUDE_LIST= "longitude_list";
    private static final String TAG_NAME = "name";
    private static final String TAG_EMAIL = "email";
    private static final String TAG_PHONE = "phone";
    private static final String TAG_PHONE_OFFICE = "officePhone";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.fraggment_section_dummy);

        Intent in = getParent().getIntent();

        ArrayList<HashMap<String, String>> contacts = (ArrayList<HashMap<String, String>>) in.getSerializableExtra(TAG_CONTACTS_LIST);


        String latitude,longitude;
        HashMap<String,String> hash;
        System.out.println(contacts);

        for(int i=0; i< contacts.size(); i++)
        {
            latitude = contacts.get(i).get("latitude");
            longitude = contacts.get(i).get("longitude");
            System.out.println(latitude + " " + longitude + "\n");
        }


    }
}
