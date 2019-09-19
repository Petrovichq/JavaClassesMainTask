package com.home.study;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        DataBase booksBase = new DataBase();
        booksBase.createRandomBase(10);
        booksBase.add(new Book().getRandomBook());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sort by(author,publishing,after year):");
        String  input = scanner.nextLine();
        switch (input){
            case "author":
                System.out.print("Write author's name:");
                String  requestAuthor = scanner.nextLine();
                DataBase authors = booksBase.sortByAuthor(requestAuthor);
                authors.print();
                break;
            case "publishing":
                System.out.print("Write name of publishing:");
                String  requestPublishing = scanner.nextLine();
                DataBase publishing = booksBase.sortByPublishing(requestPublishing);
                publishing.print();
                break;
            case "after year":
                System.out.print("Write year:");
                int requestYear = scanner.nextInt();
                DataBase years = booksBase.sortByYear(requestYear);
                years.print();
                break;
            default: System.out.println("Incorrect request.");
        }
    }
}
