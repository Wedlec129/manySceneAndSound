package com.example.manysceneandsound;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickNext(View v){

        textInput=findViewById(R.id.textInput);




        //как только нажали кнопку мы создали обекст перехода
        //указали где находимься сейчас и куда перейти
        //action->new bacic activity
        Intent intent =new Intent(this,second_layout.class);
        intent.putExtra("msg",textInput.getText().toString()); //даём параметр в интент
        startActivity(intent);

    }



}