package gb.android.java;

public abstract class Animal {
    String name;
    protected static int animalCount = 0;

    protected Animal(String name){
        this.name = name;
        animalCount++;
    }

    protected abstract void run(int distance);
    protected abstract void swim(int distance);



}
