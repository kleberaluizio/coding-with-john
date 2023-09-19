package without_generics;

public class IntegerPrinterType {

    Integer thingToPrint;

    public IntegerPrinterType(Integer thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
