public class Animal {
    final String species;
    String name;
    Double weight;
    Boolean isAlive;

    Animal(String species) {
        this.isAlive = true;
        this.species = species;
    }

    void feed() {
        if (isAlive) {
            this.weight += 0.5;
            System.out.println("dzięki za żarcie");
        } else {
            System.out.println("fajnie, ale trochę późno :|");
        }
    }

    void takeForAWalk() {
        if (!isAlive) {
            System.out.println("HALO POLICJA");
        } else {
            this.weight -= 0.5;
            System.out.println("dzięki za spacer");
        }

        if (this.weight <= 0) {
            this.isAlive = false;
            this.weight = 0.0;
        }
    }
}
