public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Task 1");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Вы достигли совершеннолетия");
        } else {
            System.out.println("Вы ещё не достигли совершеннолетия");
        }
    }

    public static void task2() {
        System.out.println("Task 2");
        byte temp = 3;
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
    }

    public static void task3() {
        System.out.println("Task 3");
        short speed = 45;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Task 4");
        byte age = 15;
        boolean kindergarten = (age >= 2) && (age <= 6);
        boolean school = (age >= 7) && (age <= 18);
        boolean university = (age > 18) && (age < 24);
        boolean work = (age >= 24);
        if (kindergarten) {
            System.out.println("В возрасте " + age + " нужно посещать детский сад.");
        }
        if (school) {
            System.out.println("В возрасте " + age + " нужно посещать школу.");
        }
        if (university) {
            System.out.println("В возрасте " + age + " нужно посещать университет.");
        }
        if (work) {
            System.out.println("В возрасте " + age + " нужно идти работать.");
        }
    }

    public static void task5() {
        System.out.println("Task 5");
        byte childAge = 14;
        if (childAge < 5) {
            System.out.println("В возрасте " + childAge + " нельзя кататься на аттракционе ");
        }
        ;
        if (childAge >= 5 && childAge < 14) {
            System.out.println("В возрасте " + childAge + " можно кататься на аттракционе с сопровождением ");
        }
        ;
        if (childAge >= 14) {
            System.out.println("В возрасте " + childAge + " можно кататься на аттракционе");
        }
        ;
    }

    public static void task6() {
        System.out.println("Task 6");
        int people = 23;
        int standing = 102;
        int seats = 60;
        if (people >= (standing + seats)) {
            System.out.println("В вагоне не осталось мест");
        }
        if ((people >= seats) && (people < standing + seats)) {
            System.out.println("В вагоне есть стоячие места.");
        }
        else {
            System.out.println("В вагоне есть сидячие места.");
        }
    }
    public static void task7() {
        System.out.println("Task 7");
        int one = 23;
        int two = 64;
        int three = 24;
        if ((one > two) && (one > three)) {System.out.println( one + " - самое большое число");}
        if ((two > one) && (two > three)) {System.out.println( two + " - самое большое число");}
        if ((three > one) && (three > two)) {System.out.println( three + " - самое большое число");}
    }
}