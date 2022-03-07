public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("feline");
        System.out.println("a1 says: " + a1.makeSound());
        Animal a2 = animalFactory.getAnimal("canine");
        System.out.println("a2 says: " + a2.makeSound());
    }
}
