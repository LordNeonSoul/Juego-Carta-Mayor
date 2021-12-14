package myProject;

public class JuegoCartas {
    private Cartas carta1, carta2;
    private int cartaJugador, cartaMaquina, paloCartaJugardor, paloCartaMaquina, estado, flag;
    private String[] estadoToString;
    private int[] valorCartas, paloDeCartas;

    public JuegoCartas(){
        carta1 = new Cartas();
        carta2 = new Cartas();
        valorCartas = new int[2];
        flag = 0;
    }

    public void determinarCarta(){
        valorCartas[0] = carta1.getValorCarta();
        valorCartas[1] = carta2.getValorCarta();
        cartaJugador = valorCartas[0];
        cartaMaquina = valorCartas[1];
    }

    public void determinarPaloCartas(){

    }

    public void juegoCartas(){
        if(flag==0){
            if(cartaJugador > cartaMaquina){
                estado = 1;
            }else{
                if(cartaJugador < cartaMaquina){
                    estado = 2;
                }else{
                    if (cartaJugador == cartaMaquina){

                    }
                }
            }
        }
    }

    public int getCartaJugador(){
        return cartaJugador;
    }

    public int getCartaMaquina(){
        return  cartaMaquina;
    }

    public String[] getEstadoToString() {
        return estadoToString;
    }
}
