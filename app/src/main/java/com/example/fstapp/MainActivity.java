package com.example.fstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //获取控件
        EditText input = findViewById(R.id.value_celsius);
        Button btn = findViewById(R.id.button);
        TextView out = findViewById(R.id.resulttext);

        //设置按钮点击监听
        btn.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.button:
                outputValue(true);
                break;
            default:
        }
    }
    
    private void outputValue(boolean b) {

    }

}
}