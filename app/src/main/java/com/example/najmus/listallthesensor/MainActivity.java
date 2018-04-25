package com.example.najmus.listallthesensor;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        SensorManager sensorManager = (SensorManager) getSystemService ( Context.SENSOR_SERVICE );
        List<Sensor> sensors = sensorManager.getSensorList (  )
    }
}
