import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Veuillez saisir le 1er nombre :");
        Scanner x1=new Scanner(System.in);
        int x= x1.nextInt();

        System.out.println("Veuillez saisir le 2nd nombre :");
        Scanner x2=new Scanner(System.in);
        int y= x2.nextInt();

        if(x<y){
            System.out.println("Le maximum des deux nombres est : " + y);
        }
        else if (x>y){
            System.out.println("Le maximum des deux nombres est : " + x);
        }
        else{
            System.out.println("Les deux nombres sont égaux et valent : " + x);
        }
        x1.close();
        x2.close();
    }
}
