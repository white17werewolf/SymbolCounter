package com.example.myapplication;

import android.app.usage.UsageEvents;
import android.net.sip.SipSession;
import android.net.wifi.p2p.WifiP2pManager;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

import static com.example.myapplication.R.drawable.ic_launcher_background;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView img;
    TextView txt;
    Integer i = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        img = findViewById(R.id.imageView);
        txt = findViewById(R.id.textView);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void  onClick(View v)
            {
                txt.setText(i.toString());
                i++;
                img.setImageResource(ic_launcher_background);
            }
        };
        btn.setOnClickListener(listener);
    }
}
