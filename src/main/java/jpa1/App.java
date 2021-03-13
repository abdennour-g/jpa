package jpa1;

import java.util.Scanner;
import jpa1.model.Choices;


public class App 
{
    public static void main( String[] args )
    {
    	
         while(true) {
        	 try {
           	 System.out.println( "show list of persons.....................1");
        	 System.out.println( "add new person...........................2");
        	 System.out.println( "update person............................3");
        	 System.out.println( "delete person............................4");
        	 System.out.println( "write your choice:");
        	 int choice=( new Scanner( System.in ) ).nextInt();
        	 switch(choice) {
        	 case 1:
        		 Choices.fetch() ;
        		 break;
        	 case 2:
        		 Choices.insert();
        		 break;
        	 case 3:
        		 Choices.update();
        		 break;
        	 case 4:
        		 Choices.delete();
        		 break;
        	 default:break;
        	 }
        	 }catch(Exception e) {
     			System.out.println( "you must write the number from choice!");
     		}
             	}
    }
    
}
