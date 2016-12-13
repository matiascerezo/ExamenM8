package com.examen.matias.examenm8;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.examen.matias.examenm8.Control.PreguntasActivity;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvNombre, tvTema, tvNumPreg;
    EditText etNombre;
    RadioButton rb5, rb10, rb20;
    Spinner spinnerTema;
    Button emTest;
    String recogerNombre;

    @Override
    public void onClick(View view) {
        Intent intentPreguntas = new Intent(this, PreguntasActivity.class);
        intentPreguntas.putExtra("nombre", ((EditText) findViewById(R.id.etNombre)).getText().toString());
        intentPreguntas.putExtra("preguntas", recogerValorRadioButton());

        startActivity(intentPreguntas);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNombre = (TextView) findViewById(R.id.tvNombre);
        tvTema = (TextView) findViewById(R.id.tvTema);
        tvNumPreg = (TextView) findViewById(R.id.tvNumPreg);
        etNombre = (EditText) findViewById(R.id.etNombre);
        recogerNombre = etNombre.getText().toString();

        spinnerTema = (Spinner) findViewById(R.id.spinnerTema);

        rb5 = (RadioButton) findViewById(R.id.rb5);
        rb10 = (RadioButton) findViewById(R.id.rb10);
        rb20 = (RadioButton) findViewById(R.id.rb20);
        emTest = (Button) findViewById(R.id.buttonMain);
        emTest.setOnClickListener(this);

        String[] listaTemas = getResources().getStringArray(R.array.spTema);
        ArrayAdapter<String> adapterTemas;
        adapterTemas = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listaTemas);
        adapterTemas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerTema.setAdapter(adapterTemas);
        spinnerTema.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public int recogerValorRadioButton() {

        int rbChecked = 0;
        if (((RadioButton) findViewById(R.id.rb5)).isChecked()) {
            rbChecked = 5;
        } else if (((RadioButton) findViewById(R.id.rb10)).isChecked()) {
            rbChecked = 10;
        } else if (((RadioButton) findViewById(R.id.rb20)).isChecked()) {
            rbChecked = 20;
        } else {
            rbChecked = 0;
        }
        return rbChecked;
    }
}

