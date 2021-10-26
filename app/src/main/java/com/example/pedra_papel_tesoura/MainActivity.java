package com.example.pedra_papel_tesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int bound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        this.opcaoEscolhidaPeloUsuario(0);
    }

    public void selecionadoPapel(View view){
        this.opcaoEscolhidaPeloUsuario(1);
    }

    public void selecionadoTesoura(View view){
        this.opcaoEscolhidaPeloUsuario(2);
    }

    public void opcaoEscolhidaPeloUsuario(int opcao){
        
    }

    public void opcaoDoAPP(){
        int opcao = new Random().nextInt(3);
        ImageView apresentarResultado = findViewById(R.id.escolha);

        switch(opcao){
            case 0:
                apresentarResultado.setImageResource(R.drawable.papel);
             break;
            case 1:
                apresentarResultado.setImageResource(R.drawable.pedra);
                break;
            case 2:
                apresentarResultado.setImageResource(R.drawable.tesoura);
                break;
        }
    }
}
