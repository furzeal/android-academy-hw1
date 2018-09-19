package com.example.android.androidacademyhomework1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText messageText;
    private Button previewButton;

    private String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageText = findViewById(R.id.message_text);
        previewButton = findViewById(R.id.preview_button);

        previewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message = messageText.getText().toString();
            }
        });

    }
}
