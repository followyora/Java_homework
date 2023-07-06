package homework;


public class Main {


    public static void main(String[] args) {

        char a = 'G';
        int b = 89;
        byte c = 4;
        short d = 56;
        float e = 4.7333436F;
        double f = 4.355453532;
        long g = 12121;

        System.out.println("Character: " + a);
        System.out.println("Integer: " + b);
        System.out.println("Byte: " + c);
        System.out.println("Short: " + d);
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Long: " + g);
        System.out.println();
        System.out.println();

        System.out.println("****************************");
        System.out.println("Задание со звёздочкой!");
        System.out.println("****************************");


        int i = 345;
        int hundred = i / 100; // Отделяем первое число
        int dozens = i / 100 / 10;// Отделяем второе число
        int units = i % 10; // Отделяем третье число

        System.out.println("Число " + i + " -> " + hundred + "," + dozens + "," + units + ".");


    }
}