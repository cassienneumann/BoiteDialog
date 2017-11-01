package com.example.xhasmter.boitedialog;

import android.app.Dialog;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void showDialog(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.alert_dialog);
        builder.create();
        builder.show();
    }

    public void customLight(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.custom_light);
        builder.create();
        builder.show();
    }

    public void customDark(View view) {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(R.layout.custom_dark);
        builder.create();
        builder.show();
    }
}
