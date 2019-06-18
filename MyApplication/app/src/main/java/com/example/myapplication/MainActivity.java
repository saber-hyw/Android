package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.view.View;

import android.content.Intent;
import android.widget.EditText;


/**
 * private指的是私有的，只能在当前类的内部访问
 * static指的是静态全局变量
 * final指该变量一旦被赋值，便不可更改
 * string指字符串类型
 **/



public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.myapplication.MESSAGE";

    private static final String TAG = "hyw";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText)findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        Log.d(TAG, "sendMessage = " + message);

        startActivity(intent);  // 启动另一个activity画面

    }
}
