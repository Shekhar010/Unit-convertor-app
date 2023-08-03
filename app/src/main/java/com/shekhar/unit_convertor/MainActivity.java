package com.shekhar.unit_convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // functionality for button
        EditText edit_text = (EditText) findViewById(R.id.editTextNumberDecimal);
        TextView text_view2 = (TextView) findViewById(R.id.textView8);
        Button button_1 = (Button) findViewById(R.id.button);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edit_text.getText().toString().trim().length() > 0) {
                    Toast.makeText(MainActivity.this, "Successfull", Toast.LENGTH_SHORT).show();
                    String a = String.valueOf(edit_text.getText());
                    float b = Float.valueOf(a);
                    float c = b * 1000;
                    text_view2.setText(c + "");
                } else {
                    Toast.makeText(MainActivity.this, "Enter the value", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

}