package cs.ing.software.lab1;
import java.util.logging.Logger;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[ ] args) {
//Ejemplo automovil
        Automovil lAutomovil1 = new Automovil(10,100,0.9);
        String caso1 = lAutomovil1.recorrido(4);
        logger.info(caso1);
        String caso2 = lAutomovil1.recorrido(12);
        logger.info(caso2);

//Ejemplo camion
        Camion lCamion = new Camion(10,100,1.6);
        String caso3 = lCamion.recorrido(4);
        logger.info(caso3);
    }
}