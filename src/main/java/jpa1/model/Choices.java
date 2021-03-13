package jpa1.model;

import java.util.List;
import java.util.Scanner;

import jpa1.ent.Person;

public class Choices {
	private static Person input() {
		try {
		System.out.println( "write the cin:");
   	 	int cin= ( new Scanner( System.in ) ).nextInt();   	 
   	 	System.out.println( "write the first name:");
		 String nom= ( new Scanner( System.in ) ).nextLine();
		 System.out.println( "write the second name:");
		 String prenom= ( new Scanner( System.in ) ).nextLine();
		 System.out.println( "write the tel:");
		 String tel= ( new Scanner( System.in ) ).nextLine();
		 System.out.println( "write the email:");
		 String email= ( new Scanner( System.in ) ).nextLine();
		 return new Person(cin,nom,prenom,tel,email);
		}catch(Exception e) {
			System.out.println( "you must write the number from cin!");
			return null;
		}
		
   }
	private static int getId() {
		try {
		System.out.println( "write the id:");
		return ( new Scanner( System.in ) ).nextInt();
		}catch(Exception e) {
			System.out.println( "you must write the number from id!");
			return -1;
			
		}
	}
	public static void insert() {		
		 System.out.println( "write the new person:");
		 Person person=input();
       Manager.insert( person );
       fetch();
   }
	public static void update(  ) {
		int id=  getId();
		if(id>0) {
		System.out.println( "update the person find id="+id+" :");
		Person personUpdate=input();
		Manager.update(personUpdate,id);
		fetch();
		}
	 }
	public static void delete(  ) {
		int id=  getId();
		if(id>0) {
		Manager.delete(id);
		fetch();
		}
	 }
	    
	public static void fetch() {
   	 List<Person> pers = Manager.showList();
        for ( Person p : pers ) 
            System.out.println( p );
     
   }
}
