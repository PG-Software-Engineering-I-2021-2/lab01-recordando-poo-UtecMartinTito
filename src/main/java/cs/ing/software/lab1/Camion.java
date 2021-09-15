package cs.ing.software.lab1;

public class Camion  extends Vehiculo {
    public Camion( double  cantidad,
                   double capacidad,
                   double consumo) {
        this.setCantidad(cantidad);
        this.setCapacidad(capacidad);
        this.setConsumo(consumo);
        this.setCombGuardado(0.95);
    }

    @Override
    public String recorrido(double km){
        double consumo = this.getCantidad() - this.getConsumo() * km;
        if(consumo > 0)
            return ("Camion viajo " + km + " y aun tiene "+ String.format("%.2f", consumo)+ " de combustible");
        else
            return ("Camion necesita reabastecimiento de combustible");
    }

    @Override
    public String abastecer(double litros){
        this.calculo(litros);
        if (litros > getEspacioTanque())
        {
            return "Camion no se puede reabastecer el tanque, esta lleno";
        }
        else{
            return "La cantidad de combustible del camion es: " + String.format("%.2f", this.getCantidad());
        }
    }
}