package com.steven.latihan1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class tampilanlinear1 extends AppCompatActivity {


    EditText edittext1;
    Button tombol1;
    TextView textview1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilanlinear1);


        tampilkanText();

    }

        public void tampilkanText(){

            edittext1 = (EditText)findViewById(R.id.edt1NamaPegawai);

            tombol1 = (Button)findViewById(R.id.tbl1);

            textview1 = (TextView)findViewById(R.id.txv1);


            tombol1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String tampilkannamapegawai = edittext1.getText().toString();

                    textview1.setText(tampilkannamapegawai);

                }
            });


        }

}
