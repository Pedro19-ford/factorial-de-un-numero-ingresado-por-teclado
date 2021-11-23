//programa que calcula el factorial de un numero ingresado por teclado
package factorial;
import java.util.Scanner;
public class factorial {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
int fact=1;
int num;
System.out.print("Introduce numero:-> ");
num = teclado.nextInt();
for(int ind=1;ind<=num;ind++) {
fact*=ind;
}
System.out.println ("el numero es: "+num+ " y su factorial es: "+fact);
}
}
    

