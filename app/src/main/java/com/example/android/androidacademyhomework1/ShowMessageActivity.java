package com.example.android.androidacademyhomework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class ShowMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);
    }

    public static void start(MainActivity activity, String message) {
        Intent intent = new Intent(activity, ShowMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        activity.startActivity(intent);
    }
}
