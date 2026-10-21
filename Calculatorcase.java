/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculatorcase;

/**
 *
 * @author Administrator
 */import java.util.Scanner;
public class Calculatorcase {

    public static void main(String[] args) {
        Scanner userinput=new Scanner(System.in);
        int num1;
        int num2;
        
        int operator;
        System.out.println("enter num1");
        num1=userinput.nextInt();
         System.out.println("enter num2");
        num2=userinput.nextInt();
         System.out.println("enter an operator(+,-,*,/,%)");
        System.out.println("1:addition(+)");
          System.out.println("2:subtraction(-)");
          System.out.println("1:multiplicatin(*)");
            System.out.println("1:division(/)");
              System.out.println("1:modulus(%)");
              operator=userinput.nextInt();
              switch(operator){
                  case 1:
                   System.out.println(num1+num2) ;
                   break;
                   case 2:
                   System.out.println(num1-num2) ;
                   break;
                   case 3:
                   System.out.println(num1*num2) ;
                   break;
                   case 4:
                       if(num2>num2){
                   System.out.println(num1+num2) ;
                       }
                       else{
                            System.out.println ("invalid");
                       }
                   break;
                   default:
                       System.out.println("invalid");
              }
    }
}
