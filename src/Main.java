public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 3, 800);
        Cat cat2 = new Cat("Кеша", 2, 550);
        Cat cat3 = new Cat("Tom", 3, 1050);

        Human human1 = new Human("George", 1, 1400);
        Human human2 = new Human("Mike", 2, 2200);
        Human human3 = new Human("David", 3, 10000);
        Human human4 = new Human("Allie", 1, 600);
        Robot robot1 = new Robot("Chappy", 1, 5000);


        Cat[] cats = {
                cat1,
                cat2,
                cat3
        };

        Human[] people = {
                human1,
                human2,
                human3,
                human4
        };

        for (int i = 0; i < people.length; i++) {
            if (people[i].running() == true) {
                people[i].jumping();
            }
        }

        for (int i = 0; i < cats.length; i++) {
            if (cats[i].running() == true) {
                cats[i].jumping();
            }
        }
    }
}