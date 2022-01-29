package GeekOutMasters;

public class ModelGeek {
    private Dados dado1, dado2, dado3, dado4, dado5, dado6, dado7, dado8, dado9;
    private int estado, caraDado1, caraDado2, caraDado3, caraDado4, caraDado5, caraDado6, caraDado7, caraDado8, caraDado9, caraDado10, caraDado11;
    private int[] dadosActivos, dadosInactivos, dadosUtilizados, dadoEnUso, caras;
    private String[] estadoToString;


    /**
     * Class Constructor.
     */

    public ModelGeek(){
        dado1 = new Dados();
        dado2 = new Dados();
        dado3 = new Dados();
        dado4 = new Dados();
        dado5 = new Dados();
        dado6 = new Dados();
        dado7 = new Dados();
        dado8 = new Dados();
        dado9 = new Dados();

        caras = new int[10];

    }

    public void calcularCara() {
        caraDado1 = dado1.getCara();
        caraDado2 = dado2.getCara();
        caraDado3 = dado3.getCara();
        caraDado4 = dado4.getCara();
        caraDado5 = dado5.getCara();
        caraDado6 = dado6.getCara();
        caraDado7 = dado7.getCara();
        caraDado8 = dado8.getCara();
        caraDado9 = dado9.getCara();

        caras[0] = caraDado1;
        caras[1] = caraDado2;
        caras[2] = caraDado3;
        caras[3] = caraDado4;
        caras[4] = caraDado5;
        caras[5] = caraDado6;
        caras[6] = caraDado7;
        caras[7] = caraDado8;
        caras[8] = caraDado9;
        caras[9] = caraDado10;

        /*dadosActivos[0] = caraDado1;
        dadosActivos[1] = caraDado2;
        dadosActivos[2] = caraDado3;
        dadosActivos[3] = caraDado4;
        dadosActivos[4] = caraDado5;
        dadosActivos[5] = caraDado6;
        dadosActivos[6] = caraDado7;*/
    }

    public void meeple(){


    }
    public String[] getEstadoToString() {//estado del juego.
        switch (estado) {
            case 1:
                estadoToString[0] = "Ya usaste este dado.";
                estadoToString[1] = "Solo puede usar los dados una vez.";
                break;
            case 2:
                estadoToString[0] = "Este dado esta en la sección de inactivos";
                estadoToString[1] = "Nesecitas un Corazón para utilizarlo";
            case 3:
                estadoToString[0] = "No puedes usar Meeple en si mismo";
                estadoToString[1] = "Intentalo de nuevo";
                break;
            case 4:
                estadoToString[0] = "No puedes usar Cohete en si mismo";
                estadoToString[1] = "Intentalo de nuevo";
                break;
            case 5:
                estadoToString[0] = "No puedes usar SuperHéroe en si mismo";
                estadoToString[1] = "Intentalo de nuevo";
                break;
        }
        return estadoToString;
    }

    public int[] getCaras() {
        return caras;
    }
    public int[] getDadoEnUso() {
        return dadoEnUso;
    }
}
