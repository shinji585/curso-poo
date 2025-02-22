package Interfaces.EjercicioInterfaces1.Interfacesserveces;

import Interfaces.EjercicioInterfaces1.InterfaceModel.Comida;

public class ComidaRapidad extends Comida {

    private double CantdiadGrasa;
    private double carbohidratos;

    // creamos el constructor de nuestra clase
    public ComidaRapidad(double CantidadAzucar, String tipo, double calorias, double cantidadProteinas,
            double CantdiadGrasa, double carbohidratos) {
        super(CantidadAzucar, tipo, calorias, cantidadProteinas);
        this.CantdiadGrasa = CantdiadGrasa;
        this.carbohidratos = carbohidratos;
    }

    // creamos los getters and setters de nuestra clase segun el la cantidad de
    // grasa que se tiene
    public void setCantidadGrasa(double grasa) {
        this.CantdiadGrasa = grasa;
    }

    public double getCantidadGrasa() {
        return this.CantdiadGrasa;
    }

    public void setCarbos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public double getCarbos() {
        return this.carbohidratos;
    }

    // implementamos los atributos abstractos de la forma en que estos estan hechos

    @Override
    public void setCantidadAzucar(double a) {
        this.CantidadAzucar = a;
    }

    @Override
    public double getCantidadAzucar() {
        return this.CantidadAzucar;
    }

    @Override
    public void setTipo(String b) {
        this.tipo = b;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public void setCalorias(double c) {
        this.calorias = c;
    }

    @Override
    public double getCalorias() {
        return this.calorias;
    }

    @Override
    public void setCantidadProteinas(double d) {
        this.cantidadProteinas = d;
    }

    @Override
    public double getCantidadProteinas() {
        return this.cantidadProteinas;
    }

    @Override
    public boolean esSaludables() {
        double porcentajeGrasas = (getCantidadGrasa() * 9 * 100) / getCalorias();
        double porcentajeProteinas = (getCantidadProteinas() * 4 * 100) / getCalorias();
        double porcentajeCarbohidratos = (getCarbos() * 4 * 100) / getCalorias();

        // creamos una varaible bandera
        boolean bandera = true;

        if (porcentajeGrasas < 20 || porcentajeGrasas > 30) {
            bandera = false;
        } else if (porcentajeProteinas < 20 || porcentajeProteinas > 30) {
            bandera = false;
        } else if (porcentajeCarbohidratos < 40 || porcentajeCarbohidratos > 50) {
            bandera = false;
        } else if (getCantidadAzucar() > 8) {
            bandera = false;
        }
        return bandera;
    }

    @Override
    public String toString() {
        return "----------------------------\n" +
                " 📌  Información del Plato  \n" +
                "----------------------------\n" +
                "🍽️  Tipo de comida: " + getTipo() + "\n" +
                "🍭  Cantidad de azúcares: " + getCantidadAzucar() + " g\n" +
                "🔥  Calorías: " + getCalorias() + " kcal\n" +
                "🥩  Proteínas: " + getCantidadProteinas() + " g\n" +
                "🛢️  Grasas: " + getCantidadGrasa() + " g\n" +
                "🍞  Carbohidratos: " + getCarbos() + " g\n" +
                "----------------------------";
    }

}
