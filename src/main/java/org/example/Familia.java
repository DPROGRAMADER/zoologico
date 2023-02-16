package org.example;

public class Familia {

    Animal papa = new Animal("Dinosaurio", 0);
    Animal mama = new Animal("Tiburosio", 0);
    Animal hijo;

    public Familia(Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;
    }

    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+this.papa.nombreAnimal+
                        "\nLa mamá es: "+this.mama.nombreAnimal+
                        "\nEl hijo es: "+this.hijo.nombreAnimal
        );

    }

    public void tenerHijo(String nombre){

        if(this.mama.parejaAnimal!=null){

            Animal hijo= new Animal();
            hijo.nombreAnimal = nombre;
            double random = Math.random();
            if(random<0.5){
                hijo.generoAnimal="F";
            }else{
                hijo.generoAnimal="M";
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }
    }
}






