package isa;
import java.util.*;
public class ISA 
{
    public static void main(String[] args)
    {
       int e;
       double a,b,c,d,g,h,i,j,k,m,n,o,q,r,s,t,v;
       Scanner y,f,p,z,w,u;
       y = new Scanner(System.in);
       f = new Scanner(System.in);
       p = new Scanner(System.in);
       z = new Scanner(System.in);
       w = new Scanner(System.in);
       u = new Scanner(System.in);
       System.out.println(" Program to find Pressure [Pa] , Temperature [K] and Density [kg/m^3] ");
       System.out.println(" Choose the option of Altitude in which the Object is Flying (less than 50 km)");
       System.out.println(" 1 : Altitude range is 0 km to 11 km.");
       System.out.println(" 2 : Altitude range is 11 km  to 20 km.");
       System.out.println(" 3 : Altitude range is 20 km  to 32 km.");
       System.out.println(" 4 : Altitude range is 32 km  to 47 km.");
       e = y.nextInt();
       switch(e)
       {
           case 1:
           {
               System.out.println("Please enter Altitude ( in m ) : ");
               b = p.nextDouble();
               if(b>=0 & b<=11000 )
               {
                    k = 288.15 - 0.0065*(b);
                    d = 101325 * Math.pow((k/288.15),((9.80665/(287*0.0065))));
                    g = (d/(287*k));
                    System.out.println("Temperature is " + k + " K");
                    System.out.println("pressure is " + d + " Pa");
                    System.out.println("Density is " + g + " kg/m^3");
                    break;
               }
               else
               {
                   System.out.println("Entered Altitude is not in chossen range.");
               }
               break;
            }
           case 2:
            {
               System.out.println("Please enter Altitude ( in m ) : ");
               a = z.nextDouble();
               if( a >= 11000 & a <= 20000)
               {
                   h = 288.15 - 0.0065*(11000);
                   i = 101325 * Math.pow((h/288.15),((9.80665/(287*0.0065))));
                   c = i * (Math.exp((-9.806665*(a-11000)/(287*h))));
                   j = c /(287*h);
                   System.out.println("Temperature is " + h + " K");
                   System.out.println("Pressure is " + i + " Pa");
                   System.out.println("Density is " + j +  " kg/m^3 ");
                   break;
               }
               else
               {
                   System.out.println("Entered Altitude is not in chossen range.");
               }
               break;
            }
           case 3:
           {
               System.out.println("Please enter Altitude ( in m ) : ");
               k = w.nextDouble();
               if(k>=20000 & k <=32000)
               {
                   h = 288.15 - 0.0065*(11000);
                   i = 101325 * Math.pow((h/288.15),((9.80665/(287*0.0065))));
                   m = i * (Math.exp((-9.806665*(20000-11000)/(287*h))));
                   n = h + 0.001*(k -20000);
                   o = m * (Math.pow((n/h),(-(9.80665/(287*0.001)))));
                   q = o / (287*n);
                   System.out.println("Temperature is " + n + " K");
                   System.out.println("Pressure is " + o + " Pa");
                   System.out.println("Density is " + q + " Kg/m^3");
                   break;
               }
               else
               {
                   System.out.println("Entered Altitude is not in chossen range.");
               }
               break;
           }   
           case 4:
           {
               System.out.println("Please enter Altitude ( in m ) :");
               r = u.nextDouble();
               if ( r>=32000 & r <= 47000)
               {
                   h = 288.15 - 0.0065*(11000);
                   i = 101325 * Math.pow((h/288.15),((9.80665/(287*0.0065))));
                   m = i * (Math.exp((-9.806665*(20000-11000)/(287*h))));
                   n = h + 0.001*(32000 -20000);
                   o = m * (Math.pow((n/h),(-(9.80665/(287*0.001)))));
                   n = h + 0.001*(32000 -20000);
                   s = n + 0.0028*(r-32000);
                   t = o * (Math.pow((r/n),(-(9.80665/(287*0.0028)))));
                   v = t / (287/s);
                   System.out.println("Temperature is " + s + " K");
                   System.out.println("Pressure is " + t + " Pa");
                   System.out.println("Density is " + v + " kg/m^3");
                   break;
               }
               else
               {
                   System.out.println("Entered Altitude is not in chossen range.");
               } 
               break;
           }    
        }
    } 
}
