
package CODSOFT;

import java.util.*;

public class gradecalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[5];
        int total = 0;
        System.out.println("Enter marks for each subject out of 100");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];
        }
        System.out.println("TOTAL :" + total);
        double percentage = total/5.0;
        System.out.println("PERCENTAGE:" + percentage);

        if(percentage<=20){
            System.out.println("GRADE : E");
        }
        else if(percentage<=40 && percentage>20){
            System.out.println("GRADE : D");
        }
        else if(percentage<=60 && percentage>40){
            System.out.println("GRADE : C");
        }
        else if(percentage<=80 && percentage>60){
            System.out.println("GRADE : B");
        }
        else if(percentage<=100 && percentage>80){
            System.out.println("GRADE : A");
        }
        
        
        
        sc.close();
    }
}
