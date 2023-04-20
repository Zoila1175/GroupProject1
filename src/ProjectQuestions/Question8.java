package ProjectQuestions;

public class Question8 {
    public static void main(String[] args) {
    int array[]= {12, 8,10,-35, 5,34};
         int high=array[0];
         int low=array[0];
    for(int i=0; i<array.length; i++){
        if (array[i] > high) {
        high=array[i];
        }
        if(array[i]<low){
            low=array[i];
        }
    }
        System.out.println("Maximum " + high+" Minimum "+ low);
    }
}
