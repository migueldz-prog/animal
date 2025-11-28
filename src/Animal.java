import java.sql.SQLOutput;

public class Animal {
    protected String nombre;
    protected int edad;
    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido.");

    }

    public static void main(String[] args){
        Animal a= new Animal("Animal cualquiera", 18);
        a.hacerSonido();
        Perro p= new Perro("Peter",3, "Salchicha");
        p.hacerSonido();
        Gato g=new Gato("Unai", 7, "Siames");
        g.hacerSonido();
        Perro p2= new Perro("Lisa",10, "Pastor Aleman");
        p2.hacerSonido();
    }

}
