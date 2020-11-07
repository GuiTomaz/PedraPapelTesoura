package com.cursoandroid.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionaPedra(View view){
            defineVencedor("Pedra");
    }

    public void selecionaPapel(View view){
            defineVencedor("Papel");
    }

    public void selecionaTesoura(View view){
            defineVencedor("Tesoura");
    }

    public void defineVencedor(String opcaoJogador){
        int[] imagensIds = {
          R.drawable.papel,
          R.drawable.pedra,
          R.drawable.tesoura

        };

        Random r = new Random();
        int i = r.nextInt(imagensIds.length);
        ImageView opcaoPC = findViewById(R.id.imgInicial);
        opcaoPC.setImageResource(imagensIds[i]);
        TextView resultado = findViewById(R.id.resultado);

        switch(i){
            case 0:
                //PC escolheu papel
                if(opcaoJogador.equals("Papel")){
                    //empate
                    resultado.setText("Empate!");
                }else if(opcaoJogador.equals("Pedra")){
                    //vitoria PC
                    resultado.setText("Você perdeu! =(");
                }else{
                    //vitoria jogador
                    resultado.setText("Você venceu! =D");
                }
                break;
            case 1:
                //PC escolheu pedra
                if(opcaoJogador.equals("Pedra")){
                    //empate
                    resultado.setText("Empate!");
                }else if(opcaoJogador.equals("Papel")){
                    //vitoria jogador
                    resultado.setText("Você venceu! =D");
                }else{
                    //vitoria computador
                    resultado.setText("Você perdeu =(");
                }
                break;
            case 2:
                //PC escolheu tesoura
                if(opcaoJogador.equals("Tesoura")){
                    //empate
                    resultado.setText("Empate!");
                }else if(opcaoJogador.equals("Pedra")){
                    //vitoria jogador
                    resultado.setText("Você venceu! =D");
                }else{
                    //vitoria computador
                    resultado.setText("Você perdeu =(");
                }
                break;
        }
    }
}
