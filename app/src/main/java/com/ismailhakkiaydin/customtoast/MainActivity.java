package com.ismailhakkiaydin.customtoast;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void CustomToast(String title, String message){
        Toast toast = new Toast(this);

        LinearLayout pnl = new LinearLayout(this);
        pnl.setOrientation(LinearLayout.VERTICAL);
        pnl.setBackgroundColor(Color.MAGENTA);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(600,150);
        lp.setMargins(5,5,5,5);

        TextView tv= new TextView(this);
        tv.setText(title);
        tv.setTextColor(Color.BLUE);
        pnl.addView(tv,lp);

        TextView tv2=new TextView(this);
        tv2.setText(message);
        tv2.setTextColor(Color.CYAN);
        pnl.addView(tv2,lp);

        toast.setView(pnl);
        toast.show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CustomToast("Toast Example", "Toast is Succesfull");

    }
}
