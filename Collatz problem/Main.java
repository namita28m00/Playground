import java.util.*;

class Main

{

 public static void main(String args[])

 {

   //Try out your code here

   Scanner sc = new Scanner(System.in);

   int n = sc.nextInt();

   System.out.println(n);

   int count = 0;

   while(n != 1) {

     count++;

    if(n%2==0) {

      n /= 2;

      System.out.println(n);

    } else {

      n = 3*n + 1;

      System.out.println(n);

    }

   }

   System.out.println(count);

 }

}

