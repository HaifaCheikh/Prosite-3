public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25; // Nombre constant de cages
    private int animalCount; // Compteur d'animaux

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages]; // Le tableau d'animaux
        this.animalCount = 0; // Initialisation du compteur d'animaux
    }

    public boolean addAnimal(Animal animal) {
        if (!isZooFull() && !animalExists(animal)) {
            animals[animalCount] = animal; // Ajout de l'animal
            animalCount++; // Incrémentation du compteur
            return true;
        }
        System.out.println("Pas assez de cages ou animal déjà présent.");
        return false;
    }

    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                animals[i] = animals[animalCount - 1]; // Remplace l'animal supprimé par le dernier
                animals[animalCount - 1] = null; // Supprime la référence
                animalCount--; // Décrémente le compteur
                return true;
            }
        }
        return false; // Animal non trouvé
    }

    public boolean isZooFull() {
        return animalCount >= nbrCages; // Vérifie si le zoo est plein
    }

    public boolean animalExists(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return true; // L'animal existe déjà dans le zoo
            }
        }
        return false;
    }

    public void displayAnimals() {
        System.out.println("Animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i; // Retourne l'indice de l'animal trouvé
            }
        }
        return -1; // Animal non trouvé
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.animalCount >= z2.animalCount ? z1 : z2; // Retourne le zoo avec le plus d'animaux
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animalCount=" + animalCount +
                '}';
    }
}















