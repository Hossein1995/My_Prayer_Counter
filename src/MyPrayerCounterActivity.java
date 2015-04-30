package com.fpc.myprayercounter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MyPrayerCounterActivity extends Activity {

    int counter = 0;


    //////////////////////

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /////////////////////////////////////////////////////////////////////////////////////////////////
        final TextView txtCaption = (TextView) findViewById(R.id.txtCaption);
        final Button btnClean = (Button) findViewById(R.id.btnClear);
        final Button btnHide = (Button) findViewById(R.id.btnHide);
        ///////////////////////////////////////////////////////////////////////////////////////////////////
        txtCaption.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Log.i("LOG", "Click TextView");
                counter++;
                txtCaption.setText("" + counter);
            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////
        btnClean.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                txtCaption.setText("");
                counter = 0;

            }
        });
        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        btnHide.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (btnClean.getVisibility() == View.GONE)
                {
                    btnClean.setVisibility(View.VISIBLE);
                    btnHide.setText("Hide Clean");
                }
                else
                {
                    btnClean.setVisibility(View.GONE);
                    btnHide.setText("Show Clean");
                }

            }
        });
        ///////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}
