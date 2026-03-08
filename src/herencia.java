// Archivo: herencia.java

public class herencia {
}
    //clase vehiculo
     class Vehiculo {
        // Atributo privado al inicio
        private String marca = "Honda";

        // getter para que el Main Llea marca
        public String getMarca() {
            return marca;
        }
    }

    //clase moto

    class Moto extends Vehiculo {
        private int Cilindraje = 200;

        //Getter
        public int getCilindraje() {
            return Cilindraje;
        }
    }

