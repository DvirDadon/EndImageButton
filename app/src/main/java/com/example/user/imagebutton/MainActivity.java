package com.example.user.imagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageButton ib;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib=(ImageButton)findViewById(R.id.ib);
        iv=(ImageView) findViewById(R.id.iv);
    }

    public void ivclick(View view) {

    }
}
