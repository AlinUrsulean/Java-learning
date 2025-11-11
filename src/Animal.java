class Animal {
    void makeSound() {
        System.out.println("Animalul scoate un sunet");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Ham ham!");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Miau!");
    }
}
