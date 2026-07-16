package wk10;

public class Week10 {

    static void example1(){
        Human h2 = new Human();
        Hero hero = new Hero();

        Villan v1 = new Villan();

        Human h3 = new Villan();
        IO.println(h3.getName());

        Human[] humans = {new Human(), new Hero(), new Villan()};

            Object o = new Hero();
            Object[] objs= {1, 1.1, true,
                    new Human(), new Hero()};

           // Villan v2 = new Hero();  //not possible
    }

    static void example2(){

        Human h = new Human("Bruce Wayne",
                170, 50, 80,
                false, false);

        Hero batman = new Hero("Bruce Wayne",
                170, 50, 80,
                false, false, "Batman", "Being Rich");

        IO.println(h);
        IO.println(batman);
    }

    static void main() {
        example2();
    }
}
