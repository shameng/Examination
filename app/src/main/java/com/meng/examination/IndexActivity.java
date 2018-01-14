package com.meng.examination;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String account = bundle.getString("account");
        TextView accountTextView = (TextView) findViewById(R.id.account);
        accountTextView.setText(account);
    }

    public void toPaperList(View view) {
        Intent intent = new Intent(IndexActivity.this, PaperListActivity.class);
        startActivity(intent);
    }

}
