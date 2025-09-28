//15. Movie class

  // * Fields: 'title', 'rating'.
   //* Method: 'printDetails()'.
   //* Create 2 movies and show details


package com.aw.automationtraining;

public class Movie 
{
    String title;
    int rating;

    public void printDetails(String title, int rating)
    {
        System.out.println(" Title of the movie : "+title);
        System.out.println(" Rating of the moview : "+rating);
    }

    public static void main(String[] args) 
    {
        Movie m1 = new Movie();
        Movie m2 = new Movie();

        System.out.println(" Movie 1 details ");
        m1.title = " test1 ";
        m1.rating = 7;
        m1.printDetails(m1.title,m1.rating);

        System.out.println(" Movie 2 details ");
        m2.title = " test2 ";
        m2.rating = 9;       
        m2.printDetails(m2.title,m2.rating);

    }
    
}
