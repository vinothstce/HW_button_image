package com.internet.hw_button_image;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        imageView = (ImageView) findViewById(R.id.imageView);

    }
    public void mess(View v)
    {
        switch(v.getId())
        {
            case R.id.button1:
                imageView.setImageResource(R.drawable.close);
                break;
            case R.id.button2:
                imageView.setImageResource(R.drawable.nav);
                break;
        }
    }
}
