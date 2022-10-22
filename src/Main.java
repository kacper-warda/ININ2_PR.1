public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal dog = new Animal("canis");
        dog.name = "Szarik";
        dog.weight = 2.3;

        System.out.println("Masz zwierzę, nazywa się:");
        System.out.println(dog.name);
        System.out.println(dog.isAlive);
        System.out.println(dog.species);

        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();

        Human me = new Human();
        Animal cat = new Animal("felis");
        me.pet = cat;
        System.out.println(me.pet.species);
        me.pet.feed();

        me.pet = dog;
        System.out.println(me.pet.species);

        //jak w tej linijce nakarmić kota?
       // cat.feed(); todo: zrobić na kolejnych zajęciach
        dog.feed();
        me.pet.feed();

        Car fiat = new Car("Fiat", "Bravo");
        me.car = fiat;
        System.out.println(me.car.producer);
    }
}