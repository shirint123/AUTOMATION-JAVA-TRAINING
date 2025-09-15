
 package com.aw.automationtraining;

public class MiniChllangeAssignment4 {

    int maths = 75;
    int science = 60;
    int english = 80;
    float percentage;
    int totalMarks;
    

    public static void main(String[] args) {
        
        MiniChllangeAssignment4 m1 =new MiniChllangeAssignment4();
        m1.totalMarks=(m1.maths+m1.science+m1.english);
        System.out.println (" Total of "+ m1.maths +" , "+ m1.science + " & "+ m1.english + 
        " = " + m1.totalMarks);
        m1.percentage = ((m1.totalMarks*100f)/300f);
        System.out.println(" Percentage = "+m1.percentage);
        String result = (m1.percentage>=40) ? " Pass ":" Fail ";
        System.out.println(" Result = "+result);

    }

}