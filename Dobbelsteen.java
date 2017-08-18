package dobbelsteen;

/*
 * dice
 * jor sanders
 */

import java.util.*;
public class Dobbelsteen {

    public static void main(String[] args) {
        
        char inputSymbol = readChar();
        int thrown, counter = 0, min = 1, max = 6;
        
        //keeps throwing the dice until you have hit 6
        do{
           thrown = min + (int)(Math.random() * ((max - min) + 1));
           printDice (thrown, inputSymbol);
           counter++ ;
          }while (thrown != 6);  
        
        System.out.println("you have trown 6 in " + counter + " turns.");
        System.out.println("Have a smiley :D");
                
    }
    //reads the character for the eye of the dice
    public static char readChar(){
        Scanner stdin = new Scanner(System.in);
        
        System.out.print("Input drawing character for the dice here: ");
        char inputSymbol = stdin.next(".").charAt(0);
        return inputSymbol;
    }
            
    
   //draws the dices
   public static void printDice (int a, char inputSymbol){
    
       switch (a) {
	case 1:  System.out.println(
            "-----" + '\n' +
            "|   |" + '\n' +
            "| " + inputSymbol + " |" + '\n' +
            "|   |" + '\n' +    
            "-----" + '\n' 
        );
        break;
            
        case 2:  System.out.println(
            "-----" + '\n' +
            "|" + inputSymbol + "  |" + '\n' +
            "|   |" + '\n' +
            "|  " + inputSymbol + "|" + '\n' +    
            "-----" + '\n'   
        );
        break;
            
        case 3:  System.out.println(
            "-----" + '\n' +
            "|" + inputSymbol + "  |" + '\n' +
            "| " + inputSymbol + " |" + '\n' +
            "|  " + inputSymbol + "|" + '\n' +    
            "-----" + '\n'  
        );
        break;
            
        case 4:  System.out.println(
            "-----" + '\n' +
            "|" + inputSymbol + " " + inputSymbol + "|" + '\n' +
            "|   |" + '\n' +
            "|" + inputSymbol + " " + inputSymbol + "|" + '\n' +    
            "-----" + '\n'  
        );
        break;
            
        case 5:  System.out.println(
            "-----" + '\n' +
            "|" + inputSymbol + " " + inputSymbol + "|" + '\n' +
            "| " + inputSymbol + " |" + '\n' +
            "|" + inputSymbol + " " + inputSymbol + "|" + '\n' +    
            "-----" + '\n'  
        );
        break;
            
        case 6:  System.out.println(
            "-----" + '\n' +
            "|" + inputSymbol + " " + inputSymbol + "|" + '\n' +
            "|" + inputSymbol + " " + inputSymbol + "|" + '\n' +
            "|" + inputSymbol + " " + inputSymbol + "|" + '\n' +    
            "-----" + '\n' 
        );
        break;
	}

    }
  
}