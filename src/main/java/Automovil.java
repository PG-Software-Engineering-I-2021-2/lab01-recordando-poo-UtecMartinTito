public class Automovil extends Vehiculo{
    public Automovil( double  cantidad,
                      double capacidad,
                      double consumo,
                      double viaje) {
        this.setCantidad(cantidad);
        this.setCapacidad(capacidad);
        this.setConsumo(consumo);
        this.setViaje(viaje);
    }
    public  double consumoCombustible(){
        return this.getCantidad() - 0.9*this.getViaje();
    }
    public void abastecer(int cantidad){
        this.setCantidad(this.getCantidad()+ cantidad);
    }
}