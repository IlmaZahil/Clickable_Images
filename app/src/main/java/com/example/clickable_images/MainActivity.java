package com.example.clickable_images;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE =".android.droidcafe.extra.MESSAGE";

    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void showDonutOrder(View view) {
        Toast toast = Toast.makeText(this, R.string.donut_order_message,
                Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        mOrderMessage="You ordered a donut.";
        intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
        startActivity(intent);
    }

    public void showIceCreamOrder(View view) {
        Toast toast = Toast.makeText(this, R.string.ice_cream_order_message,
                Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        mOrderMessage="You ordered an Ice Cream.";
        intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
        startActivity(intent);
    }

    public void showCakeOrder(View view) {
        Toast toast = Toast.makeText(this, R.string.cake_order_message,
                Toast.LENGTH_SHORT);
        toast.show();
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        mOrderMessage="You ordered a cake.";
        intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
        startActivity(intent);
    }

}