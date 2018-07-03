package com.example.shree.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView bankCard,ideasCard,addCard,linkCard,wifiCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        bankCard=findViewById(R.id.bank_card);
        ideasCard=findViewById(R.id.idea_card);
        addCard=findViewById(R.id.add_card);
        linkCard=findViewById(R.id.link_card);
        wifiCard=findViewById(R.id.wifi_card);

        bankCard.setOnClickListener(this);
        ideasCard.setOnClickListener(this);
        addCard.setOnClickListener(this);
        linkCard.setOnClickListener(this);
        wifiCard.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id== R.id.action_setting){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent i;
       switch (v.getId()){
           case R.id.bank_card: i=new Intent(MainActivity.this,BankActivity.class);startActivity(i);break;
           case R.id.idea_card: i=new Intent(MainActivity.this,BankActivity.class);startActivity(i);break;
           case R.id.add_card: i=new Intent(MainActivity.this,BankActivity.class);startActivity(i);break;
           case R.id.link_card: i=new Intent(MainActivity.this,BankActivity.class);startActivity(i);break;
           case R.id.wifi_card: i=new Intent(MainActivity.this,BankActivity.class);startActivity(i);break;
      default:break;
       }
    }
}
