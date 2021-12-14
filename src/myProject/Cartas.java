package myProject;

import java.util.Random;

public class Cartas {
    private int valorCarta;

    public int getValorCarta(){
        Random aleatorio = new Random();
        valorCarta = aleatorio.nextInt(48)+1;
        return valorCarta;
    }
}
