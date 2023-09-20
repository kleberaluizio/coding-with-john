
public class Lambdas {
    public static void main(String[] args) {

        Cat cat = new Cat("Savana", 3);
        cat.print("!");

        Printable lambdaPrintable = (suffix) -> "Meow" + suffix ;
        printThing(
                lambdaPrintable
        );
    }

    static void printThing(Printable thing){
        thing.print(".");
    }


}