package com.example.ca.jokenpobymonsterkidd;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ca.jokenpobymonsterkidd.R;

public class MainActivity extends Activity {
    int placarJogador = 0 ;
    int placarComputador = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_inicial);
    }
    public void pedra(View view){
        int escolhaComputador = ( int )(Math. random()* 3 ) + 1 ; //gerar numeros randomicos de 1 á 3
        if (escolhaComputador == 1 ) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);
            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
            Toast.makeText(MainActivity.this, "Empate!!" ,
                    Toast.LENGTH_LONG).show(); //gera um tost
        }
        else if (escolhaComputador == 2 ){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);
            ImageView img2 = (ImageView)findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
            Toast.makeText(MainActivity.this, "Padre Mata Lobisomem. O Computador ganha 1 ponto!" ,
                    Toast.LENGTH_LONG).show(); //gera um tost
            placarComputador ++;
            TextView pontos = (TextView)findViewById(R.id.placarComputador);
            pontos.setText(String. valueOf( this.placarComputador ));
//converte um valor numerico pra string
        }
        else if (escolhaComputador == 3 ){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);
            ImageView img2 = (ImageView)
                    findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
            Toast.makeText(MainActivity.this, "Lobisomem Mata Camponesa. O Jogador Ganha 1 Ponto!" ,
                    Toast.LENGTH_LONG).show(); //gera um tost
            placarJogador ++;
            TextView pontos =
                    (TextView)findViewById(R.id.placarJogador);
            pontos.setText(String. valueOf(this.placarJogador ));
        }
    }
    public void tesoura (View view){
        int escolhaComputador = ( int )(Math. random()* 3 ) + 1 ; //gerar numeros randomicos de 1 á 3
        if (escolhaComputador == 1 ) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);
            ImageView img2 = (ImageView)
                    findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
            Toast.makeText(MainActivity.this, "Lobisomem Mata Camponesa. O Computador Ganha 1 Ponto!" ,
                    Toast.LENGTH_LONG).show(); //gera um tost
            placarComputador ++;
            TextView pontos =
                    (TextView)findViewById(R.id.placarComputador);
            pontos.setText(String. valueOf( this.placarComputador ));
        }
        else if (escolhaComputador == 2 ){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);
            ImageView img2 = (ImageView)
                    findViewById(R.id. computador);
            img2.setImageResource(R.drawable.papel);
            Toast.makeText(MainActivity.this, "Camponesa Seduz Padre. O Jogador Ganha 1 Ponto!" ,
                    Toast.LENGTH_LONG).show(); //gera um tost
            placarJogador ++;
            TextView pontos = (TextView)
                    findViewById(R.id. placarJogador);
            pontos.setText(String. valueOf( this.placarJogador ));
        }
        else if (escolhaComputador == 3 ){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);
            ImageView img2 = (ImageView)
                    findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
            Toast.makeText(MainActivity.this, "Empate!!" ,
                    Toast.LENGTH_LONG).show(); //gera um tost
        }
    }
    public void papel (View view){
        int escolhaComputador = ( int )(Math. random()* 3 ) + 1 ; //gerar numeros randomicos de 1 á 3
        if (escolhaComputador == 1 ) {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);
            ImageView img2 = (ImageView)
                    findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);
            Toast.makeText(MainActivity.this, "Padre Mata Lobisomem. O Jogador ganha 1 ponto!"  ,
                    Toast.LENGTH_LONG).show(); //gera um tost
            placarJogador ++;
            TextView pontos = (TextView)
                    findViewById(R.id. placarJogador);
            pontos.setText(String. valueOf( this.placarJogador ));
        }
        else if (escolhaComputador == 2 ){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);
            ImageView img2 = (ImageView)
                    findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);
            Toast.makeText(MainActivity.this, "Empate!!"  ,
                    Toast.LENGTH_LONG).show(); //gera um tost
        }
        else if (escolhaComputador == 3 ){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);
            ImageView img2 = (ImageView)
                    findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);
            Toast.makeText(MainActivity.this, "Camponesa Seduz Padre. O Computador Ganha 1 Ponto!" ,
                    Toast.LENGTH_LONG).show(); //gera um tost
            placarComputador ++;
            TextView pontos = (TextView)
                    findViewById(R.id.placarComputador);
            pontos.setText(String.valueOf( this.placarComputador ));
        }
    }
}