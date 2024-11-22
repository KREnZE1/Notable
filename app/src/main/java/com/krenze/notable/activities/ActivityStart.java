package com.krenze.notable.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.krenze.notable.R;

public class ActivityStart extends ActivityParent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        findViewById(R.id.button_host_session).setOnClickListener((v) -> startActivity(new Intent(this, ActivityHostSession.class)));
        findViewById(R.id.button_attempt_join).setOnClickListener((v) -> startActivity(new Intent(this, ActivityJoinSession.class)));
    }
}
