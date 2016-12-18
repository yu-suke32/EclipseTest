package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Test extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout ll = new LinearLayout(this);
        setContentView(ll);
        
        TextView tv = new TextView(this);
        tv.setText("ÇƒÇ∑Ç∆ÅI");
        ll.addView(tv);
        
    }

    
}
