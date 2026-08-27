package com.aimtd.superapp;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity extends Activity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setTextSize(24);
        tv.setText("AIMTD SuperApp Pro\nSiap Digas 🔥");
        tv.setGravity(17);
        setContentView(tv);
    }
}
