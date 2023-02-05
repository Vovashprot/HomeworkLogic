public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
}