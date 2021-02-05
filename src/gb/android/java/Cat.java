package gb.android.java;

public class Cat extends Animal{
    protected static int catCount = 0;

    protected Cat (String name){
        super(name);
        catCount++;
    }

    @Override
    protected void run(int distance) {
        if (distance <= 200) System.out.println("Кошка " + name + " пробежала " + distance + " метров");
        else System.out.println("Кошка " +name+ " игнорирует Вас");
    }


    @Override
    protected void swim(int distance) {
        System.out.println("Кошка " +name+ " не желает мокнуть");
    }

}
