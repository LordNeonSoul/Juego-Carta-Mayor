package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used for ...
 * @autor Juan Pablo Pantoja Gutierrez juan.pablo.pantoja@correounivalle.edu.co
 * @version v.1.0.0 date:21/11/2021
 */
public class GUI extends JFrame {
    private static final String MENSAJE_INICIO="Juego Carta Mayor\n"
            + "Oprime el botón lanzar para iniciar la ronda"
            + "\nSi tu carta es menor a la de la máquina habrás perdido"
            + "\nSi tu carta es mayor a la de la máquina habrás perdido"
            + "\nSi tu carta es igual a la de la máquina el ganador se decidirá por el palo de cartas siendo:"
            + "\nSi la carta es del palo de Oros le gana a Copas, Espadas, Bastos"
            + "\nSi la carta es del palo de Copas le gana a las Espadas y Bastos"
            + "\nsi la carta es del palo de Espadas le gana a los Bastos";

    private Header headerProject;
    private JLabel carta1, carta2;
    private JButton jugar, ayuda, salir;
    private JPanel panelCartas;
    private ImageIcon imageCarta;
    private JTextArea resultadosCartas, mensajeSalida;
    private Escucha escucha;
    //private ModelCraps modelCraps;

    /**
     * Constructor of GUI class
     */
    public GUI(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Juego Craps");
        this.setUndecorated(true);
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUI class
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        //Create Listener Object and Control Object
        escucha = new Escucha();
        //Set up JComponents
        headerProject = new Header("Juego Carta Mayor", Color.BLACK);
        constraints.gridx=0;
        constraints.gridy=0;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        this.add(headerProject,constraints);

        ayuda = new JButton("?");
        ayuda.addActionListener(escucha);
        constraints.gridx=0;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.LINE_START;
        this.add(ayuda,constraints);

        salir = new JButton("Salir");
        salir.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=1;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.LINE_END;
        this.add(salir,constraints);

        imageCarta = new ImageIcon(getClass().getResource("/Cartas/carta.png"));
        carta1 = new JLabel(imageCarta);
        carta2 = new JLabel(imageCarta);

        panelCartas = new JPanel();
        panelCartas.setPreferredSize(new Dimension(300,220));
        panelCartas.setBorder(BorderFactory.createTitledBorder("Tus Cartas "));
        panelCartas.add(carta1);
        panelCartas.add(carta2);
        constraints.gridx=0;
        constraints.gridy=2;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        add(panelCartas,constraints);

        resultadosCartas = new JTextArea(4,31);
        resultadosCartas.setBorder(BorderFactory.createTitledBorder("Resultados "));
        resultadosCartas.setText("Debes darle al botón Jugar");
        resultadosCartas.setEditable(false);
        constraints.gridx=1;
        constraints.gridy=2;
        constraints.gridwidth=1;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.anchor=GridBagConstraints.CENTER;
        add(resultadosCartas,constraints);

        jugar = new JButton("Jugar");
        jugar.addActionListener(escucha);
        constraints.gridx=0;
        constraints.gridy=3;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        add(jugar,constraints);

        mensajeSalida = new JTextArea(4,31);
        mensajeSalida.setText("Usa el botón ayuda (?) si necesitas saber las reglas del juego");
        mensajeSalida.setBorder(BorderFactory.createTitledBorder("Mensajes "));
        mensajeSalida.setEditable(false);
        constraints.gridx=0;
        constraints.gridy=4;
        constraints.gridwidth=2;
        constraints.fill=GridBagConstraints.NONE;
        constraints.anchor=GridBagConstraints.CENTER;
        add(mensajeSalida,constraints);
    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUI miProjectGUI = new GUI();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUI class
     */
    private class Escucha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==jugar){

            }else{
                if(e.getSource()==ayuda){
                    JOptionPane.showMessageDialog(null,MENSAJE_INICIO);
                }else{
                    System.exit(0);
                }
            }

        }
    }
}
