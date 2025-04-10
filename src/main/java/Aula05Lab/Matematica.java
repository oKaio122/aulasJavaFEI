package Aula05Lab;

public class Matematica {


    public static int max3(int num1, int num2, int num3){
        return Math.max(num1, Math.max(num2, num3));
    }

    public static boolean impar(boolean b1, boolean b2, boolean b3){
        return (b1 && !b2 && !b3) || (!b1 && b2 && !b3) || (!b1 && !b2 && b3) || (b1 && b2 && b3);
    }

    public static boolean maioria(boolean b1, boolean b2, boolean b3){
        return (b1 && b2) || (b1 && b3) || (b2 && b3);
    }
}
