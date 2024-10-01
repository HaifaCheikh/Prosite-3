public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Zoo", "Paris");

        Animal lion = new Animal("Felidae", "Lion", 8, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 15, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);


        System.out.println("Ajout du Lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout de l'Eléphant : " + myZoo.addAnimal(elephant));
        System.out.println("Ajout du Crocodile : " + myZoo.addAnimal(crocodile));


        Animal duplicateLion = new Animal("Felidae", "Lion", 6, true);
        System.out.println("Ajout d'un Lion duplicata : " + myZoo.addAnimal(duplicateLion));


        for (int i = 0; i < 23; i++) {
            System.out.println("Ajout de l'Animal " + i + ": " + myZoo.addAnimal(new Animal("Family" + i, "Animal" + i, i, true)));
        }


        myZoo.displayAnimals();

        int index = myZoo.searchAnimal(lion);
        System.out.println("Index du Lion : " + index);


        System.out.println("Suppression du Lion : " + myZoo.removeAnimal(lion));


        myZoo.displayAnimals();


        System.out.println("Le zoo est plein : " + myZoo.isZooFull());


        Zoo anotherZoo = new Zoo("Animal Kingdom", "Londres");
        for (int i = 0; i < 10; i++) {
            anotherZoo.addAnimal(new Animal("Family" + i, "Animal" + i, i, true));
        }
        Zoo largerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo);
    }
}














