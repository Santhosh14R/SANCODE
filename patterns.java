import javax.swing.plaf.synth.SynthTextAreaUI;

public class patterns {
    public static void main(String[] args){
        int n=5;
        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        paterrn5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n); //need to do
    }

    public static void pattern10(int n) {
        for (int i = 0; i<n ; i++) {
            // Print leading spaces for alignment
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
                for (int j = i; j <n; j++) {
                    System.out.print(n-j);
                }
                System.out.println("");
            }
        }

    public static void pattern9(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            for(int j=i;j<=n-1;j++){
                System.out.print(j+1);
            }
            System.out.println("");
        }
/*
        12345
        22345
        33345
        44445
        55555

 */
    }

    public static void pattern8(int n) {
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(num);
                num++;
            }
            System.out.println("");
        }
        /*
        12345
        678910
        1112131415
        1617181920
        2122232425

         */
    }

    public static void pattern7(int n) {
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=(i-1);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*n)-(2*i-1);j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
 /*
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

  */
    }

    public static void pattern6(int n) {
        for(int i=1;i<=n;i++) {
        for(int j=1;j<=(i-1);j++){
            System.out.print("  ");
        }
        for(int j=1;j<=(2*n)-(2*i-1);j++){
            System.out.print("* ");
        }
        System.out.println("");
        }
   /*
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *           */
    }

    public static void paterrn5(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
 /*     *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *  */
    }

    public static void pattern4(int n) {
        for(int i=n;i>0;i--) {
            for (int j=i;j>0;j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
 /*     54321
        4321
        321
        21
        1 */
    }

    public static void pattern3(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
 /*     0
        01
        012
        0123
        01234 */
    }

    public static void pattern2(int n) {
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
/*      1234
        123
        12
        1 */
    }

    public static void pattern1(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    /*      *****
            *****
            *****
            *****
            *****  */
}
