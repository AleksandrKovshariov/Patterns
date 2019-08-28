package singleton;
//no thread safe
public class Singleton {

    private static Singleton INSTANCE;
    private String info = "INFO";

    private Singleton(){

    }


    public Singleton getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}

//Thread safe, no reflection attack and cloning issues
enum EnumSingleton{
    INSTANCE("INFO");
    private String info;

    EnumSingleton(String string){
        info = string;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
