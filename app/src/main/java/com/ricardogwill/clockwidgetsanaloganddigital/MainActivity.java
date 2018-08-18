package com.ricardogwill.clockwidgetsanaloganddigital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;

public class MainActivity extends AppCompatActivity {

    // Note that both types of clocks in this app are currently deprecated.
    private AnalogClock analogClock;
    private DigitalClock digitalClock;
    private Button switchClocksButton;
    private Button bothButton;
    private Button analogButton;
    private Button digitalButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = (AnalogClock) findViewById(R.id.simpleAnalogClock);
        digitalClock = (DigitalClock) findViewById(R.id.simpleDigitalClock);
        switchClocksButton = (Button) findViewById(R.id.switch_clocks_button);
        bothButton = (Button) findViewById(R.id.both_button);
        analogButton = (Button) findViewById(R.id.analog_button);
        digitalButton = (Button) findViewById(R.id.digital_button);

        switchButtonClickListener();
        bothButtonClickListener();
        analogButtonClickListener();
        digitalButtonClickListener();
    }

    public void switchButtonClickListener() {
        switchClocksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (digitalClock.getVisibility() == DigitalClock.INVISIBLE) {
                    digitalClock.setVisibility(DigitalClock.VISIBLE);
                    analogClock.setVisibility(AnalogClock.INVISIBLE);
                } else {
                    digitalClock.setVisibility(DigitalClock.INVISIBLE);
                    analogClock.setVisibility(AnalogClock.VISIBLE);
                }
            }
        });
    }

    public void bothButtonClickListener() {
        bothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                analogClock.setVisibility(AnalogClock.VISIBLE);
                digitalClock.setVisibility(DigitalClock.VISIBLE);
            }
        });

    }

    public void analogButtonClickListener() {
        analogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                analogClock.setVisibility(AnalogClock.VISIBLE);
                digitalClock.setVisibility(DigitalClock.INVISIBLE);
            }
        });

    }

    public void digitalButtonClickListener() {
        digitalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                analogClock.setVisibility(AnalogClock.INVISIBLE);
                digitalClock.setVisibility(DigitalClock.VISIBLE);
            }
        });

    }


}
