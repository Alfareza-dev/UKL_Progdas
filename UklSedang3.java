import java.util.Random;
import java.util.Scanner;

public class UklSedang3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rendem = new Random(); 

    String lanjut;

    char [] operator = {'+', '-', '*', '/'}; 

    
    do {
    int rendem1 = rendem.nextInt(100);
    int rendem2 = rendem.nextInt(100);

    char op = operator[rendem.nextInt(operator.length)]; 
    
    double hasil = 0; 
    switch (op) {
        case '+':
            hasil = rendem1 + rendem2;
            break;
        case '-':
            hasil = rendem1 - rendem2;
            break;
        case '*':
            hasil = rendem1 * rendem2;
            break;
        case '/':
            hasil = rendem1 / rendem2;
            break;
    }

    System.out.println("Soal : ");
    System.out.println(rendem1 + " " + op + " " + rendem2);
    double jawab = input.nextDouble();
    input.nextLine();
    System.out.println("jawabannya adalah" + hasil); 


    System.out.println("apakah anda ingin melanjutkan kuis? (ya/tidak)"); 
    lanjut = input.nextLine();
    } while (lanjut.equalsIgnoreCase("ya"));
    input.close();


}
}
