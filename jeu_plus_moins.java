import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        Random random = new Random();
        int nbr_random = random.nextInt(10);
        int compteur = 0;
        while (compteur<10){
            compteur+=1;
            System.out.println("Veuillez saisir un nombre :");
            int variable=x.nextInt();
            if (variable==nbr_random){
                System.out.println("Gagner le nombre était : " + nbr_random);
                break;
            }
            else{
                if(variable<nbr_random){
                    System.out.println("Plus");
                }
                else if (variable>nbr_random){
                    System.out.println("Moins");
                }
            }
        }
        if (compteur==10){
            System.out.println("Perdu ! Le nombre était : " + nbr_random);
        }
    }
}
