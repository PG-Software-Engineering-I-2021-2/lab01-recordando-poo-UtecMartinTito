import java.util.logging.Logger;
import java.lang.*;
import java.text.DecimalFormat;

public class Lab01 {
    static final Logger logger = Logger.getLogger(Lab01.class.getName());
    public static void main(String[ ] args) {
        DecimalFormat df = new DecimalFormat("0.00");
//Ejemplo 1
        Automovil lAutomovil1 = new Automovil(10,100,0.9,4);
        double lAutomovilConsumo1 =   Math.round(lAutomovil1.consumoCombustible()*100.0)/100.0;
        logger.info("Vehiculo viajó "+ lAutomovil1.getViaje() +" y aún tiene "+ df.format(lAutomovilConsumo1)+ " de combustible");

//Ejemplo 2
        Automovil lAutomovil2 = new Automovil(10,100,0.9,12);

        double lAutomovilConsumo2 = Math.round(lAutomovil2.consumoCombustible()*100.0)/100.0;
        if(lAutomovilConsumo2>0)
            logger.info("Vehiculo viajó "+ lAutomovil2.getViaje() +" y aún tiene "+ df.format(lAutomovilConsumo2)+ " de combustible");
        else
            logger.info("Vehiculo necesita reabastecemiento de combustible");

//Ejemplo 3
        Camion lCamion = new Camion(10,100,1.6,4);
        double lCamionConsumo = Math.round(lCamion.consumoCombustible()*100.0)/100.0;


        logger.info("Vehiculo viajó "+ lCamion.getViaje() +" y aún tiene "+ df.format(lCamionConsumo)+ " de combustible");

    }
}