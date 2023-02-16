package org.example;

public class Animal {

    String nombreAnimal;
    String generoAnimal;
    double pesoAnimal;
    Animal parejaAnimal;

    public Animal() {
    }

    public Animal(String nombre, double peso) {
        this.nombreAnimal = nombre;
        this.pesoAnimal = peso;
    }

    void encontrarPareja(Animal pareja){
        this.parejaAnimal=pareja;
    }






}
