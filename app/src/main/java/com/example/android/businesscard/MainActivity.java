package com.example.android.businesscard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        address = findViewById(R.id.address_1);

        String htmlString = "<u>Holding No -972-2, Baranagar, 88/2, Deshbandhu Rd, Bonhoogly, Ariadaha, Kolkata, West Bengal 700035</u>";
        address.setText(Html.fromHtml(htmlString));
    }

    public void openMap(View v){

        Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                Uri.parse("geo:0,0?q=22.645766, 88.374380(Frank Ross Pharmacy)"));
        startActivity(intent);
    }
}
