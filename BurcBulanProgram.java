/**
 * BurcBulanProgram
 */
import java.util.Scanner;

public class BurcBulanProgram {

    public static void main(String[] args) {
        
        int mounth,day;

        Scanner input = new Scanner(System.in);
        System.out.print("Dogdugun Ayı Gir Bakalım : ");
        mounth = input.nextInt();

        if (1 <= mounth && mounth <= 12 ){
            System.out.print("Dogdugun Günü Gir Kenks : ");
            day = input.nextInt();
            if ((mounth == 1) && ((1 <= day) && (day <= 21))){

                System.out.println("Burcun : \"Oğlak\"");

            } else if ((mounth == 1) && ((22 <= day) && (day <= 31))){

                System.out.println("Burcun : \"Kova\"");

            } else if ((mounth == 2) && ((1 <= day) && (day <= 19))){

                System.out.println("Burcun : \"Kova\"");

            } else if ((mounth == 2) && ((20 <= day) && (day <= 28))){

                System.out.println("Burcun : \"Balık\"");

            } else if ((mounth == 3) && ((1 <= day) && (day <= 20))){

                System.out.println("Burcun : \"Balık\"");

            } else if ((mounth == 3) && ((21 <= day) && (day <= 31))){

                System.out.println("Burcun : \"Koç\"");

            } else if ((mounth == 4) && ((1 <= day) && (day <= 20))){

                System.out.println("Burcun : \"Koç\"");

            } else if ((mounth == 4) && ((21 <= day) && (day <= 30))){

                System.out.println("Burcun : \"Boğa\"");

            } else if ((mounth == 5) && ((1 <= day) && (day <= 21))){

                System.out.println("Burcun : \"Boğa\"");

            } else if ((mounth == 5) && ((22 <= day) && (day <= 31))){

                System.out.println("Burcun : \"ikizler\"");

            } else if ((mounth == 6) && ((1 <= day) && (day <= 22))){

                System.out.println("Burcun : \"ikizler\"");

            } else if ((mounth == 6) && ((23 <= day) && (day <= 30))){

                System.out.println("Burcun : \"Yengeç\"");

            } else if ((mounth == 7) && ((1 <= day) && (day <= 22))){

                System.out.println("Burcun : \"Yengeç\"");

            } else if ((mounth == 7) && ((23 <= day) && (day <= 31))){

                System.out.println("Burcun : \"Aslan\"");

            } else if ((mounth == 8) && ((1 <= day) && (day <= 22))){

                System.out.println("Burcun : \"Aslan\"");

            } else if ((mounth == 8) && ((23 <= day) && (day <= 31))){

                System.out.println("Burcun : \"Başak\"");

            } else if ((mounth == 9) && ((1 <= day) && (day <= 22))){

                System.out.println("Burcun : \"Başak\"");

            } else if ((mounth == 9) && ((23 <= day) && (day <= 30))){

                System.out.println("Burcun : \"Terazi\"");

            } else if ((mounth == 10) && ((1 <= day) && (day <= 22))){

                System.out.println("Burcun : \"Terazi\"");

            } else if ((mounth == 10) && ((23 <= day) && (day <= 31))){

                System.out.println("Burcun : \"Akrep\"");

            } else if ((mounth == 11) && ((1 <= day) && (day <= 21))){

                System.out.println("Burcun : \"Akrep\"");

            } else if ((mounth == 11) && ((22 <= day) && (day <= 3))){

                System.out.println("Burcun : \"Yay\"");

            } else if ((mounth == 12) && ((1 <= day) && (day <= 21))){

                System.out.println("Burcun : \"Yay\"");

            } else if ((mounth == 12) && ((22 <= day) && (day <= 31))){

                System.out.println("Burcun : \"Oğlak\"");

            } else {
                System.out.println("Günü yanlış girdiniz \nTekrar deneyiniz !!");
            }

        } else {
            System.out.println("Kenks AY gir dedik sen ne girdin biliyosun ki 12 ay mevcudumuz \nTekrar Dene !!");
        }

    }
}