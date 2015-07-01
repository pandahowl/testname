package com.example.huangpinhao.testname;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Created by huangpinhao on 2015/7/1.
 */
public class ScrollViewActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testview);
        TextView view =  (TextView) findViewById(R.id.TextView02);
        String s="";
        for (int i=0; i < 500; i++) {
            s += "vogella.com ";
        }
        view.setText(s);


        //sssssssssss

    }
}
