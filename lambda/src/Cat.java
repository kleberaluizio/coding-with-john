public class Cat implements Printable{

    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String print(String suffix) {
        System.out.println(name + " is "+ age + " years old" + suffix);
        return null;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
