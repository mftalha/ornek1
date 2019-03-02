package sayısal_tasarım_ödevler;

import java.util.Scanner;

public class harazmi_karakök {
    public static void main(String[] args) {
     
        Scanner k =new Scanner(System.in);
        double x=1,y=1;//x dışarıdan aldıgım sayı
        double z=1;
        System.out.println("Bir sayı giriniz ");
        x=k.nextInt();
        while(x >=(y*y))
        {
           z=y;//z  girilen kararköke(x) e en yakın tam sayı karesi
           y+=1;
           if(x == (y*y)) //eyer girilen sayı tam çıkıyorsa karakökden buraya girer sebebi diger türlü aşşagıdaki işlemlerde 1/0 hatası veriyor
           {
               System.out.println(y);
               return; //programı durdur
           }
        }
        x-=(z*z);//x den z yi çıkartarak virgüllü kısma giriş yapıyoruz
        z+=x/(z*2);//z girilen sayının tam kısmı diger işlemle toplıyarak virgüllü kısmını buluyorum
        System.out.println(z);
    }
}
