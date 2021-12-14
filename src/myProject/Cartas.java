package myProject;

import java.util.Random;

/**
 * Class Cartas generate a random value between 1 and 48
 * @autor Juan Pablo Pantoja Gutierrez juan.pablo.pantoja@correounivalle.edu.co 2040104
 * @autor Johan Loaiza Téllez loaiza.johan@correounivalle.edu.co 2040882
 * @version v.1.0.8 date:14/12/2021
 */
public class Cartas {
    private int valorCarta;

    /**
     * Method that generate a random value to valorCarta
     * @return number between (1.6)
     */

    public int getValorCarta(){
        Random aleatorio = new Random();
        valorCarta = aleatorio.nextInt(48)+1;
        return valorCarta;
    }
}
