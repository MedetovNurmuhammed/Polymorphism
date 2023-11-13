// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Shark();
        animals[1] = new Turtle();
        animals[2] = new Eagle();

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                shark.attack();
            } else if (animal instanceof Turtle) {
                Turtle turtle = (Turtle) animal;
                turtle.swim();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            } else {
                animal.atsk();
            }
        }
    }
}


