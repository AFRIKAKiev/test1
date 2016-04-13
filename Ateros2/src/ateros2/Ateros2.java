/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ateros2;

import java.util.Scanner;

/**
 *
 * @author Slava
 */
public class Ateros2 {

    /**
     * @param args the command line arguments
     */
    
    public static void test1(){
        Scanner sc = new Scanner(System.in);
        double arr[] = new double[4];
        System.out.println("Input 1st number");
        arr[0] = sc.nextDouble();
        System.out.println("Input 2nd number");
        arr[1] = sc.nextDouble();
        System.out.println("Input 3rd number");
        arr[2] = sc.nextDouble();
        System.out.println("Input 4th number");
        arr[3] = sc.nextDouble();
        double temp = arr[0];
        for( int i = 0; i < arr.length; i++ ){
            if ( temp > arr[i] ){
            } else {
                temp = arr[i];
            }
        }
        System.out.println("The biggest number is " + temp);
    }
    
    public static void test2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st number");
        double a1 = sc.nextDouble();
        System.out.println("Input 2nd number");
        double a2 = sc.nextDouble();
        System.out.println("Input 3rd number");
        double a3 = sc.nextDouble();
        System.out.println("Input 4th number");
        double a4 = sc.nextDouble();
        double temp = a1;
        if ( a2 > temp ){
            temp = a2;
        }
        if ( a3 > temp ) {
            temp = a3;
        }
        if ( a4 > temp ) {
            temp = a4;
        }
        System.out.println("The biggest number is " + temp);
    }
    
    public static void test3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st number");
        double a1 = sc.nextDouble();
        System.out.println("Input 2nd number");
        double a2 = sc.nextDouble();
        System.out.println("Input 3rd number");
        double a3 = sc.nextDouble();
        System.out.println("Input 4th number");
        double a4 = sc.nextDouble();
        double temp = a1;
        if ( a2 < temp ){
            temp = a2;
        }
        if ( a3 < temp ) {
            temp = a3;
        }
        if ( a4 < temp ) {
            temp = a4;
        }
        System.out.println("The smallest number is " + temp);
    }
    
    public static int myroundtobigger( double x ){
        //double a1 = x / (int)x;
        if( x > (int)x ){
            return (int)x + 1;
        } else return (int)x;
    }
    
    public static void test4(){
        Scanner sc = new Scanner(System.in);
        int porch = 0;
        int floor = 0;
        System.out.println("Choose ur flat ");
        int a1 = sc.nextInt();
        if ( a1 < 37 ) {
            porch = 1;
            floor = myroundtobigger ( (double)a1 / 4 );
        } else if ( a1 <= 72 ) {
            porch = 2;
            a1 = a1 - 36;
            floor = myroundtobigger ( (double)a1 / 4 );
        } else if ( a1 <= 108 ) {
            porch = 3;
            a1 = a1 - 72;
            floor = myroundtobigger ( (double)a1 / 4 );
        } else if ( a1 <= 144 ) {
            porch = 4;
            a1 = a1 - 108;
            floor = myroundtobigger ( (double)a1 / 4 );
        }
        if ( porch > 0 ){
            System.out.println(porch + " entrance, " + floor + " floor");
        } else {
            System.out.println("Try again later");
        }  
    }
    
    public static void test5(){
        Scanner sc = new Scanner(System.in);
        System.out.println("kol-vo riadkov? ");
        int kolvostrok = sc.nextInt();
        System.out.println("Vvedite simvol ");
        String simvol = sc.next();
        for( int i = 0; i < kolvostrok; i++ ){
            riadok(70, simvol);
            System.out.println("");
        }
    }
    
    public static void riadok(int kolvosimvolov, String simvol){
        for( int j = 0; j < kolvosimvolov; j++ ){
            System.out.print(simvol);
            }
    }
    
    public static void test6(){
        System.out.println(myroundtobigger(35.0 / 4));
    }
    
    public static void main(String[] args) {
        //test1();
        //test2();
        //test3();
        test4();
        //test5();
        //test6();
    }
    
}


