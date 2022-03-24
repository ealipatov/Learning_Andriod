package by.ealipatov;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView screen;
    StringBuilder buf;
    Double res = 0.0;
    String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
        buf = new StringBuilder();


        screen.setText("0");
        // обработка нажатия на числовую кнопку
        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.key_0:
                        buf.append("0");
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 0");
                        break;

                    case R.id.key_1:
                        buf.append(1);
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 1");
                        break;

                    case R.id.key_2:
                        buf.append(2);
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 2");
                        break;

                    case R.id.key_3:
                        buf.append(3);
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 3");
                        break;

                    case R.id.key_4:
                        buf.append(4);
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 4");
                        break;

                    case R.id.key_5:
                        buf.append(5);
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 5");
                        break;

                    case R.id.key_6:
                        buf.append(6);
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 6");
                        break;

                    case R.id.key_7:
                        buf.append(7);
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 7");
                        break;

                    case R.id.key_8:
                        buf.append(8);
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 8");
                        break;

                    case R.id.key_9:
                        buf.append(9);
                        showResult(String.valueOf(buf));
                        logEvent("клавиша 9");
                        break;

                    case R.id.key_clear:
                        if(buf.length()>0)
                        buf.deleteCharAt(buf.length()-1);
                        else res = 0.0;
                        showResult(String.valueOf(buf));
                        logEvent("клавиша del");
                        break;

                    case R.id.key_sum:
                        operator = "+";
                        if(res == 0.0 && buf.length()>0)
                            res = Double.valueOf(String.valueOf(buf));
                        else
                            res += res;

                            buf.delete(0, buf.length());
                            showResult(String.valueOf(res));

                        logEvent("клавиша sum");
                        break;

                    case R.id.key_diff:
                        operator = "-";
                        if(res == 0.0 && buf.length()>0)
                            res = Double.valueOf(String.valueOf(buf));
                        else
                            res -= res;

                            buf.delete(0, buf.length());
                            showResult(String.valueOf(res));

                        logEvent("клавиша diff");
                        break;

                    case R.id.key_mult:
                        operator = "*";
                        if(res == 0.0 && buf.length()>0)
                            res = Double.valueOf(String.valueOf(buf));
                        else
                            res *= res;

                            buf.delete(0, buf.length());
                            showResult(String.valueOf(res));

                        logEvent("клавиша mult");
                        break;

                    case R.id.key_div:
                        operator = "/";
                        if(res == 0.0 && buf.length()>0)
                            res = Double.valueOf(String.valueOf(buf));
                        else
                            res /= res;

                            buf.delete(0, buf.length());
                            showResult(String.valueOf(res));

                        logEvent("клавиша div");
                        break;

                    case R.id.key_perc:
                        operator = "%";
                       if(res == 0.0)
                            res = Double.valueOf(String.valueOf(buf));

                         else
                            res = 0.0;

                            buf.delete(0, buf.length());
                            showResult(String.valueOf(buf));

                        logEvent("клавиша perc");
                        break;

                    case R.id.key_res:

                        switch (operator){
                            case "+":
                                if(buf.length()>0)
                                    res += Double.parseDouble(String.valueOf(buf));
                                else
                                    res += res;

                                buf.delete(0, buf.length());
                                showResult(String.valueOf(res));


                                break;

                            case "-":
                                if(buf.length()>0)
                                    res -= Double.parseDouble(String.valueOf(buf));
                                else
                                    res -= res;

                                buf.delete(0, buf.length());
                                showResult(String.valueOf(res));


                                break;

                            case "*":
                                if(buf.length()>0)
                                    res *= Double.parseDouble(String.valueOf(buf));
                                else
                                    res *= res;

                                buf.delete(0, buf.length());
                                showResult(String.valueOf(res));


                                break;

                            case "/":
                                if(buf.length()>0)
                                    res /= Double.parseDouble(String.valueOf(buf));
                                else
                                    res /= res;

                                buf.delete(0, buf.length());
                                showResult(String.valueOf(res));


                                break;

                            case "%":
                                if(buf.length()>0)
                                    res = (res * Double.parseDouble(String.valueOf(buf)))/100;
                                else
                                    res = 0.0;

                                buf.delete(0, buf.length());
                                showResult(String.valueOf(res));

                                break;

                    }
                        logEvent("клавиша perc");
                        break;


                }
            }
        };

        findViewById(R.id.key_0).setOnClickListener(clickListener);
        findViewById(R.id.key_1).setOnClickListener(clickListener);
        findViewById(R.id.key_2).setOnClickListener(clickListener);
        findViewById(R.id.key_3).setOnClickListener(clickListener);
        findViewById(R.id.key_4).setOnClickListener(clickListener);
        findViewById(R.id.key_5).setOnClickListener(clickListener);
        findViewById(R.id.key_6).setOnClickListener(clickListener);
        findViewById(R.id.key_7).setOnClickListener(clickListener);
        findViewById(R.id.key_8).setOnClickListener(clickListener);
        findViewById(R.id.key_9).setOnClickListener(clickListener);

        findViewById(R.id.key_clear).setOnClickListener(clickListener);

        findViewById(R.id.key_sum).setOnClickListener(clickListener);
        findViewById(R.id.key_diff).setOnClickListener(clickListener);

        findViewById(R.id.key_mult).setOnClickListener(clickListener);
        findViewById(R.id.key_div).setOnClickListener(clickListener);

        findViewById(R.id.key_res).setOnClickListener(clickListener);


    }

    private void showResult (String s) {
        screen.setText(s);
    }

    private void logEvent(String event) {
        Log.d("CalcLog", event);
    }
}