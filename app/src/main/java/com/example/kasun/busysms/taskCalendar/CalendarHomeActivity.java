package com.example.kasun.busysms.taskCalendar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import com.example.kasun.busysms.R;

import java.util.Date;

public class CalendarHomeActivity extends AppCompatActivity {
    Button btnToday, btnViewTask;
    CalendarView calendarView_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Assign controllers
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        btnToday = (Button) findViewById(R.id.btnToday);
        btnViewTask = (Button) findViewById(R.id.btnViewTask);
        calendarView_main = (CalendarView) findViewById(R.id.calendarView_main);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CalendarHomeActivity.this, AddTaskActivity.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void viewToday(View view){
        calendarView_main.setDate(new Date().getTime(), true, true);
    }

    public void viewTasks(View view){
        Intent intent = new Intent(CalendarHomeActivity.this, ViewTaskActivity.class);
        startActivity(intent);
    }
}
