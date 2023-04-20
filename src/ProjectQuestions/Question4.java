package ProjectQuestions;

public class Question4 {
    public static void main(String[] args) {
        int[][] numbers = {

                {5, 2, 12, 4, 5},
                {5, 15, 1, 5, 5},

        };
        int even = 0;
        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    even += numbers[i][j];
                } else {
                    odd += numbers[i][j];
                }
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }

}


