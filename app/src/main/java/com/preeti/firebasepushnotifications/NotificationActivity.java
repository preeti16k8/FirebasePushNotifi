package com.preeti.firebasepushnotifications;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class NotificationActivity extends AppCompatActivity {

    private TextView mNotifData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        String dataMessage = getIntent().getStringExtra("message");
        String dataFrom = getIntent().getStringExtra("from_user_id");

        mNotifData = (TextView) findViewById(R.id.notif_text);

        mNotifData.setText(" FROM : " + dataFrom + " | MESSAGE : " + dataMessage);


    }
}
