public class Camion  extends Vehiculo{
    public Camion( double  cantidad,
                   double capacidad,
                   double consumo,
                   double viaje) {
        this.setCantidad(cantidad);
        this.setCapacidad(capacidad);
        this.setConsumo(consumo);
        this.setViaje(viaje);
    }

    public  double consumoCombustible(){
        return this.getCantidad() - 1.6*this.getViaje();
    }
    public void abastecer(int cantidad){
        double newCantidad = cantidad*0.95;
        this.setCantidad(this.getCantidad()+ newCantidad);
    }
}