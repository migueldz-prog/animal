public class Gato extends Animal{
        private String raza;
        public Gato(String nombre, int edad, String raza) {
            super(nombre, edad);
            this.raza = raza;
        }

        @Override
        public void hacerSonido() {
            System.out.println(nombre + " hace: ¡Miau!");
        }

        @Override
        public String toString() {
            return "Gato{" +
                    "raza='" + raza + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", edad='" + edad + '\'' +
                    '}';
        }
    }
