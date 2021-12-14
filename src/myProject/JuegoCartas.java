package myProject;

public class JuegoCartas {
    private Cartas carta1, carta2;
    private int cartaJugador, cartaMaquina, paloCartaJugador, paloCartaMaquina, estado, flag;
    private String[] estadoToString;
    private int[] valorCartas;

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

    public void determinarPaloCartasJugador(){
        if(cartaJugador>0 && cartaJugador<=12){
            paloCartaJugador = 1;
        }else{
            if(cartaJugador>12 && cartaJugador<=24){
                paloCartaJugador = 2;
            }else{
                if(cartaJugador>24 && cartaJugador<=36){
                    paloCartaJugador = 3;
                }else{
                    if(cartaJugador>36 && cartaJugador<=48){
                        paloCartaJugador = 4;
                    }
                }
            }
        }
    }

    public void determinarPaloCartasMaquina(){
        if(cartaMaquina>0 && cartaMaquina<=12){
            paloCartaMaquina = 1;
        }else{
            if(cartaMaquina>12 && cartaMaquina<=24){
                paloCartaMaquina = 2;
            }else{
                if(cartaMaquina>24 && cartaMaquina<=36){
                    paloCartaMaquina = 3;
                }else{
                    if(cartaMaquina>36 && cartaMaquina<=48){
                        paloCartaMaquina = 4;
                    }
                }
            }
        }
    }

    public void juegoCartas(){
        if(flag==0){
            if(cartaJugador > cartaMaquina){
                estado = 1;
            }else{
                if(cartaJugador < cartaMaquina){
                    estado = 2;
                }else{
                    if(cartaJugador == cartaMaquina){
                        if(paloCartaJugador > paloCartaMaquina){
                            estado = 3;
                        }else{
                            if(paloCartaJugador < paloCartaMaquina){
                                estado = 4;
                            }else{
                                estado = 5;
                            }
                        }
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
