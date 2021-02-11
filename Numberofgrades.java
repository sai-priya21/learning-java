import java.util.Scanner;
public class Numberofgrades 
 {
public static void main(String[] args)
 { int count=0;
        int NofA_grades = 0;
        int NofB_grades = 0;
        int NofC_grades = 0;
        int NofD_grades = 0;
        int NofF_grades = 0;
        
        Scanner x = new Scanner(System.in);
        System.out.println("Please enter the list of exam scores as integer in range 0 to 100 :");
        int examscore = x.nextInt();
 while(examscore>=0 && examscore<=100)
 {
       count++;
 if(examscore>=90 && examscore<=100)
        NofA_grades++;
    else if(examscore>=80 && examscore<=89)
        NofB_grades++;
    else if(examscore>=70 && examscore<=79)
        NofC_grades++;
    else if(examscore>=60 && examscore<=69)
        NofD_grades++;
    else if(examscore>=0 && examscore<=59)
        NofF_grades++;
    examscore = x.nextInt();
 } 
 System.out.println("Total number of grades :"+ count);
 System.out.println("Number of A's ="+ NofA_grades);
 System.out.println("Number of B's ="+ NofB_grades);
 System.out.println("Number of C's ="+ NofC_grades);
 System.out.println("Number of D's ="+ NofD_grades);
 System.out.println("Number of F's ="+ NofF_grades);
 } 
} 