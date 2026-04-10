import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        Float Num1 = teclado.nextFloat();
        System.out.print("Ingrese un numero: ");
        Float Num2 = teclado.nextFloat();

        System.out.println(Sumar(Num1, Num2));

    }

    public static float Sumar(float Num1, float Num2){
        return Num1 + Num2;
    }
}