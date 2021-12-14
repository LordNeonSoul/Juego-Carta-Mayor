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
        estadoToString = new String[2];
        flag = 0;
    }

    public void determinarCarta(){
        valorCartas[0] = carta1.getValorCarta();
        valorCartas[1] = carta2.getValorCarta();
        cartaJugador = valorCartas[0];
        cartaMaquina = valorCartas[1];
        if(cartaJugador>0 && cartaJugador<=12){
            cartaJugador = cartaJugador+0;
            paloCartaJugador = 1;
        }else{
            if(cartaJugador>12 && cartaJugador<=24){
                cartaJugador = cartaJugador-12;
                paloCartaJugador = 2;
            }else{
                if(cartaJugador>24 && cartaJugador<=36){
                    cartaJugador = cartaJugador-24;
                    paloCartaJugador = 3;
                }else{
                    if(cartaJugador>36 && cartaJugador<=48){
                        cartaJugador = cartaJugador-36;
                        paloCartaJugador = 4;
                    }
                }
            }
        }
        if(cartaMaquina>0 && cartaMaquina<=12){
            cartaMaquina = cartaMaquina+0;
            paloCartaMaquina = 1;
        }else{
            if(cartaMaquina>12 && cartaMaquina<=24){
                cartaMaquina = cartaMaquina-12;
                paloCartaMaquina = 2;
            }else{
                if(cartaMaquina>24 && cartaMaquina<=36){
                    cartaMaquina = cartaMaquina-24;
                    paloCartaMaquina = 3;
                }else{
                    if(cartaMaquina>36 && cartaMaquina<=48){
                        cartaMaquina = cartaMaquina-36;
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
        switch (estado){
            case 1: estadoToString[0]="Tu carta "+cartaJugador+" es mayor a la carta de la máquina "+cartaMaquina+".";
                    estadoToString[1]="¡GANASTE!, Sacaste un mayor número que la máquina.";
                    break;
            case 2: estadoToString[0]="Tu carta "+cartaJugador+" es menor a la carta de la máquina "+cartaMaquina+".";
                    estadoToString[1]="¡PERDISTE!, Sacaste un menor número que la máquina.\nBuena suerte la próxima ronda.";
                    break;
            case 3: estadoToString[0]="Tu carta "+cartaJugador+" es igual que la de la máquina "+cartaMaquina+" sin embargo tu palo es mayor.";
                    estadoToString[1]="¡GANASTE!, Sacaste un mayor palo que la máquina.";
                    break;
            case 4: estadoToString[0]="Tu carta "+cartaJugador+" es igual que la de la máquina "+cartaMaquina+" sin embargo tu palo es menor.";
                    estadoToString[1]="¡PERDISTE!, Sacaste un menor palo que la máquina.\nBuena suerte la próxima ronda.";
                    break;
            case 5: estadoToString[0]="Tu carta "+cartaJugador+" es igual que la de la máquina "+cartaMaquina+" sin embargo\nsus palos son iguales.";
                    estadoToString[1]="¡EMPATE!, Tu palo es igual que el de la máquina.";
                    break;
        }
        return estadoToString;
    }

    public int[] getValorCartas(){
        return valorCartas;
    }

}
