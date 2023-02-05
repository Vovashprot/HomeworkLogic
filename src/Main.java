public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Task 1");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Вы достигли совершеннолетия");
        }
        else {
            System.out.println("Вы ещё не достигли совершеннолетия");
        }
    }

    public static void task2 () {
        System.out.println("Task 2");
      byte temp = 3;
      if (temp >= 5) {
          System.out.println("Сегодня тепло, можно идти без шапки");
      }
      else {
          System.out.println("На улице холодно, нужно надеть шапку");
      }
    }
    public static void task3 () {
        System.out.println("Task 3");
        short speed = 45;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
    }
    public static void task4 () {
        System.out.println("Task 4");
        byte age = 15;
        boolean kindergarten = (age >= 2 ) && (age <= 6);
        boolean school = (age >= 7 ) && (age <= 18);
        boolean university = (age > 2 ) && (age < 24);
        boolean work = (age => 24);
        if (kindergarten) {System.out.println("В возрасте " +age+ " нужно посещать детский сад.");}
        if (school) {System.out.println("В возрасте " +age+ " нужно посещать детский школу.");}
        if (university) {System.out.println("В возрасте " +age+ " нужно посещать университет.");}
        if (work) {System.out.println("В возрасте " +age+ " нужно идти работать.");}
    }
}