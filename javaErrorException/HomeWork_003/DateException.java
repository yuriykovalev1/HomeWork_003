package javaErrorException.HomeWork_003;

public class DateException extends Exception {
    public DateException() {
    }

    public void dataException(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("Введите корректный формат даты: %s", i);
        System.out.println();
    }
}