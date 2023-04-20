package ProjectQuestions;

public class Question3 {
    public static void main(String[] args) {
        int[][] array= {
                {15, 20, 25, 30, 35},
                {1, 6, 9, 12, 15},
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int number=array[i][j];
                if (number % 2 == 0) {
                    System.out.print(number+ " ");
                }
            }
        }
    }
}
