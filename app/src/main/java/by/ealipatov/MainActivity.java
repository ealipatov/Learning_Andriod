package by.ealipatov;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView screen;
    private TextView memory;
    private StringBuilder buf;
    private Double res = null;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);
        memory = findViewById(R.id.memory);
        buf = new StringBuilder();
        CalculateResultat calculate = new CalculateResultat();
        OperatorKeyHandler calculateOperatorKey = new OperatorKeyHandler();

// обработка нажатия на числовые кнопки
        View.OnClickListener clickListener = new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.key_0:
                        buf.append(0);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 0");
                        break;

                    case R.id.key_1:
                        buf.append(1);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 1");
                        break;

                    case R.id.key_2:
                        buf.append(2);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 2");
                        break;

                    case R.id.key_3:
                        buf.append(3);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 3");
                        break;

                    case R.id.key_4:
                        buf.append(4);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 4");
                        break;

                    case R.id.key_5:
                        buf.append(5);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 5");
                        break;

                    case R.id.key_6:
                        buf.append(6);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 6");
                        break;

                    case R.id.key_7:
                        buf.append(7);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 7");
                        break;

                    case R.id.key_8:
                        buf.append(8);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 8");
                        break;

                    case R.id.key_9:
                        buf.append(9);
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша 9");
                        break;
// Нажатие на кнопку точка
                    case R.id.key_dot:

                        if (!String.valueOf(buf).contains(".")) {
                            buf.append(".");
                        }

                        showBuf(String.valueOf(buf));
                        logEvent("клавиша dot");
                        break;
// Нажатие на кнопку очистить
                    case R.id.key_clear:
                        if (buf.length() > 0)
                            buf.deleteCharAt(buf.length() - 1);
                        else res = null;
                        showRes(String.valueOf(res));
                        showBuf(String.valueOf(buf));
                        logEvent("клавиша del");
                        break;
// Нажатие на кнопку сложение
                    case R.id.key_sum:
                        operator = "+";

                        res = calculateOperatorKey.resKey(operator, res, buf);
                        showRes(res + " " + operator);

                        buf.delete(0, buf.length());
                        showBuf(String.valueOf(buf));

                        logEvent("клавиша sum");
                        break;
// Нажатие на кнопку минус
                    case R.id.key_diff:
                        operator = "-";

                        res = calculateOperatorKey.resKey(operator, res, buf);
                        showRes(res + " " + operator);

                        buf.delete(0, buf.length());
                        showBuf(String.valueOf(buf));

                        logEvent("клавиша diff");
                        break;
// Нажатие на кнопку умножение
                    case R.id.key_mult:
                        operator = "*";

                        res = calculateOperatorKey.resKey(operator, res, buf);
                        showRes(res + " " + operator);

                        buf.delete(0, buf.length());
                        showBuf(String.valueOf(buf));

                        logEvent("клавиша mult");
                        break;
// Нажатие на кнопку деление
                    case R.id.key_div:
                        operator = "/";

                        res = calculateOperatorKey.resKey(operator, res, buf);
                        showRes(res + " " + operator);

                        buf.delete(0, buf.length());
                        showBuf(String.valueOf(buf));

                        logEvent("клавиша div");
                        break;
// Нажатие на кнопку процент
                    case R.id.key_proc:
                        operator = "%";

                        res = calculateOperatorKey.resKey(operator, res, buf);
                        showRes(res + " " + operator);

                        buf.delete(0, buf.length());
                        showBuf(String.valueOf(buf));

                        logEvent("клавиша perc");
                        break;

// Нажатие на кнопку равно
                    case R.id.key_res:
                        if (operator != null) {

                            res = calculate.res(operator, res, buf);
                            showRes(String.valueOf(res));
                            buf.delete(0, buf.length());
                            showBuf(String.valueOf(buf));

                            //operator = "=";


                        }

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
        findViewById(R.id.key_dot).setOnClickListener(clickListener);

        findViewById(R.id.key_sum).setOnClickListener(clickListener);
        findViewById(R.id.key_diff).setOnClickListener(clickListener);

        findViewById(R.id.key_mult).setOnClickListener(clickListener);
        findViewById(R.id.key_div).setOnClickListener(clickListener);

        findViewById(R.id.key_proc).setOnClickListener(clickListener);

        findViewById(R.id.key_res).setOnClickListener(clickListener);


    }

    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("OPERATOR", operator);
        if (res != null)
            outState.putDouble("RESULT", res);
        outState.putString("BUF", String.valueOf(buf));

        super.onSaveInstanceState(outState);
    }

    // получение ранее сохраненного состояния
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        operator = savedInstanceState.getString("OPERATOR");
        res = savedInstanceState.getDouble("RESULT");
        buf.append(savedInstanceState.getString("BUF"));
        showBuf(String.valueOf(buf));
        if (operator != null)
            showRes(res + " " + operator);
    }

    /**
     * выводим данные на экран из "буфера", то что в данный момент вводит пользователь
     *
     * @param s
     */
    private void showBuf(String s) {
        screen.setText(s);
    }

    /**
     * Выводим данные результата вычислений
     *
     * @param s
     */
    private void showRes(String s) {
        if (s == "null")
            s = "";
        memory.setText(s);
    }

    /**
     * Логируем нажатие кнопок
     *
     * @param event
     */
    private void logEvent(String event) {
        Log.d("CalcLog", event);
    }
}