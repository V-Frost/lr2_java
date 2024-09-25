import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        byte b1 = 2;
        byte b2 = 5;
        double d1;
        double d2;
        char c1; // символьна змінна без початкового значення

        d1 = b1 + (b2 / 10.0);

        Random random = new Random();
        d2 = random.nextDouble() * 100;

        // Округлення d2 до найближчого більшого цілого і привласнення b1
        b1 = (byte) Math.ceil(d2);

        // Виведення результатів
        System.out.println("Значення d1: " + d1);
        System.out.println("Випадкове значення d2: " + d2);
        System.out.println("Округлене значення d2 до найближчого більшого цілого (b1): " + b1);

        double y = Math.pow((d1 + d2), 0.5) / Math.pow(Math.sin(b1) + Math.cos(b2), 2);
        System.out.println("Значення виразу: " + y);

    }
}