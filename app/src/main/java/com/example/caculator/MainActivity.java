package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    String input, answer;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // anh xa
        textView = (TextView) findViewById(R.id.tview1);

    }

    public void Buttonclick(View view) {
        Button button = (Button) view;
        String data = button.getText().toString();

        switch (data) {
            case "AC":
                input = "";
                break;
            case "C":
                input = "";
//                if (input.length()> 0) {
//                    String newText = input.substring(0,input.length()-1);
//                    input = newText;
//                }
                break;
            case "=":
                answer = input;
                result();
                break;
            case "x":
                input+="*";
                result();
                break;
            case "+/-":
                input = "-";


//                if (input.length()>0) {
//                    String string = input.substring(0, input.length()-1);
//                    input=string;
//                }
                break;
            case "%":
//                input="%";
//                String string =
                break;
//            case ",":
//                input=",";
//                Solve();
//                break;
            default:
                if ((input==null)) {
                    input="";
                }
                if (data.equals("+")||data.equals("-")||data.equals("/")||data.equals("%")) {
                    // in ket qua
                    result();
                }
                input+=data;
        }
        textView.setText(input);
    }
    public void result() {
        if (input.split("\\*").length==2) {
            String  number[] = input.split("\\*");
            try {
//                double mull = Double.parseDouble(number[-1])*Double.parseDouble(number[1]);
                double mul = Double.parseDouble(number[0])*Double.parseDouble(number[1]);
                input= mul+"";
            }catch (Exception e) {

            }
        }
        if (input.split("\\/").length==2) {
            String number[] = input.split("\\/");
            try {
                double chia = Double.parseDouble(number[0])/Double.parseDouble(number[1]);
                input= chia+"";
            }catch (Exception e) {

            }
        }
        if (input.split("\\+").length==2) {
            String number[] = input.split("\\+");
            try {
                double sum = Double.parseDouble(number[0])+Double.parseDouble(number[1]);
                input= sum+"";
            }catch (Exception e) {

            }
        }
        if (input.split("\\-").length==2) {
            String number[] = input.split("\\-");
            try {
                double hieu = Double.parseDouble(number[0])-Double.parseDouble(number[1]);
                input= hieu+"";
            }catch (Exception e) {

            }
        }

//        if (input.split("\\%").length==2) {
//            String number[] = input.split("\\%");
//            double tex1 =
//
//            try {
//                double tex = Double.parseDouble(number [1])/Double.parseDouble(number[100]);
//                input=tex+"";
//            }catch (Exception e) {
//
//            }
    //    }
//        if (input.split("\\+/-").length==2) {
//            String number[] = input.split("\\");
//            try {
//
//                double hieu = Double.parseDouble(number[0])-Double.parseDouble(number[1]);
//                input= hieu+"";
//            }catch (Exception e) {
//
//            }
//        }


        String n[] = input.split("\\.");
        if (n.length >1) {
            if (n[1].equals("0")) {
                input=n[0];
            }
        }
    }
}