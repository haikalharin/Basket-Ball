package com.example.pert3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

     public void tambah1(View view) {
        if(quantity==9999999) {
            return;
        }
         quantity = quantity+1;
        display(quantity);

    }

    public void tambah2(View view) {
        if(quantity==9999999) {
            return;
        }
        quantity = quantity+2;
        display(quantity);
    }

    public void tambah3(View view) {
        if(quantity==9999999) {
            return;
        }
        quantity = quantity+3;
        display(quantity);
    }

    public void reset(View view) {
        quantity = 0;
        display(quantity);
    }

    private void display(int number){
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_textview);
        quantityTextView.setText("" + number);
    }


}
