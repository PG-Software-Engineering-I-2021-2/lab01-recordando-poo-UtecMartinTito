package cs.ing.software.lab1;

public class Automovil extends Vehiculo {
    public Automovil( double  cantidad,
                      double capacidad,
                      double consumo) {
        this.setCantidad(cantidad);
        this.setCapacidad(capacidad);
        this.setConsumo(consumo);
        this.setCombGuardado(1);
    }

    @Override
    public String recorrido(double kilometers){
        double consumoAuto = this.getCantidad() - this.getConsumo() * kilometers;
        if(consumoAuto > 0){
            return ("Automovil viajo " + kilometers + " y aun tiene "+ String.format("%.2f", consumoAuto)+ " de combustible");
        }
        else{
            return ("Automovil necesita reabastecimiento de combustible");
        }
    }

    @Override
    public String abastecer(double liters){
        this.calculo(liters);
        if (liters > getEspacioTanque())
            return "Automovil no se puede reabastecer el tanque, esta lleno";
        else
            return "La cantidad de combustible del automovil es: " + String.format("%.2f", this.getCantidad());
    }
}