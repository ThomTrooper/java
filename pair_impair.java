import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Veuillez saisir un nombre :");
        int nombre=x.nextInt();
        if (nombre%2==0){
            System.out.println(nombre + " est pair");
        }
        else {
            System.out.println(nombre + " est impair");
        }
        x.close();
    }
}
