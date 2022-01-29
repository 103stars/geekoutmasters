package GeekOutMasters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIGridBagLayout extends JFrame {

    private Header headerProject;
    private JLabel dado0, dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9, dado10;
    private JButton dado1Boton, dado2Boton, dado3Boton, dado4Boton, dado5Boton, dado6Boton, dado7Boton, dado8Boton, dado9Boton, dado10Boton, lanzar, usar, help, probar;
    private JPanel panelDadosUso, panelDadosNoUso, panelBotones, utilizados, panelBotonesUtilizados;
    private JTextArea puntuacion;
    private ImageIcon imageDado, placeholder, iconoX;
    private ModelGeek modelGeek;
    private Escucha escucha;
    private int[] dadoEnUso, dadosInactivos, dadosUsados;

    public GUIGridBagLayout() {
        initGUI();
        this.setTitle("geek out masters");
        this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void initGUI() {

        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        escucha = new Escucha();
        modelGeek = new ModelGeek();
        dadoEnUso = new int[4];
        dadosInactivos = new int[10];
        dadosUsados = new int[10];
        placeholder = new ImageIcon(getClass().getResource("/dados/" +  "placeholder.png"));
        iconoX = new ImageIcon(getClass().getResource("/dados/" +  "x.png"));

        dado0 = new JLabel(placeholder);
        dado1 = new JLabel(placeholder);
        dado2 = new JLabel(placeholder);
        dado3 = new JLabel(placeholder);
        dado4 = new JLabel(placeholder);
        dado5 = new JLabel(placeholder);
        dado6 = new JLabel(placeholder);
        dado7 = new JLabel(placeholder);
        dado8 = new JLabel(placeholder);
        dado9 = new JLabel(placeholder);
        dado10 = new JLabel(placeholder);
        probar = new JButton("probar");

        probar.addActionListener(escucha);
        constraints.gridx=1;
        constraints.gridy=1;
        constraints.anchor=GridBagConstraints.LINE_END;
        add(probar,constraints);

        headerProject = new Header("header", Color.BLACK);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 4;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        this.add(headerProject, constraints);

        //Ubicacion de paneles
        panelDadosUso = new JPanel();
        panelDadosUso.setPreferredSize(new Dimension(360, 295));
        panelDadosUso.setBorder(BorderFactory.createTitledBorder("Dados Activos"));
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        add(panelDadosUso, constraints);

        puntuacion = new JTextArea();
        puntuacion.setPreferredSize(new Dimension(360, 265));
        puntuacion.setBorder(BorderFactory.createTitledBorder("Puntuacion"));
        puntuacion.setEditable(false);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.CENTER;
        add(puntuacion, constraints);

        panelDadosNoUso = new JPanel();
        panelDadosNoUso.setPreferredSize(new Dimension(360, 265));
        panelDadosNoUso.setBorder(BorderFactory.createTitledBorder("Dados Inactivos"));
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.SOUTH+2;
        add(panelDadosNoUso, constraints);


        utilizados = new JPanel();
        utilizados.setPreferredSize(new Dimension(360, 455));
        utilizados.setBorder(BorderFactory.createTitledBorder("Utilizados"));
        constraints.gridx = 2;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.LINE_END;
        add(utilizados, constraints);

        //Ubicacion de botones
        help = new JButton("?");
        help.addActionListener(escucha);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.anchor = GridBagConstraints.LINE_START;
        add(help, constraints);



        panelDadosUso.add(dado0);
        panelDadosUso.add(dado1);
        panelDadosUso.add(dado2);
        panelDadosUso.add(dado3);
        panelDadosUso.add(dado4);
        panelDadosUso.add(dado5);
        panelDadosUso.add(dado6);

        panelDadosNoUso.add(dado8);
        panelDadosNoUso.add(dado7);
        panelDadosNoUso.add(dado9);


        dado1Boton = new JButton("     Dado 1    ");
        dado1Boton.addActionListener(escucha);

        dado2Boton = new JButton("     Dado 2    ");
        dado2Boton.addActionListener(escucha);

        dado3Boton = new JButton("     Dado 3    ");
        dado3Boton.addActionListener(escucha);

        dado4Boton = new JButton("     Dado 4    ");
        dado4Boton.addActionListener(escucha);

        dado5Boton = new JButton("     Dado 5    ");
        dado5Boton.addActionListener(escucha);

        dado6Boton = new JButton("     Dado 6    ");
        dado6Boton.addActionListener(escucha);

        dado7Boton = new JButton("     Dado 7    ");
        dado7Boton.addActionListener(escucha);

        dado8Boton = new JButton("     Dado 8    ");
        dado8Boton.addActionListener(escucha);

        dado9Boton = new JButton("     Dado 9    ");
        dado9Boton.addActionListener(escucha);

        dado10Boton = new JButton("    Dado 10    ");
        dado10Boton.addActionListener(escucha);




        panelBotonesUtilizados = new JPanel();
        panelBotonesUtilizados.setPreferredSize(new Dimension(360, 60));
        constraints.gridx = 0;
        constraints.gridy = 3;
        //constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.SOUTH+1;
        add(panelBotonesUtilizados, constraints);
        panelBotonesUtilizados.add(dado8Boton);
        panelBotonesUtilizados.add(dado9Boton);
        panelBotonesUtilizados.add(dado10Boton);



        lanzar = new JButton("Lanzar");
        lanzar.addActionListener(escucha);
        constraints.gridx = 0;
        constraints.gridy = 1;
        //constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.PAGE_START;
        add(lanzar, constraints);

        usar = new JButton("Usar");
        usar.addActionListener(escucha);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        //constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.LINE_END;
        add(usar, constraints);

        //PANEL BOTONES ACTIVOS
        panelBotones = new JPanel();
        panelBotones.setPreferredSize(new Dimension(360, 140));
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.anchor = GridBagConstraints.NORTH;
        panelBotones.add(dado1Boton);
        panelBotones.add(dado2Boton);
        panelBotones.add(dado3Boton);
        panelBotones.add(dado4Boton);
        panelBotones.add(dado5Boton);
        panelBotones.add(dado6Boton);
        panelBotones.add(dado7Boton);
        add(panelBotones, constraints);






    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            GUIGridBagLayout miProjectGUI = new GUIGridBagLayout();
        });
    }




    public class Escucha implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == lanzar) {
                utilizados.removeAll();
                //utilizados.revalidate();
                utilizados.repaint();
                modelGeek.calcularCara();
                int[] caras = modelGeek.getCaras();

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[0] + ".png"));
                dado0.setIcon(imageDado);

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[1] + ".png"));
                dado1.setIcon(imageDado);

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[2] + ".png"));
                dado2.setIcon(imageDado);

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[3] + ".png"));
                dado3.setIcon(imageDado);

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[4] + ".png"));
                dado4.setIcon(imageDado);

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[5] + ".png"));
                dado5.setIcon(imageDado);

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[6] + ".png"));
                dado6.setIcon(imageDado);

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[7] + ".png"));
                dado7.setIcon(imageDado);

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[8] + ".png"));
                dado8.setIcon(imageDado);

                imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[1] + ".png"));
                dado9.setIcon(imageDado);


            }
            if (e.getSource() == dado1Boton) {
                int[] caras = modelGeek.getCaras();
                if (dadoEnUso[0] == 0) {

                    dadoEnUso[0] = caras[0];
                    dadosUsados[0] = 1;
                    //imageDado = new ImageIcon(getClass().getResource("/dados/" + "x.png"));
                    utilizados.add(dado0);
                    imageDado = new ImageIcon(getClass().getResource("/dados/" + "x.png"));
                    dado0.setIcon(imageDado);


                } else {
                    dadoEnUso[1] = caras[0];
                    dadoEnUso[2] = 1;

                }
            }
            if (e.getSource() == dado2Boton) {
                int[] caras = modelGeek.getCaras();
                if (dadoEnUso[0] == 0) {
                    dadoEnUso[0] = caras[1];
                    dadosUsados[1] = 2;
                    utilizados.add(dado1);
                    imageDado = new ImageIcon(getClass().getResource("/dados/" + "x.png"));
                    dado1.setIcon(imageDado);
                } else {
                    dadoEnUso[1] = caras[1];
                    dadoEnUso[2] = 3;

                }
            }
            if (e.getSource() == dado3Boton) {
                int[] caras = modelGeek.getCaras();
                if (dadoEnUso[0] == 0) {
                    dadoEnUso[0] = caras[2];
                    dadosUsados[2] = 3;
                    imageDado = new ImageIcon(getClass().getResource("/dados/" + "x.png"));
                    dado2.setIcon(imageDado);
                } else {
                    dadoEnUso[1] = caras[2];
                    dadoEnUso[2] = 3;

                }
            }
            if (e.getSource() == dado4Boton) {
                int[] caras = modelGeek.getCaras();
                if (dadoEnUso[0] == 0) {
                    dadoEnUso[0] = caras[3];
                    dadosUsados[3] = 4;
                    imageDado = new ImageIcon(getClass().getResource("/dados/" + "x.png"));
                    dado3.setIcon(imageDado);
                } else {
                    dadoEnUso[1] = caras[3];
                    dadoEnUso[2] = 4;
                }
            }
            if (e.getSource() == dado5Boton) {
                int[] caras = modelGeek.getCaras();
                if (dadoEnUso[0] == 0) {
                    dadoEnUso[0] = caras[4];
                    dadosUsados[4] = 5;
                    imageDado = new ImageIcon(getClass().getResource("/dados/" + "x.png"));
                    dado4.setIcon(imageDado);
                } else {
                    dadoEnUso[1] = caras[4];
                    dadoEnUso[2] = 5;
                }
            }

            if (e.getSource() == dado6Boton) {
                int[] caras = modelGeek.getCaras();
                if (dadoEnUso[0] == 0) {
                    dadoEnUso[0] = caras[5];
                    dadosUsados[5] = 6;
                    imageDado = new ImageIcon(getClass().getResource("/dados/" + "x.png"));
                    dado5.setIcon(imageDado);
                } else {
                    dadoEnUso[1] = caras[5];
                    dadoEnUso[2] = 6;
                }
            }

            if (e.getSource() == dado7Boton) {
                int[] caras = modelGeek.getCaras();
                if (dadoEnUso[0] == 0) {
                    dadoEnUso[0] = caras[6];
                    dadosUsados[6] = 7;
                    imageDado = new ImageIcon(getClass().getResource("/dados/" + "x.png"));
                    dado6.setIcon(imageDado);
                } else {
                    dadoEnUso[1] = caras[6];
                    dadoEnUso[2] = 7;
                }
            } if(e.getSource() == dado8Boton){
                int[] caras = modelGeek.getCaras();
                if(dadoEnUso[0] == 0) {
                    dadoEnUso[0] = caras[8];
                    dadosUsados[7] = 8;
                } else {
                    dadoEnUso[1] = caras[8];
                    dadoEnUso[2] = 8;
                }
            } if(e.getSource() == dado9Boton ){
                int[] caras = modelGeek.getCaras();
                if(dadoEnUso[0] == 0) {
                    dadoEnUso[0] = caras[9];
                    dadosUsados[8] = 9;
                } else {
                    dadoEnUso[1] = caras[9];
                    dadoEnUso[2] = 9;
                }
            } if(e.getSource() == dado10Boton){
                int[] caras = modelGeek.getCaras();
                if (dadoEnUso[0] == 0) {
                    //dadoEnUso[0] = caras[10];
                    dadosUsados[9] = 10;
                } else {
                    dadoEnUso[1] = caras[10];
                    dadoEnUso[2] = 10;

                }
            }

            if(e.getSource()==help){
                JOptionPane.showMessageDialog(null, "bruh");

            }
            if(e.getSource() == probar){
                JOptionPane.showMessageDialog(null, "" + dadoEnUso[0] + "-" + dadoEnUso[1] + "-" +dadoEnUso[2]);
            }
            if (e.getSource() == usar) {
                //meeple
                 if(dadoEnUso[0] == 1){
                    if(dadoEnUso[2] == 1){//posicion del dado al que afecta el meeple.
                        int[] caras = modelGeek.getCaras();
                        imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[7] + ".png"));
                        dado0.setIcon(imageDado);

                    } else if(dadoEnUso[2] == 2){
                        int[] caras = modelGeek.getCaras();
                        imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[7] + ".png"));
                        dado1.setIcon(imageDado);

                    }
                    else if(dadoEnUso[2] == 3){
                        int[] caras = modelGeek.getCaras();
                        imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[7] + ".png"));
                        dado2.setIcon(imageDado);

                    }
                    else if(dadoEnUso[2] == 4){
                        int[] caras = modelGeek.getCaras();
                        imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[7] + ".png"));
                        dado3.setIcon(imageDado);

                    }
                    else if(dadoEnUso[2] == 5){
                        int[] caras = modelGeek.getCaras();
                        imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[7] + ".png"));
                        dado4.setIcon(imageDado);

                    }
                    else if(dadoEnUso[2] == 6){
                        int[] caras = modelGeek.getCaras();
                        imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[7] + ".png"));
                        dado5.setIcon(imageDado);

                    }
                    else if(dadoEnUso[2] == 7){
                        int[] caras = modelGeek.getCaras();
                        imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[7] + ".png"));
                        dado6.setIcon(imageDado);

                    }

                    // COHETE
                } else if (dadoEnUso[0] == 2){
                     if(dadoEnUso[2]==1){

                         //dado0.setIcon(null);
                         int[] caras = modelGeek.getCaras();
                         imageDado=new ImageIcon(getClass().getResource("/dados/"+caras[0]+".png"));
                         dado0.setIcon(imageDado);
                         utilizados.add(dado0);
                     }else if(dadoEnUso[2]==2){

                         //dado1.setIcon(null);
                         int[] caras = modelGeek.getCaras();
                         imageDado=new ImageIcon(getClass().getResource("/dados/"+caras[1]+".png"));
                         dado1.setIcon(imageDado);
                         utilizados.add(dado1);

                     }else if(dadoEnUso[2]==3){
                         //dado2.setIcon(null);
                         int[] caras = modelGeek.getCaras();
                         imageDado=new ImageIcon(getClass().getResource("/dados/"+caras[2]+".png"));
                         dado2.setIcon(imageDado);
                         utilizados.add(dado2);
                     }else if(dadoEnUso[2]==4){

                         //dado3.setIcon(null);
                         int[] caras = modelGeek.getCaras();
                         imageDado=new ImageIcon(getClass().getResource("/dados/"+caras[3]+".png"));
                         dado3.setIcon(imageDado);
                         utilizados.add(dado3);
                     }else if(dadoEnUso[2]==5){

                         //dado4.setIcon(null);
                         int[] caras = modelGeek.getCaras();
                         imageDado=new ImageIcon(getClass().getResource("/dados/"+caras[4]+".png"));
                         dado4.setIcon(imageDado);
                         utilizados.add(dado4);
                     }else if(dadoEnUso[2]==6){

                         //dado5.setIcon(null);
                         int[] caras = modelGeek.getCaras();
                         imageDado=new ImageIcon(getClass().getResource("/dados/"+caras[5]+".png"));
                         dado5.setIcon(imageDado);
                         utilizados.add(dado5);
                     }else if(dadoEnUso[2]==7){

                         dado6.setIcon(null);
                         int[] caras = modelGeek.getCaras();
                         imageDado=new ImageIcon(getClass().getResource("/dados/"+caras[6]+".png"));
                         dado6.setIcon(imageDado);
                         utilizados.add(dado6);

                }
            }else if(dadoEnUso[0]==3){
                     if(dadoEnUso[1]==3){

                     }
                 }
                dadoEnUso[0]=0;
        } else if(dadoEnUso[0] == 4) {//corazon
                if(dadoEnUso[2] == 8) {
                    int[] caras = modelGeek.getCaras();
                    imageDado = new ImageIcon(getClass().getResource("/dados/" + caras[8] + ".png"));
                    dado8.setIcon(imageDado);
                    } else if(dadoEnUso[2] == 9) {
                    int[] caras = modelGeek.getCaras();
                    imageDado = new ImageIcon((getClass().getResource("/dados/"+ caras[9]+ ".png")));
                    dado9.setIcon(imageDado);
                } else if (dadoEnUso[2] == 10) {
                    int[] caras = modelGeek.getCaras();
                    imageDado = new ImageIcon(getClass().getResource("/dados/"+ caras[10]+ ".png"));
                    dado10Boton.setIcon(imageDado);
                }
                }

        }

        }
    }





