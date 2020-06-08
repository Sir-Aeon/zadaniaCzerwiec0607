package zad2;
import java.util.Scanner;
//Napisz program, który zamieni liczbę dziesiętną na string złożonego z 0 i 1, który jest jego reprezentacją binarną

public class Zad2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę jaką chcesz zamienić na postać binarną");

        int binar = sc.nextInt();
        int result;

        while (binar!=0){
            if(binar % 2 == 0){
               result = binar % 2;
               // System.out.print(result);
                binar /= 2;
            }else if (binar % 2 == 1){
                result = binar % 2;
                //System.out.print(result);
                binar /= 2;
            }else
                break;




            String liczbaString = Integer.toString(result);
            //System.out.print(liczbaString +"\n");
            StringBuilder odw = new StringBuilder(liczbaString).reverse();
            System.out.print(odw);







        }
    }
}


