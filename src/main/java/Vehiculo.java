public class Vehiculo {
    double  cantidad;
    double capacidad;
    double consumo;
    double viaje;

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getViaje() {
        return viaje;
    }

    public void setViaje(double viaje) {
        this.viaje = viaje;
    }

    public  double consumoCombustible(){
        return 0;
    }
    public void abastecer(int cantidad){}
}