/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4işlemoyunu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Main {
   public static final String ANSI_RESET = "\u001B[0m"; 
public static final String ANSI_BLACK = "\u001B[30m"; 
public static final String ANSI_RED = "\u001B[31m"; 
public static final String ANSI_GREEN = "\u001B[32m"; 
public static final String ANSI_YELLOW = "\u001B[33m"; 
public static final String ANSI_BLUE = "\u001B[34m"; 
public static final String ANSI_PURPLE = "\u001B[35m"; 
public static final String ANSI_CYAN = "\u001B[36m"; 
public static final String ANSI_WHITE = "\u001B[37m"; 
   
   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Your Welcome to 4 Operations Game!");
        
        System.out.println(ANSI_BLUE+"For collection(1)"+"\n"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"For subtraction(2)"+"\n"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"For multiplication(3)"+"\n"+ANSI_RESET);
        System.out.println(ANSI_BLUE+"For compartment(4)"+"\n"+ANSI_RESET);
                        
        System.out.println("Select the operation you want to do."+"\n");
        int secim=input.nextInt();
        int puan=1;
        switch(secim){
            
            case 1:
            System.out.println("Welcome to the collecting game! You have to do 10 operations I chose for you."); 
            for(int i=0;i<20;i++){
                Random r=new Random();
                int a=r.nextInt(100);
                int b=r.nextInt(100);
                
                int islem=a+b;
                System.out.println(a+"+"+b+"="+"?");
                System.out.print("The result of your operation : "); 
                int sonuc=input.nextInt();
 
                if(islem==sonuc){
                    System.out.println(ANSI_GREEN+"Congratulations! You earned 1 point."+ANSI_RESET);
                    puan++;
                   
                    
                }
                else{
                    System.out.println(ANSI_RED+"Sorry! You lost 1 point."+ANSI_RESET); 
                    puan--;
                 
                }
                   i++;     
                }
               System.out.println(ANSI_BLUE+"Your total point "+puan+ANSI_RESET);
                System.out.print("Your level :");
                if(puan<4){
                    System.out.println(ANSI_RED+"Low level"+ANSI_RESET);
                }
                else if(puan>=4 && puan<=7){
                    System.out.println(ANSI_YELLOW+"Normal level"+ANSI_RESET);
                }
                else if(puan>=7 && puan>=10){
                
                System.out.println(ANSI_GREEN+"High level"+ANSI_RESET);
            } 

                break;
                
             case 2:
                
             System.out.println("Welcome to the subtraction game! You have to do 10 operations I chose for you."); 
             for(int i=0;i<20;i++){
                Random r=new Random();
                int a=r.nextInt(100);
                int b=r.nextInt(100);
                if(a>b){
                int islem=a-b;
                System.out.println(a+"-"+b+"="+"?");
                System.out.print("The result of your operation : "); 
                int sonuc=input.nextInt();
               
                    
                
                if(islem==sonuc){
                    System.out.println(ANSI_GREEN+"Congratulations! You earned 1 point."+ANSI_RESET);
                    puan++;
                   
                    
                }
                else{
                    System.out.println(ANSI_RED+"Sorry! You lost 1 point."+ANSI_RESET); 
                    puan--;
                 
                }
                
                   i++;     
                }
                
             }
                System.out.println(ANSI_BLUE+"Your total point "+puan+ANSI_RESET);
                System.out.print("Your level :");
                if(puan<4){
                    System.out.println(ANSI_RED+"Low level"+ANSI_RESET);
                }
                else if(puan>=4 && puan<=7){
                    System.out.println(ANSI_YELLOW+"Normal level"+ANSI_RESET);
                }
                else if(puan>=7 && puan>=10){
                
                System.out.println(ANSI_GREEN+"High level"+ANSI_RESET);
            } 

                
            break;
            
             case 3:
                
             System.out.println("Welcome to the multiplication game! You have to do 10 operations I chose for you."); 
             for(int i=0;i<20;i++){
                Random r=new Random();
                int a=r.nextInt(15);
                int b=r.nextInt(15);
                int islem=a*b;
                System.out.println(a+"x"+b+"="+"?");
                System.out.print("The result of your operation : "); 
                int sonuc=input.nextInt();
               
                    
                
                if(islem==sonuc){
                    System.out.println(ANSI_GREEN+"Congratulations! You earned 1 point."+ANSI_RESET);
                    puan++;
                   
                    
                }
                else{
                    System.out.println(ANSI_RED+"Sorry! You lost 1 point."+ANSI_RESET); 
                    puan--;
                 
                }
                
                   i++;     
                }
                System.out.println(ANSI_BLUE+"Your total point "+puan+ANSI_RESET);
                System.out.print("Your level :");
                if(puan<4){
                    System.out.println(ANSI_RED+"Low level"+ANSI_RESET);
                }
                else if(puan>=4 && puan<=7){
                    System.out.println(ANSI_YELLOW+"Normal level"+ANSI_RESET);
                }
                else if(puan>=7 && puan>=10){
                
                System.out.println(ANSI_GREEN+"High level"+ANSI_RESET);
            } 

                  break;
                  
             case 4:
                
             System.out.println("Welcome to the division game! You Should Take 10 Operations I chose for you."); 
             System.out.println(ANSI_RED+"NOTE: For the sake of ease of processing, please write the whole number of the result of the operation. "+ANSI_RESET);
             for(int i=0;i<20;i++){
                Random r=new Random();
                int a;
                do{
                   a=r.nextInt(100);   
                }while(a<10);
                
                int b=r.nextInt(9);
                int islem=a/b;
                System.out.println(a+"÷"+b+"="+"?");
                System.out.print("The result of your operation : "); 
                int sonuc=input.nextInt();
               
                    
                
                if(islem==sonuc){
                    System.out.println(ANSI_GREEN+"Congratulations! You earned 1 point."+ANSI_RESET);
                    puan++;
                   
                    
                }
                else{
                    System.out.println(ANSI_RED+"Sorry! You lost 1 point."+ANSI_RESET); 
                    puan--;
                 
                }
                
                   i++;     
                }
              System.out.println(ANSI_BLUE+"Your total point "+puan+ANSI_RESET);
                System.out.print("Your level :");
                if(puan<4){
                    System.out.println(ANSI_RED+"Low level"+ANSI_RESET);
                }
                else if(puan>=4 && puan<=7){
                    System.out.println(ANSI_YELLOW+"Normal level"+ANSI_RESET);
                }
                else if(puan>=7 && puan>=10){
                
                System.out.println(ANSI_GREEN+"High level"+ANSI_RESET);
            } 
                  break;
             }
    } 
}
