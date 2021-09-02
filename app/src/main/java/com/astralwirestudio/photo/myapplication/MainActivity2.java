package com.astralwirestudio.photo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

//    WebView wb;

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent i = getIntent();
       String d = i.getStringExtra("my_data");
       boolean b = i.getBooleanExtra("true_or_false",false);
       int tempData = i.getIntExtra("int_data",0);

        tv = findViewById(R.id.data);
        tv.setText(d);




//
//        wb = findViewById(R.id.web_view);
//        wb.setWebViewClient(new WebViewClient());
////        wb.loadUrl("https://developer.android.com/docs");

    }

//    public void gotoNextAct(View view) {
//        Intent i3 = new Intent(MainActivity2.this,Act3.class);
//        startActivity(i3);
//    }
}