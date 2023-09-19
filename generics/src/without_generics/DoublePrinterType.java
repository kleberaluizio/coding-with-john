package without_generics;

public class DoublePrinterType{

    double thingToPrint;

    public DoublePrinterType(double thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
