public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Safari Zoo", "Paris");

        Animal lion = new Animal("Felidae", "Lion", 8, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 15, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 12, false);

        // Ajout des animaux
        System.out.println("Ajout du Lion : " + myZoo.addAnimal(lion));
        System.out.println("Ajout de l'Eléphant : " + myZoo.addAnimal(elephant));
        System.out.println("Ajout du Crocodile : " + myZoo.addAnimal(crocodile));

        // Essayer d'ajouter un animal déjà présent
        Animal duplicateLion = new Animal("Felidae", "Lion", 6, true);
        System.out.println("Ajout d'un Lion duplicata : " + myZoo.addAnimal(duplicateLion));

        // Essayer d'ajouter plus d'animaux que de cages
        for (int i = 0; i < 23; i++) {
            System.out.println("Ajout de l'Animal " + i + ": " + myZoo.addAnimal(new Animal("Family" + i, "Animal" + i, i, true)));
        }

        // Afficher tous les animaux
        myZoo.displayAnimals();

        // Rechercher un animal
        int index = myZoo.searchAnimal(lion);
        System.out.println("Index du Lion : " + index);

        // Supprimer un animal
        System.out.println("Suppression du Lion : " + myZoo.removeAnimal(lion));

        // Afficher après la suppression
        myZoo.displayAnimals();

        // Vérifier si le zoo est plein
        System.out.println("Le zoo est plein : " + myZoo.isZooFull());

        // Comparer deux zoos
        Zoo anotherZoo = new Zoo("Animal Kingdom", "Londres");
        for (int i = 0; i < 10; i++) {
            anotherZoo.addAnimal(new Animal("Family" + i, "Animal" + i, i, true));
        }
        Zoo largerZoo = Zoo.comparerZoo(myZoo, anotherZoo);
        System.out.println("Le zoo avec le plus d'animaux est : " + largerZoo);
    }
}














