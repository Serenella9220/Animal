
public class Main {
    public static void main(String[] args) {

        Animal animalGeneric = new Animal();

        System.out.println("Generic Animal Verse");
        animalGeneric.doTheVerse();

        Cat cat = new Cat();

        System.out.println("Cat's verse");
        cat.doTheVerse();
    }
}