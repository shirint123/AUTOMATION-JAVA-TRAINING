//11. Book class

  // * Fields: 'title', 'author'.
   //* Method: 'showInfo()'.
   //* Create 3 book objects and print their info.


package com.aw.automationtraining;

/*import java.util.Scanner;*/

public class Book 
{
    String title;
    String author;
    public void showInfo()
    {
        System.out.println(" Book Title : "+title);
        System.out.println(" Author of book : "+author);
    }
     public static void main(String[] args) 
     {
        Book b1 =new Book();
        Book b2 =new Book();
        Book b3 =new Book();
       
        b1.title = "Automic Habbits";
        b1.author = "James Clear";

        b2.title = "The Alchemist";
        b2.author = " Paulo Coelho";

        b3.title = " The Power of Positive Thinking ";
        b3.author = " Norman Peale";

        System.out.println(" Book1 info : ");
        b1.showInfo();

        System.out.println(" Book2 info : ");
        b2.showInfo();

        System.out.println(" Book3 info : ");
        b3.showInfo();
        


     }   
}
