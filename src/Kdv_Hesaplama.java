import java.util.Scanner;

    public class Kdv_Hesaplama {
        public static void main(String[] args) {
            double fiyat, kdvlifiyat, kdvtutari, kdv=0.18;


            Scanner input= new Scanner(System.in);
            System.out.println("fiyat nedir? : ");
            fiyat= input.nextDouble();

            kdvlifiyat= ((fiyat * kdv) + fiyat);
            kdvtutari= kdvlifiyat - fiyat;

            System.out.println(fiyat);
            System.out.println(kdvlifiyat);
            System.out.println(kdvtutari);

            boolean yenikdv = fiyat<1000 & fiyat>0;
            System.out.println(yenikdv ? 0.18 : 0.08);




        }
    }

