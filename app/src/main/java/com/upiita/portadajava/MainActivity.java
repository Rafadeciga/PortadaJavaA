package com.upiita.portadajava;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencias a los LinearLayouts en el layout XML
        LinearLayout ll1v = findViewById(R.id.ll1vert);
        LinearLayout ll1h = findViewById(R.id.ll2horz);

        // Establecer colores de fondo para los LinearLayouts
        ll1h.setBackgroundColor(Color.rgb(240, 240, 240));
        ll1v.setBackgroundColor(Color.rgb(113, 28, 69));

        // Creación de TextView y ImageView para la primera línea
        TextView txt1 = new TextView(this);
        ImageView imag1 = new ImageView(this);
        ImageView imag2 = new ImageView(this);

        // Establecer parámetros para las vistas
        LinearLayout.LayoutParams par_imag1 = new LinearLayout.LayoutParams(0, 200);
        LinearLayout.LayoutParams par_imag2 = new LinearLayout.LayoutParams(0, 200);
        LinearLayout.LayoutParams par_txt1 = new LinearLayout.LayoutParams(0, ViewGroup.LayoutParams.WRAP_CONTENT);
        par_txt1.weight = 3;
        par_imag1.weight = 1;
        par_imag2.weight = 1;
        par_txt1.setMargins(0, 20, 0, 0);
        par_imag1.setMargins(0, 20, 0, 0);
        par_imag2.setMargins(0, 20, 0, 0);
        imag1.setLayoutParams(par_imag1);
        imag2.setLayoutParams(par_imag2);
        txt1.setLayoutParams(par_txt1);

        // Establecer atributos para las vistas
        imag1.setImageResource(R.drawable.logo_ipn);
        txt1.setText("Instituto Politécnico Nacional");
        txt1.setTextSize(25);
        txt1.setGravity(Gravity.CENTER);
        txt1.setTextColor(Color.rgb(113, 28, 69));

        // Establecer atributos para las vistas
        imag2.setImageResource(R.drawable.logo_upiita);
        txt1.setText("Instituto Politécnico Nacional");
        txt1.setTextSize(25);
        txt1.setGravity(Gravity.CENTER);
        txt1.setTextColor(Color.rgb(113, 28, 69));

        // Agregar vistas a LinearLayout horizontal
        ll1h.addView(imag1);
        ll1h.addView(txt1);
        ll1h.addView(imag2);

        // Creación y configuración de TextView para la segunda línea
        TextView txt2 = new TextView(this);
        txt2.setText("Unidad Profesional Interdisciplinaria en Ingeniería y Tecnologías Avanzadas");
        txt2.setTextSize(25);
        txt2.setGravity(Gravity.CENTER);
        txt2.setTextColor(Color.WHITE);

        // Agregar TextView a LinearLayout vertical
        ll1v.addView(txt2);

        // Creación y configuración de ImageView para la tercera línea
        LinearLayout.LayoutParams par_imag3 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 300);
        ImageView imag3 = new ImageView(this);
        imag3.setLayoutParams(par_imag3);
        imag3.setImageResource(R.drawable.logo_lugar);

        // Agregar ImageView a LinearLayout vertical
        ll1v.addView(imag3);

        // Creación y configuración de TextView para la cuarta línea
        TextView txt3 = new TextView(this);
        txt3.setText("Programación de dispositivos móviles");
        txt3.setTextSize(25);
        txt3.setGravity(Gravity.CENTER);
        txt3.setTextColor(Color.rgb(113, 28, 69));
        txt3.setBackgroundColor(Color.rgb(240, 240, 240));
        txt3.append("\nGrupo:2TM9");

        // Agregar TextView a LinearLayout vertical
        ll1v.addView(txt3);

        // Creación y configuración de TextView para la quinta línea
        TextView txt4 = new TextView(this);
        txt4.setText("\nComo que 5 no sube ha 10 >:3");
        txt4.setTextSize(25);
        txt4.setGravity(Gravity.CENTER);
        txt4.setTextColor(Color.rgb(240, 240, 240));

        // Agregar TextView a LinearLayout vertical
        ll1v.addView(txt4);

        // Creación y configuración de ImageView para la sexta línea
        LinearLayout.LayoutParams par_imag4 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 800);
        par_imag4.setMargins(0, 50, 0, 30);
        ImageView imag4 = new ImageView(this);
        imag4.setLayoutParams(par_imag4);
        imag4.setImageResource(R.drawable.gato);

        // Agregar ImageView a LinearLayout vertical
        ll1v.addView(imag4);
    }
}
