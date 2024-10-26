package com.krenze.notable.activities;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.krenze.notable.R;

public class MainActivity extends ParentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.host).setOnClickListener(v -> startActivity(new Intent(MainActivity.this, HostTeamSelection.class)));
        findViewById(R.id.join).setOnClickListener(v -> Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show());
    }
}