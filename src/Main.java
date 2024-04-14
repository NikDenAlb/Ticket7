//Билет №7 Напишите пример обработки нескольких исключений в одном блоке catch.


public class Main {
    public static void main(String[] args) {
        try {
            check(19);
            System.out.println("Доступ разрешен");
        } catch (LowAgeException|NeedGuardianException e) {
            System.out.println(e.getMessage());
        }
    }


    static void check(int age) {
        if (age < 14) {
            throw new LowAgeException("Доступ закрыт");
        }
        if (age < 18) {
            throw new NeedGuardianException("Нужен опекун");
        }
    }
}