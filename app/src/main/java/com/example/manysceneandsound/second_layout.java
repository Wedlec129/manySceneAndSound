package com.example.manysceneandsound;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class second_layout extends AppCompatActivity {

    TextView text;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layout);

        //получаем параметр intent и задаём в текст
        Intent intent=getIntent();
        text=findViewById(R.id.textvievOUT);
        msg=intent.getStringExtra("msg");
        text.setText(msg);

    }


    public void clickBack(View v){

        //как только нажали кнопку мы создали обекст перехода
        //указали где находимься сейчас и куда перейти
        //action->new bacic activity
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);

    }


}