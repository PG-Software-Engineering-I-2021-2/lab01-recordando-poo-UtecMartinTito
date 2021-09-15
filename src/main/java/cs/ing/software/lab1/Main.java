package cs.ing.software.lab1;

public class Main {

    public static void main(String[ ] args) {
//Ejemplo automovil
        Automovil lAutomovil1 = new Automovil(10,100,0.9);
        lAutomovil1.recorrido(4);
        lAutomovil1.recorrido(12);

//Ejemplo camion
        Camion lCamion = new Camion(10,100,1.6);
        lCamion.recorrido(4);
    }
}