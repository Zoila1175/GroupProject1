package ProjectQuestions;

public class Question10 {
    public static void main(String[] args) {
        String[] colors={"Red", "Yellow", "Green", "Purple","Yellow"};
        for(int i=0; i< colors.length; i++){
            for(int j=i+1;j< colors.length; j++){
                if(colors[i]==colors[j]){
                    System.out.println("The duplicate element is "+colors[i]);
                }
            }
        }
    }
}
