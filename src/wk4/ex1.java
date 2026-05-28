// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Person{
    public String name;
}
class Main {
    public static void main(String[] args) {


    //String is technicall a collection data type
    // collection of characters
    //??? then why don't we have to create an array to create a String
    ///ans: javac helps programmers
    String name = "Ben";
    String name1 = new String("Ben");
    char[] name2 = {'B', 'e', 'n'}; 
    //String is a class, it is reference data type.
    Person p = new Person();
    p.name = "Blanc";
    name = "Benny";
    String name3 = new String(name2);
    String name4 = new String();
    }
}
