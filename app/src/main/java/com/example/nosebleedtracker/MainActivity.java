package com.example.nosebleedtracker;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private ArrayList<LocalDateTime> drips = new ArrayList<>();
    private int new_drip_count = 0;
    private int prev_drip_count = 0;

    private long drip_diff = 0;

    private float new_drip_speed = 0;
    private float prev_drip_speed = 0;
    private float drip_accel = 0;

    private TextView speedReport;
    private TextView countReport;
    private TextView accelReport;
    private TextView finReport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        speedReport = (TextView) findViewById(R.id.textView);
        updateSpeed();

        countReport = (TextView) findViewById(R.id.textView2);
        updateCount();

        accelReport = (TextView) findViewById(R.id.textView3);
        updateAccel();

        finReport = (TextView) findViewById(R.id.textView4);
        updateFin();

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void run() {
                if (drips.size() > 1) {
                }
            }
        }, 0, 100);//put here time 1000 milliseconds=1 second
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void drip(View view){
        drips.add(LocalDateTime.now());
        new_drip_count++;
        updateCount();
        if(drips.size() > 1) {
            drip_diff = ChronoUnit.MILLIS.between(drips.get(drips.size() - 2), drips.get(drips.size() - 1));
            System.out.println(drip_diff);
            updateFin();
        }
    }

    public void updateCount(){
        String countReportString = String.format("Drip Count: %d drips", new_drip_count);
        countReport.setText(countReportString);
    }

    public void updateSpeed(){
        String speedReportString = String.format("Drip Speed: %.2f drips/min", new_drip_speed);
        speedReport.setText(speedReportString);
    }

    private void updateAccel() {
        String accelReportString = String.format("Drip Accel: %.2f drips/sec", drip_accel);
        accelReport.setText(accelReportString);
    }

    private void updateFin() {
        String finReportString = "Est. Finish: I dunno man it's just started";
        if(drip_diff > 5000){
            finReportString = "Est. Finish: Should stop any second. Time between drips >= 5s";
        }
        else if(drip_diff <= 500){
            finReportString = "Est. Finish: This is gonna be a while. Time between drips <= 500ms";
        }
        else{
            long time_left = (2996895/4498) - ((595*drip_diff)/4498);
            long min_left = time_left/60;
            long sec_left = time_left - min_left*60;
            finReportString = String.format("Est. Finish: %dmin %dsec", min_left, sec_left);
        }
        finReport.setText(finReportString);
    }

}