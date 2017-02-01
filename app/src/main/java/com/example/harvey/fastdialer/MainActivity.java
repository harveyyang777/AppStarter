package com.example.harvey.fastdialer;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent it=new Intent(Intent.ACTION_VIEW);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
       // Intent it=new Intent();
     //   it.setAction(Intent.ACTION_DIAL);
        it.setData(Uri.parse("tel:10086"));

        startActivity(it);
    }

    public void mail(View v){

        it.setData(Uri.parse("mailto:625087639@qq.com"));
        it.putExtra(Intent.EXTRA_SUBJECT,"mail subject");
        it.putExtra(Intent.EXTRA_TEXT,"text");

        startActivity(it);

    }

    public void sms(View v){

        it.setData(Uri.parse("sms:15110243977?body=恭喜发财"));
        startActivity(it);
    }

    public  void search(View v){
        it.setAction(Intent.ACTION_WEB_SEARCH);
        it.putExtra(SearchManager.QUERY,"android");
        startActivity(it);

    }
}
