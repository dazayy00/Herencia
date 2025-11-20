package TiendaMascotas;


public class Prueba {
    public static void main(String[] args) {
        GatoPeloCorto cat = new GatoPeloCorto("Raulito", 8, "Azul", 15, 10, RazaGatoPeloCorto.Manx);
        System.out.println("Datos del gato");
        cat.imprimir();
        cat.descripcion();
        Gatos.Sonido();
        
        PGrande dog = new PGrande("Jonhson boy", 8, "Cafe", 28.6, true, RazaPerroGrande.Doberman);
        System.out.println("Datos del perro");
        dog.imprimir();
        dog.descripcion();
        Perros.sonido();
    }
    
}
