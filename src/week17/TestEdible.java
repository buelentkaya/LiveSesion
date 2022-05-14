package week17;

public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new chicken(), new Apple()};

        for (int i = 0; i < objects.length ; i++) {
            if(objects[i] instanceof Edible){
                System.out.println(((Edible) objects[i]).howToEat());
            }
            if(objects[i] instanceof Animal)
                System.out.println(((Animal) objects[i]).sound());
        }

    }

}

interface Edible {
    public abstract String howToEat();// public abstract is redundant ..no need to write them
}

abstract class Animal {
    //return animal sound
    public abstract String sound();

}

class chicken extends Animal implements Edible {

    @Override
    public String howToEat() {
        return " Chicken: Fry it!";
    }

    @Override
    public String sound() {
        return "Chicken says :Gidak Gidak";
    }
}

class Tiger extends Animal {

    @Override
    public String sound() {
        return "Tiger roars: vaourrr";
    }
}

abstract class Fruit implements Edible {

}

class Apple extends Fruit {

    @Override
    public String howToEat() {
        return "I like eating apple";
    }
}