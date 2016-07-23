package singleton;

/**
 * Created by Andrey on 23.07.2016.
 */
public class Singleton {

    private static Singleton object;
    private Singleton() {}

    public static Singleton getInstance() {
        if(object == null) {
            object = new Singleton();
        }
        return object;
    }
}
