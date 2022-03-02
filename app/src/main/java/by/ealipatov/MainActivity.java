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
        // setContentView(R.layout.activity_main);
        //setContentView(R.layout.lesson01);
        setContentView(R.layout.lesson01_input_text);

        EditText textPersonName = findViewById(R.id.textPersonName);
        EditText phone = findViewById(R.id.phone);
        EditText number = findViewById(R.id.number);
        EditText textPassword = findViewById(R.id.textPassword);
        EditText textEmailAdress = findViewById(R.id.textEmailAdress);

        Button buttonOutputData = findViewById(R.id.buttonOutputData);

        TextView result = findViewById(R.id.outputResult);

        buttonOutputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String personName = textPersonName.getText().toString();
                Integer phoneNumber = Integer.valueOf(phone.getText().toString());
                Integer numberPerson = Integer.valueOf(number.getText().toString());
                String passwordPerson = textPassword.getText().toString();
                String emailPerson = textEmailAdress.getText().toString();

                result.setText(personName + phoneNumber.toString());



            }
        });


    }
}