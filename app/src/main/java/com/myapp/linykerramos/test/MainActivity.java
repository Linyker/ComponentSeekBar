package com.myapp.linykerramos.test;

import android.app.Activity;
import android.os.Bundle;

import com.myapp.linykerramos.test.widgets.discreteseekbar.ComponentSeekBar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ComponentSeekBar componentSeekBar1 = (ComponentSeekBar) findViewById(R.id.discrete1);
        componentSeekBar1.setNumericTransformer(new ComponentSeekBar.NumericTransformer() {
            @Override
            public int transform(int value) {
                return value * 100;
            }
        });
    }
}
