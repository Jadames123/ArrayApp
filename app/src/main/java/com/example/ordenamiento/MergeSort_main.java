package com.example.ordenamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MergeSort_main extends AppCompatActivity {
    String TAG = "";
    private TextView num1, num2, num3, num4, num5, num6, num7, show_arreglo;
    private Button sort;
    int uno, dos, tres, cuatro, cinco, seis, siete;
    String cadena = "";
    String cadena1 = "";
    boolean BtnIsEnable = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.txt_one);
        num2 = findViewById(R.id.txt_two);
        num3 = findViewById(R.id.txt_three);
        num4 = findViewById(R.id.txt_four);
        num5 = findViewById(R.id.txt_five);
        num6 = findViewById(R.id.txt_six);
        num7 = findViewById(R.id.txt_seven);
        sort = findViewById(R.id.sort);
        show_arreglo = findViewById(R.id.show_arreglo);

        uno = Integer.parseInt(num1.getText().toString());
        dos = Integer.parseInt(num2.getText().toString());
        tres = Integer.parseInt(num3.getText().toString());
        cuatro = Integer.parseInt(num4.getText().toString());
        cinco = Integer.parseInt(num5.getText().toString());
        seis = Integer.parseInt(num6.getText().toString());
        siete = Integer.parseInt(num7.getText().toString());


    }

    //Clase que hace la separacion del arreglo

    public void Ejecutar(View view) {

        int array[] = {uno, dos, tres, cuatro, cinco, seis, siete};
        int box = 0;
        boolean comp = false;

        for(int x = 0; x<array.length; x++)
        {
            for(int j = 0; j<array.length - 1; j++)
            {
                if(array[j] > array[j+1])
                {
                    box = array[j];
                    array[j] = array[j+1];
                    array[j+1] = box;
                    comp = true;
                }
            }
        }

        //convinar.sort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {

            cadena = cadena + array[i];

            //Log.d(TAG, "Ejecutar: " + cadena);
        }

        show_arreglo.setText(cadena);

        sort.setEnabled(false);
    }

    //MergeSort2 convinar = new MergeSort2();
}