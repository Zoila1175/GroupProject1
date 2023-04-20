package ProjectQuestions;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
       int  number=scan.nextInt();
       boolean Prime=true;
    for(int i=2; i<number; i++){
    if(number%i==0){
        Prime=false;
        break;
    }
}
if(Prime){
    System.out.println(number+ " is Prime");
}else{
    System.out.println(number+" is not Prime");
}
    }
}
