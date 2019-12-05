package com.example.myapplication;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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

        /*View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void  onClick(View v)
            {
                txt.setText(i.toString());
                i++;
                img.setImageResource(ic_launcher_background);
            }
        };
        btn.setOnClickListener(listener);*/

        /*****compileOptions{
            sourceCompatibility JavaVersion.VERSION_1_8
            targetCompatibility JavaVersion.VERSION_1_8
        }*/
    }
}
