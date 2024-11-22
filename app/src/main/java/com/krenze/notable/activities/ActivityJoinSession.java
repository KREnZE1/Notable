package com.krenze.notable.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.krenze.notable.R;

import java.util.ArrayList;
import java.util.HashMap;

public class ActivityJoinSession extends ActivityParent {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_session);
        findViewById(R.id.button_join_with_code).setOnClickListener(this::attemptToJoin);
    }

    private void attemptToJoin(View v) {
        int join_code = Integer.parseInt(((EditText) findViewById(R.id.text_input_join_code)).getText().toString());
        //TODO: Send code to server, await response
        HashMap<String, ArrayList<String>> teams = null; //TODO: Exchange null with server response
        startActivity(new Intent(this, ActivityHostSession.class).putExtra("client", true).putExtra("teams", teams));
    }
}
