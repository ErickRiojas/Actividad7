import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero, fibo1 = 0, fibo2 = 0, i = 0;


        do {
            System.out.print("Introduce numero mayor que 1: ");
            numero = leer.nextInt();
        } while (numero <= 1);
        sprimo(numero, i);
        sfibo(fibo1, fibo2, numero, i);
    }

    private static int sprimo(int numero, int i) {
        System.out.println("Los numeros primos menores a "+numero+" son:");
        for (i = 2; i < numero; i++) {
            int conteo = 2;
            boolean primo = true;
            while (primo == true && conteo < i) {

                if (i % conteo == 0) {
                    primo = false;
                } else {
                    conteo++;
                }
            }            if (primo){
                System.out.println(i);
            }
        }
        return numero;
    }

    private static int sfibo(int fibo1, int fibo2, int numero, int i) {
        System.out.println("Los " + numero + " primeros numeros de la serie de Fibonacci son:");
        fibo1=1;
        fibo2=1;
        System.out.print(fibo1 + " ");
        for(i=2;i<=numero;i++){
            System.out.print(fibo2 + " ");
            fibo2 = fibo1 + fibo2;
            fibo1 = fibo2 - fibo1;
        }
        return fibo1;
    }
}
