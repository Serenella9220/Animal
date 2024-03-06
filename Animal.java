class Animal {
    public void doTheVerse() {
        System.out.println("Generic animal sound");
    }
}

class Cat extends Animal {
    @Override
    public void doTheVerse() {
        System.out.println("Miao!");
    }
}
