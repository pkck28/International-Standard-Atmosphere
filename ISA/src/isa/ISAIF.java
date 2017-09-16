package isaif;
import java.util.*;
public class ISAIF 
{
    public static void main(String[] args)
    {
        double hp,k,d,g,h,i,c,j,m,n,o,q,s,t,v;
        Scanner u;
        u = new Scanner(System.in);
        System.out.println("Please enter the altitude (in m) ");
        hp = u.nextDouble();
        if( hp >= 0 & hp <= 11000)
        {
            k = 288.15 - 0.0065*(hp);
            d = 101325 * Math.pow((k/288.15),((9.80665/(287*0.0065))));
            g = (d/(287*k));
            System.out.println("Temperature is " + k + " K");
            System.out.println("pressure is " + d + " Pa");
            System.out.println("Density is " + g + " kg/m^3");
        }
        else if ( hp >= 11000 & hp <= 20000)
        {
                   h = 288.15 - 0.0065*(11000);
                   i = 101325 * Math.pow((h/288.15),((9.80665/(287*0.0065))));
                   c = i * (Math.exp((-9.806665*(hp-11000)/(287*h))));
                   j = c /(287*h);
                   System.out.println("Temperature is " + h + " K");
                   System.out.println("Pressure is " + i + " Pa");
                   System.out.println("Density is " + j +  " kg/m^3 ");
        }
        else if( hp >= 20000 & hp <= 32000)    
        {
                   h = 288.15 - 0.0065*(11000);
                   i = 101325 * Math.pow((h/288.15),((9.80665/(287*0.0065))));
                   m = i * (Math.exp((-9.806665*(20000-11000)/(287*h))));
                   n = h + 0.001*(hp -20000);
                   o = m * (Math.pow((n/h),(-(9.80665/(287*0.001)))));
                   q = o / (287*n);
                   System.out.println("Temperature is " + n + " K");
                   System.out.println("Pressure is " + o + " Pa");
                   System.out.println("Density is " + q + " Kg/m^3");
        }    
        else if( hp >= 32000 & hp <= 47000)
        {
                   h = 288.15 - 0.0065*(11000);
                   i = 101325 * Math.pow((h/288.15),((9.80665/(287*0.0065))));
                   m = i * (Math.exp((-9.806665*(20000-11000)/(287*h))));
                   n = h + 0.001*(32000 -20000);
                   o = m * (Math.pow((n/h),(-(9.80665/(287*0.001)))));
                   n = h + 0.001*(32000 -20000);
                   s = n + 0.0028*(hp-32000);
                   t = o * (Math.pow((hp/n),(-(9.80665/(287*0.0028)))));
                   v = t / (287/s);
                   System.out.println("Temperature is " + s + " K");
                   System.out.println("Pressure is " + t + " Pa");
                   System.out.println("Density is " + v + " kg/m^3");
        }    
    }
}
