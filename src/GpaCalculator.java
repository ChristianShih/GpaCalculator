/*
 * Lab Ch3
 * Description: GPA Calculator
 * Name: Christian Shih
 * ID: 921026207
 * Class: CSC 21104
 * Semester: Fall2020
 */
import java.util.Scanner; //import the scanner.//
public class GpaCalculator
{
    public static void main(String[] args)
    {
        /*
        Print out the question of asking basic information, and set up scanner.
         */
        System.out.println("What is the subject?");
        System.out.println("What is the percentage you get for the subject?");
        Scanner input= new Scanner(System.in);

        /*
        Set up the variable of GPA, subject and percentage of the subject
        */
        double aPlus=4.0;
        double a=4.0;
        double aMin=3.7;
        double bPlus=3.3;
        double b=3.0;
        double bMin=2.7;
        double cPlus=2.3;
        double c=2.0;
        double dPlus=1.7;
        double d=1.0;
        double f=0.1;
        String subject = input.next();
        double percentage = input.nextDouble();
        System.out.println("The subject is "+subject);

        /*
        Uss if statement to tell the user can not put below 0 or above 100
         */
        if(percentage<0)
        {
            System.out.println("Sorry, the percentage can not below 0%");
        }
        else if(percentage>100)
        {
            System.out.println("Sorry, the percentage can not above 100%");
        }
        else
            {
            System.out.println("Your percentage for "+subject+" is "+percentage+" %");
        }


        /*
        Use if statement to declare the range of the percentage of the subject and shows the letter grade and GPA

         */
        if (percentage>100)
        {
            System.out.println("The letter grade has error, please reenter");
            System.out.println("Can not show the GPA");
        }

        else if(percentage>=97.0)
        {
            System.out.println("The letter grade for "+subject+" is A+");
            System.out.println("The GPA for "+subject+" is "+aPlus);
        }
        else if (percentage>=93.0)
        {
            System.out.println("The letter grade for "+subject+" is A");
            System.out.println("The GPA for "+subject+" is "+a);
        }
        else if (percentage>=90.0)
        {
            System.out.println("The letter grade for"+subject+" is A-");
            System.out.println("The GPA for "+subject+" is "+aMin);
        }
        else if (percentage>=87.0)
        {
            System.out.println("The letter grade for "+subject+" is B+");
            System.out.println("The GPA for "+subject+" is "+bPlus);
        }
        else if (percentage>=83.0)
        {
            System.out.println("The letter grade for"+subject+" is B");
            System.out.println("The GPA for "+subject+" is "+b);
        }else if (percentage>=80.0)
        {
            System.out.println("The letter grade for "+subject+" is B-");
            System.out.println("The GPA for "+subject+" is "+bMin);
        }
        else if (percentage>=77.0)
        {
            System.out.println("The letter grade for"+subject+" is C+");
            System.out.println("The GPA for "+subject+" is "+cPlus);
        }
        else if (percentage>=70.0)
        {
            System.out.println("The letter grade for "+subject+" is C");
            System.out.println("The GPA for "+subject+" is "+c);
        }
        else if (percentage>=67.0)
        {
            System.out.println("The letter grade for"+subject+" is D+");
            System.out.println("The GPA for "+subject+" is "+dPlus);
        }
        else if (percentage>=60.0)
        {
            System.out.println("The letter grade for "+subject+" is D");
            System.out.println("The GPA for "+subject+" is "+d);
        }
        else if(percentage<0)
        {
            System.out.println("The letter grade has error, please reenter");
            System.out.println("Can not show the GPA");
        }
        else
        {
            System.out.println("The letter grade for"+subject+" is F");
            System.out.println("The GPA for "+subject+" is "+f);
        }


    }
}
