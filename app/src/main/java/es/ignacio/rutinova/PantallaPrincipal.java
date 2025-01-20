package es.ignacio.rutinova;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

public class PantallaPrincipal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pantalla_principal);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void visibilidadHoy (View view){
        RecyclerView rv = findViewById(R.id.ListadoHabitosHoy);
        TextView text1 = findViewById(R.id.TextParaHoy);
        if (rv.getVisibility() == View.GONE){
            rv.setVisibility(View.VISIBLE);
            text1.setText(R.string.paraHoyAbajo);
        }else {
            rv.setVisibility(View.GONE);
            text1.setText(R.string.paraHoyLado);
        }
    }

    public void visibilidadManana (View view){
        RecyclerView rv = findViewById(R.id.ListadoHabitosManana);
        TextView text2 = findViewById(R.id.TextParamanana);
        if (rv.getVisibility() == View.GONE){
            rv.setVisibility(View.VISIBLE);
            text2.setText(R.string.paraMananaAbajo);
        }else {
            rv.setVisibility(View.GONE);
            text2.setText(R.string.paraMananaLado);
        }

    }

    public void visibilidadOtro (View view){
        RecyclerView rv = findViewById(R.id.ListadoHabitosOtroDia);
        TextView text3 = findViewById(R.id.TextOtroDia);
        if (rv.getVisibility() == View.GONE){
            rv.setVisibility(View.VISIBLE);
            text3.setText(R.string.paraOtroAbajo);
        }else {
            rv.setVisibility(View.GONE);
            text3.setText(R.string.paraOtroLado);
        }

    }
    public void perfilusuario (View view){
        Intent init = new Intent(this, PerfilDeUsuario.class);
        startActivity(init);
    }

    public void anadirhabito (View view){
        Intent init2 = new Intent(this, RegistroNuevoHabito1.class);
        startActivity(init2);
    }

}