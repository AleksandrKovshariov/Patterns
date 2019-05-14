package abstract_factory;

public class Test {
    public static void main(String[] args) {
        AbstractFactory<Animal> animalAbstractFactory = FactoryProvider.getFactory("Animal");

        Animal animal = animalAbstractFactory.create("Duck");

        System.out.println(animal.getAnimal());

    }
}
