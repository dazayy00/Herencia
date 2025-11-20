package Inmueble;

public class Prueba {
    public static void main(String[] args) {
        ApartamentoFamiliar ap1 = new ApartamentoFamiliar(103067, 120, "Avenida Santander 45-45", 3, 2, 200000);
        System.out.println("Datos Apartamento");
        ap1.CalcularPrecioVenta(ap1.valorA);
        ap1.imprimir();
        
        System.out.println("Datos Apartamento");
        Apartaestudio ape1 = new Apartaestudio(12354, 50, "Avenida caracas 30-15", 1, 1);
        ape1.CalcularPrecioVenta(ape1.valorA);
        ape1.imprimir();
    }
    
}
