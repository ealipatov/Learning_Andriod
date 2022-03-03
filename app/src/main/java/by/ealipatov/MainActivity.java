package by.ealipatov;

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

        // "Находим" все наши данные.
        EditText textPersonName = findViewById(R.id.textPersonName);
        EditText phone = findViewById(R.id.phone);
        EditText number = findViewById(R.id.number);
        EditText textPassword = findViewById(R.id.textPassword);
        EditText textEmailAdress = findViewById(R.id.textEmailAdress);

        Button buttonOutputData = findViewById(R.id.buttonOutputData);

        TextView result = findViewById(R.id.outputResult);
        //Определяем действие при нажатии на кнопку.
        buttonOutputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Присваиваем переменным значения из введенных полей.

                String personName = textPersonName.getText().toString();
                Integer phoneNumber = 0;
                Integer numberPerson = 0;

                try {
                    if(!(phone.getText().length() == 0))
                        phoneNumber = Integer.valueOf(phone.getText().toString());

                    if(!(number.getText().length() == 0))
                        numberPerson = Integer.valueOf(number.getText().toString());
                }
                catch (NumberFormatException e){
                    e.printStackTrace();
                }

                String passwordPerson = textPassword.getText().toString();
                String emailPerson = textEmailAdress.getText().toString();

                //Выводим на экран введенное имя и телефон
                result.setText(personName + " " + phoneNumber.toString());

            }
        });


    }
}