package org.example;

public class Zoologico {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.nombreAnimal = "Cebra";
        animal1.generoAnimal = "F";

        Animal animal2 = new Animal();
        animal2.nombreAnimal = "Caballo";
        animal2.generoAnimal = "M";

        animal1.encontrarPareja(animal2);

        Familia familia = new Familia(animal2, animal1);

        familia.tenerHijo("Cebrallo");

        familia.imprimirFamilia();

    }
}
