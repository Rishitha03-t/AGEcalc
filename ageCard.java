
import java.util.Scanner;

public class ageCard {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter currentyear");
        int currentyear=sc.nextInt();
        System.out.println("enter birthyear");
        int birthyear=sc.nextInt();
        int ageCard=currentyear-birthyear;
        if(currentyear==0||birthyear>currentyear){
            System.out.println("cant ageCard define,invalid");
        }
        else{
           System.out.println("AGECARD:"+(currentyear-birthyear));
        }

        }
    }

