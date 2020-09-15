package com.tutorial.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText amountEdt;

    public void convertFunc(View view) {
        amountEdt = findViewById(R.id.editTextNumber);
        Double parseAmountToDouble = Double.parseDouble(amountEdt.getText().toString());
        Double convertToRupiah = parseAmountToDouble * 14952;

        Locale localeID = new Locale("in", "ID");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(localeID);

        Toast.makeText(this, "Rp " +  numberFormat.format(convertToRupiah), Toast.LENGTH_LONG).show();

        Log.i("Info Amount", amountEdt.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}