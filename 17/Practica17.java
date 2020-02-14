/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica17;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author carlosmargom
 */
public class Practica17 {

 static Scanner keyboard = new Scanner(System.in);
 
    public static void main(String[] args) {
       
 int option;
     
       do{
            userMenu();
            option = keyboard.nextInt();
            switch (option) {//inicio de Switch
                case 1:
                    p1();
                    break;
                case 2:
                    p2();
                    break;
                case 3:
                   // p3();
                    break;
                case 4:
                   // p4();
                    break;
                case 5:
                  //  p5();
                    break;
                case 6:
                    //p6();
                    break;
                case 7:
                    System.out.print("Letter ?:");
                    char letter = (keyboard.next()).charAt(0);
                    String letterBinary=Integer.toBinaryString(letter);
                    System.out.println(letter +"="+ letterBinary);
                    
                  p7();
                    break;
                case 8:
                    System.out.println("word ?:");
                    String str=keyboard.next();
                    String result = StringToBinary(str);
                    System.out.println(result);
                    
                    p8();
                    break;
                case 9:
                    int numChar;
                    do {
                        System.out.print("Give a number between 0 and 255: ");
                        numChar = keyboard.nextInt();
                    } while (numChar > 255 || 0 > numChar);
                    String numconv = p9 (numChar);
                    System.out.println(numconv);
                    System.out.println();
                    p9();
                    break;
                case 10:
                     
                    
                    
                  apart10();
                    break;
                default:
                    System.out.println("This option is not valid");

            }//fin de Switch
             System.out.println("press any key to continue");
             String key= keyboard.next();
        }while (option !=0);
       }
    
     private static void userMenu() {
        System.out.println("1- (Random-roll a DICE): display two random numbers (from 1 to 6).");
        System.out.println("2- (Random-roll a dice N times): Ask the user for number of attempts and visualize the\n" +
"Random die values ​​for N rolls. And it shows the average.");
        System.out.println("3- (Lottery): user pays an amount of money and the system generates random numbers and\n" +
"the return if applicable.");
        System.out.println("4- (Format of a number): ask for a real number and display it with 2 decimals.");
        System.out.println("5- (ASCII): displays all the characters in the ASCII table (printables)");
        System.out.println("Option6: ():");
        System.out.println("Option7: ():");
        System.out.println("Option8: ():");
        System.out.println("Option9: ():");
        System.out.println("Option0: (exit):");

        System.out.print("\n\nOption:");
     }
        
        //7
        
    private static void charToBinary (char ch) {
        
                
        String letterBinary = Integer.toBinaryString(ch); 
        System.out.println(ch +"="+ letterBinary);
        }


      //8
        
        private static String StringToBinary(String str) {
        
            String result ="";
            
            
            char ch=' ';
            for(int i=0; i < str.length(); i++){
               ch= str.charAt(i);
               result += Integer.toBinaryString(ch) + " ";
            }
           
            
            return result;
        }
        
        //9
        
        
        
        
        private static void apart10(){
        
        System.out.println("--------");
        for(int i=0; i<255; i++) { 
            System.out.println(i+ "=" + (char)i );
        }
                
        
        }
       
        
        
        
    

    private static void p1() {

    double preu, tax, result;
    int euro;
    int option;
    //Euros €
    euro = keyboard.nextInt();
    //Convertir en $$
    result = conversorCarlos(euro);
    





    }
    
    private static float conversorCarlos(int euro){
   
            
        float result = 0;    
        
        result = (float) euro / 0.91f;
        
        result = Float.valueOf(euro)/0.91f;
        
        return result;
            
            
            }

    private static void p2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        private static String conversorIntDouble(int euro){
   
            DecimalFormat df = new DecimalFormat("0.000");
             String result = "0";    
        
        //result = (float) euro / 0.91f;
        
        result = String.valueOf(euro/0.91f);
        
        return result;
            
            
            }

    private static void p7() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void p8() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private static void p9() {
        String aChar = new Character((char) numberintchar).toString();
        return aChar;
    }


}
    

