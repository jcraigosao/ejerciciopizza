
package ejercicios;


public class Pizza {
    private String cubierta;
    private int diametro;
    private double precio;

    public Pizza(String cubierta, int diametro, double precio) {
        this.cubierta = cubierta;
        this.diametro = diametro;
        this.precio = precio;
    }

    public String getCubierta() {
        return cubierta;
    }

    public int getDiametro() {
        return diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCubierta(String cubierta) {
        this.cubierta = cubierta;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
