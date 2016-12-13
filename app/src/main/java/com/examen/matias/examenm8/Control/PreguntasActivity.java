package com.examen.matias.examenm8.Control;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.examen.matias.examenm8.MainActivity;
import com.examen.matias.examenm8.R;

import java.util.Random;

public class PreguntasActivity extends AppCompatActivity implements View.OnClickListener {


    TextView tvPregunta, tvMostrarPreguntas;
    EditText respuestas;
    int pregunta5, pregunta10, pregunta20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);
        //String[] preguntasSuma, preguntasResta, preguntasMulti, preguntasDiv, preguntasGen;


        //preguntasSuma = getResources().getStringArray(R.array.arrPreguntasSuma);
       /* preguntasResta = getResources().getStringArray(R.array.arrPreguntasResta);
        preguntasMulti = getResources().getStringArray(R.array.arrPreguntasMulti);
        preguntasDiv = getResources().getStringArray(R.array.arrPreguntasDiv);
        preguntasGen = getResources().getStringArray(R.array.arrPreguntasGen);
*/
        //Random aleatorio = new Random();
        //int numAle = aleatorio.nextInt(preguntasSuma.length);

        //Recuperamos los putExtra de la otra activity y comprovamos que tema ha escogido
        // si "preguntas" es 5-10-20 rellenamos el array con ese tamaño de preguntas (5-10-20):
        //Después mostramos las X preguntas dependiendo de la seleccion establecida y el array del tema
        //escogido.

        //Creamos un contador de aciertos y fallos que cuando la respuesta no es igual que la que deberia ser
        // se sume uno al contadorFallo, y si es cierta, se sume 1 al contadorAcierto.

        //en caso de que la seleccion sea preguntas de tema "sumar", se seteara el texvView con una
        // pregunta de ese array mostrandolo en pantalla.

        //tvMostrarPreguntas.setText(preguntasSuma[numAle]);
    }

    @Override
    public void onClick(View view) {
        //Iniciamos el tercero layout
        //Intent intentResultados = new Intent(this, ResultadosActivity.class);

        //startActivity(intentResultados);
        //finish();
    }
}
