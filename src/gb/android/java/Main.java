package gb.android.java;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Cat cat2 = new Cat("Мурзик");
        Cat cat3 = new Cat("Марта");
        Dog dog1 = new Dog("Шарик");
        Dog dog2 = new Dog("Лада");
        cat1.run(100);
        cat3.run(209);
        cat2.run(159);
        cat1.swim(10);
        dog1.swim(4);
        dog2.swim(11);
        dog1.run(200);
        dog2.run(505);
        System.out.println("Всего животных замучано приказами: " +Animal.animalCount);
        System.out.println("Всего кошек презирают двуногих: " +Cat.catCount);
        System.out.println("Всего собак рады выполнить команду: " +Dog.dogCount);

    }
}
