package com.example.pedra_papel_tesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int bound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.mostrarResultado(0);
    }

    public void selecionadoPapel(View view){
        this.mostrarResultado(1);
    }

    public void selecionadoTesoura(View view){
        this.mostrarResultado(2);
    }

    public void mostrarResultado(int opcUsuario){
        int app = this.opcaoDoAPP();
        TextView resultado = findViewById(R.id.resultado);

        if((app == 0 && opcUsuario == 1) || (app == 1 && opcUsuario == 2) || (app == 2 && opcUsuario == 0)){
            resultado.setText("Você Venceu! :D");
        } else if((app == 0 && opcUsuario == 0) || (app == 1 && opcUsuario == 1 ) || (app == 2 && opcUsuario == 2)){
            resultado.setText("Empatou! :/");
        } else{
            resultado.setText("Você Perdeu :(");
        }
    }

    public int opcaoDoAPP(){
        int opcao = new Random().nextInt(3);
        ImageView apresentarResultado = findViewById(R.id.escolha);

        switch(opcao){
            case 0:
                apresentarResultado.setImageResource(R.drawable.pedra);
             break;
            case 1:
                apresentarResultado.setImageResource(R.drawable.papel);
                break;
            case 2:
                apresentarResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        return opcao;
    }
}
