package com.android.example.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     *  获取TextView的text并弹出toast
     * @param context
     * @param tv
     */
    private static void toast(Context context, TextView tv) {
        Toast.makeText(context, context.getString(R.string.start_app, tv.getText()), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.popular_movie).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toast(getApplication(), (TextView) v);
            }
        });

        findViewById(R.id.stock_eagle).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toast(getApplication(), (TextView) v);
            }
        });
        findViewById(R.id.xyz_reader).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toast(getApplication(), (TextView) v);
            }
        });
        findViewById(R.id.extra_news).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toast(getApplication(), (TextView) v);
            }
        });
        findViewById(R.id.graduation_project).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                toast(getApplication(), (TextView) v);
            }
        });
    }


}
