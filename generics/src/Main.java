import with_generics.Printer;
import without_generics.IntegerPrinterType;
import without_generics.StringPrinter;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------- Without using Generics -----------");

        IntegerPrinterType integerPrinter = new IntegerPrinterType(23);
        integerPrinter.print();

        StringPrinter stringPrinter = new StringPrinter("Testing printer");
        stringPrinter.print();

        System.out.println("----------- Using Generics -----------");
        Printer<Integer> printer = new Printer<>(12);
        printer.print();

        Printer<String> printer2 = new Printer<>("Testing");
        printer2.print();
    }
}