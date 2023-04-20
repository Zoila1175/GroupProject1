package ProjectQuestions;

public class Question1 {

        public static void main(String[] args) {
            int [] temp={68, 71, 75, 87, 89, 83, 67};
            int highest= temp[0];
            int lowest= temp [0];
            for (int i=1; i<7; i++ ){
                if (highest< temp[i]){
                    highest= temp[i];
                }
                if ( lowest> temp[i]){
                    lowest= temp[i];
                }
            }
            System.out.println("The highest temperature of the week is "+ highest );
            System.out.println("The lowest temperature of the week is "+ lowest );
        }
    }

