import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        //Creacion de Variables
        int Num1;int Num2;int Num3;
        int Max;int Med; int Min;
        Scanner leer = new Scanner(System.in);

        //Comienzo del programa
        System.out.println("Ingrese tres numeros enteros");
        System.out.println("Primer numero: ");//Ingreso de datos
        Num1 = leer.nextInt();
        System.out.println("Segundo numero: ");
        Num2 = leer.nextInt();
        System.out.println("Tercer numero: ");
        Num3 = leer.nextInt();

        //Ordenando los numeros
        if (Num1 >= Num2 && Num1 >= Num3){
            Max = Num1;
            if (Num2 >= Num3){
                Med = Num2;
                Min = Num3;
            } else {
                Med = Num3;
                Min = Num2;
            }
        } else {
            if (Num2 > Num1 && Num2 >= Num3){
                Max = Num2;
                if (Num1 >= Num3){
                    Med = Num1;
                    Min = Num3;
                } else {
                    Med = Num3;
                    Min = Num1;
                }
            } else {
                Max = Num3;
                if (Num1 >= Num2){
                    Med = Num1;
                    Min = Num2;
                } else {
                    Med = Num2;
                    Min = Num1;
                }
            }
        }

        //Imprimiendo los numeros
        System.out.println("El numero mayor es: " + Max + "\nEl numero del medio es: " + Med + "\nEl numero menor es: " + Min);
    }
}
