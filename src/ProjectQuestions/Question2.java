package ProjectQuestions;

public class Question2 {
    public static void main(String[] args) {
        int[]array= { 12, 8,20,34,10,-1 };
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum=sum + array[i];
        }
        System.out.println("The total is "+ sum);
    }
}
