package com.example.manysceneandsound;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class second_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_layout);
    }


    public void clickBack(View v){

        //как только нажали кнопку мы создали обекст перехода
        //указали где находимься сейчас и куда перейти
        //action->new bacic activity
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);

    }


}