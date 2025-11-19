package Libro;

public class LibroMain {

    public static void main(String[] args) {
        
        Libro l = new Libro("La guia del ligue", "El werever");
        l.setPrecio(9.99f);
        LibroTexto lt = new LibroTexto("Fisica para pobres", "Dr chapatin", "Fisica 200");
        lt.setPrecio(10.15f);
        LibroUNC lb = new LibroUNC("Programacion oo", "Dr parada", "POO", "negocios y tecnologias");
        lb.setPrecio(15.00f);
        Novelas n = new Novelas("Las hermanas ovulonas", "Dazayy", "Ciencia ficcion");
        n.setPrecio(20.5f);
        
        l.imprimir();
        lt.imprimir();
        lb.imprimir();
        n.imprimir();
    } 
}
