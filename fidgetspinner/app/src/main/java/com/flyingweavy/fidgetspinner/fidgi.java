package com.flyingweavy.fidgetspinner;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.flyingweavy.fidgetspinner.R.id.fidgetspinner;

public class fidgi extends AppCompatActivity implements View.OnClickListener {
    Button b1;
    ImageView iw;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fidget);

        Button b1 = (Button) findViewById(R.id.fidget1);
        b1.setOnClickListener(this);

        iw = (ImageView) findViewById(R.id.icon);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        if (v == b1)
        {
            iw.setImageResource(R.drawable.icon);
        }

    }
}
