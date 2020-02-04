package com.netease.dagger2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity3 extends AppCompatActivity {

    @Inject
    Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // student = new Student();

        DaggerStudentComponent.create().injectMainActivity(this);
    }
}