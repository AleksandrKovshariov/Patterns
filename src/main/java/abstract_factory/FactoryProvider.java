package abstract_factory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice){

        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }

        return null;
    }
}
