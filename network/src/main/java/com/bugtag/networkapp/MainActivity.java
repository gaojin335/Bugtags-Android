package com.bugtag.networkapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bugtag.networkapp.R;
import com.bugtags.library.agent.Agent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void httpclient(View view) {
        startActivity(new Intent(this, HttpClientActivity.class));
    }

    public void urlconnection(View view) {
        startActivity(new Intent(this, UrlActivity.class));
    }

    public void json(View view) {
        startActivity(new Intent(this, JsonActivity.class));
    }

    public void inputstream(View v) {
        startActivity(new Intent(this, InputStreamActivity.class));
    }

    public void okhttp(View v) {
        startActivity(new Intent(this, OkhttpActivity.class));
    }

    public void okhttp2(View v) {
        startActivity(new Intent(this, Okhttp2Activity.class));
    }
}
