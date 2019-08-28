package factory_method;


public interface EncryptionAlgorithm {
    String encrypt(String plaintext);
}

interface AbstractFactory {
    Animal getAnimal();
}

interface Animal{
    void voice();
}
class Dog implements Animal{
    @Override
    public void voice() {
        System.out.println(getClass() + " bark");
    }
}class Cat implements Animal{
    @Override
    public void voice() {
        System.out.println(getClass() + " meow");
    }
}
