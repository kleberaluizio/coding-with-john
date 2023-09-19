package without_generics;

public class DoublePrinter {

    double thingToPrint;

    public DoublePrinter(double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
