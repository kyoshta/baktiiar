package arrays;

public class Draft {
    public static void main(String[] args) {
        int nums [][] = {{2, 4, 8}, {7, 9, 5}};
        System.out.println(nums.length);
        for (int i = 0; i < 2; i++){
            for (int j = 0; j <= 2; j++){
                System.out.print(nums[i][j] + " ");

            }
        }
    }
}
