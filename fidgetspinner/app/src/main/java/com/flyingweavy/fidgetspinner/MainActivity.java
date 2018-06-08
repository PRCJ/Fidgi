package com.flyingweavy.fidgetspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    private static final float ROTATE_FROM = 0.0f;
    private static final float ROTATE_TO = -10.0f * 360.0f;
    Button changeFidget;
     ImageView fidgetspinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fidgetspinner = (ImageView) findViewById(R.id.fidgetspinner);

        //  changeFidget = (Button)findViewById(R.id.changeFidget);
        fidgetspinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation rotation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
                rotation.setFillAfter(true);
                fidgetspinner.startAnimation(rotation);

              /*  RotateAnimation r; // = new RotateAnimation(ROTATE_FROM, ROTATE_TO);
                r = new RotateAnimation(ROTATE_FROM, ROTATE_TO, RotateAnimation.RELATIVE_TO_SELF, 0.5f, RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                r.setInterpolator(new LinearInterpolator());
                r.setFillAfter(true);
                r.setDuration((long) 2*1500);
                r.setRepeatCount(0);
                fidgetspinner.startAnimation(r);*/

            }
        });
       changeFidget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                        fidgetspinner.setImageResource(R.drawable.icon);
            }
        });
        Button btn1 = (Button) findViewById(R.id.exit);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);
            }
        });

        Button viewShoppingCart = (Button) findViewById(R.id.change);
        viewShoppingCart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent viewShoppingCartIntent = new Intent(getBaseContext(), fidgi.class);
                startActivity(viewShoppingCartIntent);
            }
        });


    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}


