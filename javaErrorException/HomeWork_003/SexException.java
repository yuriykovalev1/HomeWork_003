package javaErrorException.HomeWork_003;

public class SexException extends Exception {
    public SexException() {
    }

    public void sexException(String i) {
        System.out.println("Exception: SexNotCorrectData");
        System.out.printf("Это неверные данны: %s", i);
        System.out.println();
    }
}