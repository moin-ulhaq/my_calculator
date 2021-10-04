package com.moin.my_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num1,num2,result;
    EditText et1,et2;
    TextView tv1;
    Button btnAdd,btnSub,btnMul,btndiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et1=findViewById(R.id.etFirstValue);
        et2=findViewById(R.id.etSecondValue);
        tv1=findViewById(R.id.tvResult);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btsubtraction);
        btnMul=findViewById(R.id.btnMultiplication);
        btndiv=findViewById(R.id.btndivision);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if(!et1.getText().toString().isEmpty()) {
                        num1 = Integer.parseInt(et1.getText().toString());
                        num2 = Integer.parseInt(et2.getText().toString());
                    }
                    result= myFunction(num1,num2,"+");
                    tv1.setText(Integer.toString(result));
                }
                catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"exception occured",Toast.LENGTH_SHORT).show();
                }


            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               /* result =num1-num2;
                tv1.setText(Integer.toString(result));

                Toast.makeText(getApplicationContext(),"subtract button clicked",Toast.LENGTH_SHORT).show();

                */
               try {
                   if(!et1.getText().toString().isEmpty()) {
                       num1 = Integer.parseInt(et1.getText().toString());
                       num2 = Integer.parseInt(et2.getText().toString());
                   }
                   if(num1>num2) {
                       result = myFunction(num1, num2, "-");
                       tv1.setText(Integer.toString(result));
                   } else{
                       Toast.makeText(getApplicationContext(),"put value 1 > value 2",Toast.LENGTH_SHORT).show();
                   }
               } catch(NumberFormatException e){
                   Toast.makeText(getApplicationContext(),"Exception is occuring",Toast.LENGTH_SHORT).show();
               }




            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                result =num1*num2;
//                tv1.setText(Integer.toString(result));
//
//
                try {
                    if(!et1.getText().toString().isEmpty()) {
                        num1 = Integer.parseInt(et1.getText().toString());
                        num2 = Integer.parseInt(et2.getText().toString());
                    }

                    result= myFunction(num1,num2,"*");
                    tv1.setText(Integer.toString(result));
                }
                catch(NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Exception is Occuring",Toast.LENGTH_SHORT).show();
                }

            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  result =num1/num2;
              //  tv1.setText(Integer.toString(result));

              //  Toast.makeText(getApplicationContext(),"division button clicked",Toast.LENGTH_SHORT).show();

                try {

                    if(!et1.getText().toString().isEmpty()) {
                        num1 = Integer.parseInt(et1.getText().toString());
                        num2 = Integer.parseInt(et2.getText().toString());
                    }
                    if(num1>num2){
                        result= myFunction(num1,num2,"/");
                        tv1.setText(Integer.toString(result));

                    } else{
                        Toast.makeText(getApplicationContext(),"put value 1 > value 2",Toast.LENGTH_SHORT).show();
                    }
                }
                catch (NumberFormatException e){
                    Toast.makeText(getApplicationContext(),"Exception is occuring",Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
    int myFunction(int a, int b,String operater){


        int result,x, y;
        result=0;
        x=a;
        y=b;

        if(operater=="+"){
            result=x+y;
           // return result;
        }
        else if(operater=="-"){
            result= x -y;
          //  return result;
        }else if(operater=="*"){
            result= x * y;
           // return result;
        }else if(operater=="/"){
            result= x/y;

        }
        return result;
    }

}
