package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String yesOrNo = "";

        //Create an array list variable
        ArrayList<Person> thePersonList = new ArrayList<Person>();

        //Add to

        //Create a new Person object
        do {
            Person person = new Person();
            System.out.println("Enter the person's first name");
            person.setFirstName(keyboard.nextLine());
            thePersonList.add(person);

            System.out.println("Enter the person's last name");
            person.setLastName(keyboard.nextLine());
            thePersonList.add(person);

            System.out.println("Enter the person's address");
            person.setAddress(keyboard.nextLine());
            thePersonList.add(person);

            System.out.println("Enter the person's phone number");
            person.setPhoneNumber(keyboard.nextLine());
            thePersonList.add(person);

            System.out.println("Enter the person's email");
            person.setEmail(keyboard.nextLine());
            thePersonList.add(person);

            do {

                System.out.println("Do you want to add another person?(Y/N)");
                yesOrNo = keyboard.nextLine();
                if (!yesOrNo.equalsIgnoreCase("y") && !yesOrNo.equalsIgnoreCase("n")) ;
                {
                    System.out.println("Invalid Option. Please enter 'Y' or 'N'");
                    yesOrNo = keyboard.nextLine();
                }
            } while (!yesOrNo.equalsIgnoreCase("y") && !yesOrNo.equalsIgnoreCase("n"));

        } while (yesOrNo.equalsIgnoreCase("y") || yesOrNo.equalsIgnoreCase("n"));

        for (Person eachPerson : thePersonList)

        {
            System.out.println(eachPerson.getFirstName());
            System.out.println(eachPerson.getLastName());
            System.out.println(eachPerson.getAddress());
            System.out.println(eachPerson.getPhoneNumber());
            System.out.println(eachPerson.getEmail());

        }
    }
        public static void testArrayLists()
        {
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("First String");
            arrayList.add("Second String");
            arrayList.add("Third String");
            arrayList.add("Fourth String");
            arrayList.add("Fifth String");
            System.out.println("This arraylist has"+arrayList.size()+"items");
            for(int counter =0; counter < arrayList.size(); counter++)
            {
                System.out.println(arrayList.get(counter));
            }

            System.out.println(" ");

            for(String eachItem: arrayList)

            {
                System.out.println(eachItem);

        
    }
 }
}
