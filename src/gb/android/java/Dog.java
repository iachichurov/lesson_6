package gb.android.java;

public class Dog extends Animal {
    protected static int dogCount = 0;

    protected Dog (String name){
        super(name);
        dogCount++;
    }

    @Override
    protected void run(int distance) {
        if (distance <= 500) System.out.println("Собака " + name + " пробежала " + distance + " метров");
        else System.out.println(name+ " бы рада, но собаки так далеко не бегают");
    }


    @Override
    protected void swim(int distance) {
        if (distance <= 10) System.out.println("Собака " + name + " проплыла " + distance + " метров");
        else System.out.println(name+ " бы рада, но собаки так далеко не плавают");
    }


}
