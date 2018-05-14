package com.example.administrator.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends Activity implements View.OnClickListener {
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button equal;
    private Button delete;
    private Button clear;
    private Button point;

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;

    private EditText showtext;
    private EditText showtext2;

    private Button qiehuan;
    private Button bfh;
    private Button genhao;

    private String OperateSum = "";
    private char Operator;
    private double num1 = 0, num2 = 0, sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.night);
        zero = (Button) findViewById(R.id.ling);

        add = (Button) findViewById(R.id.jia);
        subtract = (Button) findViewById(R.id.jian);
        multiply = (Button) findViewById(R.id.cheng);
        divide = (Button) findViewById(R.id.chu);
        delete = (Button) findViewById(R.id.tuige);
        clear = (Button) findViewById(R.id.delete);
        equal = (Button) findViewById(R.id.dengyu);
        point = (Button) findViewById(R.id.dian);
        showtext = (EditText) findViewById(R.id.showtext);
        showtext2 = (EditText) findViewById(R.id.showtext2);
        qiehuan = (Button) findViewById(R.id.qiehuan);
        bfh = (Button) findViewById(R.id.bfh);
        genhao = (Button) findViewById(R.id.genhao);
        showtext.setCursorVisible(false);
        showtext2.setCursorVisible(false);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        equal.setOnClickListener(this);
        delete.setOnClickListener(this);
        clear.setOnClickListener(this);
        point.setOnClickListener(this);
        showtext.setOnClickListener(this);
        showtext2.setOnClickListener(this);
        qiehuan.setOnClickListener(this);
        bfh.setOnClickListener(this);
        genhao.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one:
                OperateSum = AddSum('1');
                showtext.setText(OperateSum);
                break;
            case R.id.two:
                OperateSum = AddSum('2');
                showtext.setText(OperateSum);
                break;
            case R.id.three:
                OperateSum = AddSum('3');
                showtext.setText(OperateSum);
                break;
            case R.id.four:
                OperateSum = AddSum('4');
                showtext.setText(OperateSum);
                break;
            case R.id.five:
                OperateSum = AddSum('5');
                showtext.setText(OperateSum);
                break;
            case R.id.six:
                OperateSum = AddSum('6');
                showtext.setText(OperateSum);
                break;
            case R.id.seven:
                OperateSum = AddSum('7');
                showtext.setText(OperateSum);
                break;
            case R.id.eight:
                OperateSum = AddSum('8');
                showtext.setText(OperateSum);
                break;
            case R.id.night:
                OperateSum = AddSum('9');
                showtext.setText(OperateSum);
                break;
            case R.id.ling:
                OperateSum = AddSum('0');
                showtext.setText(OperateSum);
                break;

            case R.id.jia:
                OperateSum = AddSum('+');
                Operator = '+';       //记录加法
                showtext.setText(OperateSum);
                break;
            case R.id.jian:
                OperateSum = AddSum('-');
                Operator = '-';
                showtext.setText(OperateSum);
                break;
            case R.id.cheng:
                OperateSum = AddSum('×');
                Operator = '×';
                showtext.setText(OperateSum);
                break;
            case R.id.chu:
                OperateSum = AddSum('÷');
                Operator = '÷';
                showtext.setText(OperateSum);
                break;
            case R.id.dian:
                OperateSum = AddSum('.');
                showtext.setText(OperateSum);
                break;
            case R.id.tuige:
                if (OperateSum.length() >= 1)
                {
                    OperateSum = OperateSum.substring(0, OperateSum.length() - 1);
                }
                showtext.setText(OperateSum);
                break;
            case R.id.delete:
                OperateSum = "";
                num1 = 0;
                num2 = 0;
                sum = 0;
                Operator = ' ';
                showtext.setText(OperateSum);
                showtext2.setText(OperateSum);
                break;
            case R.id.dengyu:
                if (CheckInput(OperateSum))
                {
                    Log.v("opppppppppppp",OperateSum);
                    //  OperateSum=OperateSum+"="+String.valueOf(equals(OperateSum));
                    OperateSum = String.valueOf(equals(OperateSum));
                    showtext2.setText(OperateSum);
                    OperateSum = String.valueOf(sum);
                } else {
                    showtext2.setText("输入不合理");
                    //  Toast.makeText(this,"Error", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.qiehuan:

                if (zhuanhuan(OperateSum)) {
                    int a = Integer.parseInt(OperateSum);
                    a = 0 - a;
                    Log.v("O", OperateSum);
                    String b = String.valueOf(a);
                    showtext2.setText(b);
                    OperateSum = String.valueOf(b);
                } else {
                    showtext2.setText("输入不合理");
                    //  Toast.makeText(this,"Error", Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.genhao:


               // Log.v("aaaa", "aaaaaaa");

                if (zhuanhuan(OperateSum)) {
                    double a = Integer.parseInt(OperateSum);
                    if (a >= 0) {
                        a = Math.sqrt(a);
                        Log.v("O", OperateSum);
                        String b = String.valueOf(a);
                        showtext2.setText(b);
                        OperateSum = String.valueOf(b);
                    } else {
                        Toast.makeText(MainActivity.this, "输入错误", Toast.LENGTH_LONG).show();
                        showtext2.setText("负数不可开方");
                    }
                } else {
                    showtext2.setText("请输入数字");
                }


                break;
            case R.id.bfh:
                //Toast.makeText(MainActivity.this,"输入错误",Toast.LENGTH_LONG).show();
                //showtext.setText("%");
                if (zhuanhuan(OperateSum)) {
                    double a = Integer.parseInt(OperateSum);

                    a = a / 100;
                    Log.v("O", OperateSum);
                    String b = String.valueOf(a);
                    showtext2.setText(b);
                    OperateSum = String.valueOf(b);
                } else {
                    showtext2.setText("请输入数字");
                }


            default:
                break;

        }
    }

    public String AddSum(char c) {
        OperateSum = OperateSum + String.valueOf(c);
        return OperateSum;
    }

    public boolean zhuanhuan(String OperateSum) {
        if (OperateSum.length() < 2) {
            return true;
        }
        if (OperateSum.length() > 3) {
            return false;
        }

        return true;
    }

    public boolean CheckInput(String OperateSum)
    {
        if (OperateSum.length() == 2)
        {
            return false;
        }
        if (OperateSum.length() == 1) {
            return true;
        }
        if (OperateSum.indexOf(Operator, 1) == -1) {
            return false;
        }

        if (OperateSum.endsWith(String.valueOf(Operator))) {
            return false;
        }

        int indexOfOperator = 0;
        indexOfOperator = OperateSum.indexOf(Operator, 1);
        if (OperateSum.length() >= 3) {
            num1 = Double.parseDouble(OperateSum.substring(0, indexOfOperator));
            num2 = Double.parseDouble(OperateSum.substring(indexOfOperator + 1, OperateSum.length()));
        }
        if (num2 == 0) {
            //    showtext.setText("输入不合理");
            return false;
        }

        return true;
    }

    public double equals(String OperateSum) {
        int indexOfOperator = 0;
        indexOfOperator = OperateSum.indexOf(Operator, 1);
        if (OperateSum.length() >= 3) {
            num1 = Double.parseDouble(OperateSum.substring(0, indexOfOperator));
            num2 = Double.parseDouble(OperateSum.substring(indexOfOperator + 1, OperateSum.length()));


            switch (Operator) {
                case '+':
                    sum = num1 + num2;

                    break;
                case '-':
                    sum = num1 - num2;

                    break;
                case '×':
                    sum = num1 * num2;

                    break;
                case '÷':
                    if (num2 == 0) {
                        sum = 0000000000;
                        Toast.makeText(this, "输入错误", Toast.LENGTH_SHORT).show();
                    } else {
                        sum = num1 / num2;
                    }
                    break;


                default:
                    break;
            }
            return sum;
        } else  if(OperateSum.length()<3){
          // num1 = Double.parseDouble(OperateSum.substring(0, indexOfOperator));
            num1 = Double.parseDouble(OperateSum);


                    Log.v("===", "=======");
                    sum = num1;


        }
        return sum;

    }
}