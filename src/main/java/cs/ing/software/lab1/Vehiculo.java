package cs.ing.software.lab1;

public abstract class Vehiculo {
    double  cantidad;
    double capacidad;
    double consumo;
    double combGuardado;
    double espacioTanque;

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getCantidad() {
        return this.cantidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return this.capacidad;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getConsumo() {
        return this.consumo;
    }

    public void setCombGuardado(double comb) {
        this.combGuardado = comb;
    }

    public double getCombGuardado() {
        return this.combGuardado;
    }

    public void setEspacioTanque(double espacio) {
        this.espacioTanque = espacio;
    }

    public double getEspacioTanque() {
        return this.espacioTanque;
    }

    public abstract String recorrido(double km);

    public void calculo(double litros){
        this.setEspacioTanque(this.getCapacidad() - this.getCantidad());
        this.setCantidad(this.getCantidad() + (litros*getCombGuardado()));
    }

    public abstract String abastecer(double litros);
}