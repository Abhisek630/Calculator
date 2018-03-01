package com.example.hp.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b0 ;
    private Button b1 ;
    private Button b2 ;
    private Button b3 ;
    private Button b4 ;
    private Button b5 ;
    private Button b6 ;
    private Button b7 ;
    private Button b8 ;
    private Button b9 ;
    private Button add ;
    private Button sub ;
    private Button mul;
    private Button div;
    private Button dot ;
    private Button eq ;
    private Button sgn ;
    private Button cls ;
    private TextView tf ;

    double firstnum ;
    double secondnum ;
    double result ;
    String ops ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setidView();
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + "9");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(tf.getText().toString() + ".");
            }
        });
        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tf.setText(null);
                firstnum = 0 ;
                secondnum = 0 ;
            }
        });
        //if(tf.getText().length()!=0)//didnt work
        //{
        sgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double c = Double.parseDouble(String.valueOf(tf.getText()));
             //   if(c==0)//didnt work
               //     tf.setText("-");
                //else {
                    c = c * (-1);
                    tf.setText(String.valueOf(c));
                //}
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Double.parseDouble(String.valueOf(tf.getText()));
                //tf.setText(tf.getText()+"+");
                tf.setText(null);
                ops = "+";
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Double.parseDouble(String.valueOf(tf.getText()));
                // tf.setText(tf.getText()+"-");
                tf.setText(null);
                ops = "-";
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Double.parseDouble(String.valueOf(tf.getText()));
                //tf.setText(tf.getText()+"*");
                tf.setText(null);
                ops = "*";
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnum = Double.parseDouble(String.valueOf(tf.getText()));
                //tf.setText(tf.getText()+"/");
                tf.setText(null);
                ops = "/";
            }
        });
            eq.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String ans;
                   // if(firstnum == 0) {
                        result = Double.parseDouble(String.valueOf(tf.getText()));
                        tf.setText("=");
                    //}
                    //else {
                        secondnum = Double.parseDouble(String.valueOf(tf.getText()));

                        switch (ops) {
                            case "+":
                                result = firstnum + secondnum;
                                break;
                            case "-":
                                result = firstnum - secondnum;
                                break;
                            case "*":
                                result = firstnum * secondnum;
                                break;
                            case "/":
                                result = firstnum / secondnum;
                                break;

                        }
                //    }
                    ans = String.valueOf(result);
                    tf.setText(ans);


                }
            });

        }
        //}
    private void setidView()
    {
        b0 = (Button)findViewById(R.id.b0) ;
        b1 = (Button)findViewById(R.id.b1) ;
        b2 = (Button)findViewById(R.id.b2) ;
        b3 = (Button)findViewById(R.id.b3) ;
        b4 = (Button)findViewById(R.id.b4) ;
        b5 = (Button)findViewById(R.id.b5) ;
        b6 = (Button)findViewById(R.id.b6) ;
        b7 = (Button)findViewById(R.id.b7) ;
        b8 = (Button)findViewById(R.id.b8) ;
        b9 = (Button)findViewById(R.id.b9) ;
        add = (Button)findViewById(R.id.badd) ;
        sub = (Button)findViewById(R.id.bsub) ;
        mul = (Button)findViewById(R.id.bmul) ;
        div = (Button)findViewById(R.id.bdiv) ;
        cls = (Button)findViewById(R.id.bcls) ;
        sgn = (Button)findViewById(R.id.bsgn) ;
        eq= (Button)findViewById(R.id.bequal) ;
        tf = (TextView)findViewById(R.id.text) ;
        dot = (Button)findViewById(R.id.bdot) ;
    }
}
