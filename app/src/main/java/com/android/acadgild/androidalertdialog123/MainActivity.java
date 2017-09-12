package com.android.acadgild.androidalertdialog123;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends FragmentActivity {


    Button alertdfragbutton;
    FragmentManager fm = getSupportFragmentManager();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button to opne Dialog
        alertdfragbutton = (Button) findViewById(R.id.btnShowDialog);

        // Capture button clicks
        alertdfragbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //AlertDFragment alertdFragment = new AlertDFragment();
                // Show Alert DialogFragment
                //alertdFragment.show(fm, "Confirm Delete...");

                // Dialog object
                AlertDialog.Builder mBuilder =  new AlertDialog.Builder(MainActivity.this);
                //Inflate view on Dialog
                final View mView = getLayoutInflater().inflate(R.layout.dialog_addtask,null);
                Button mSave = (Button) mView.findViewById(R.id.btnYes);
                Button mCancel = (Button) mView.findViewById(R.id.btnNo);
                //Set View to dialog
                mBuilder.setView(mView);
                //Create Dialog
                final AlertDialog dialog = mBuilder.create();
                //Show Dialog
                dialog.show();

                //On click of button on dialog
                mSave.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {


                        dialog.cancel();
                    }
                });

                mCancel.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });


            }
        });

    }
}
