package com.myexample.webtoapk;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class TextDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_display);

        // Get the title and content from intent
        String title = getIntent().getStringExtra("title");
        String content = getIntent().getStringExtra("content");

        // Set up toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(title != null ? title : "Text Content");
        }

        // Display content
        TextView textView = findViewById(R.id.textContent);
        textView.setText(content != null ? content : "");
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}