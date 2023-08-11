package 算法练习.一数组链表;


import java.util.Scanner;

/**
 * 前缀数组
 * leetcode-303
 */
public class NumArray {

    // 前缀和数组
    private int[] preSum;
    /* 输⼊⼀个数组，构造前缀和 */
    public NumArray(int[] nums) {
        // preSum[0] = 0，便于计算累加和
        preSum = new int[nums.length + 1];
        // 计算 nums 的累加和
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }

    /* 查询闭区间 [left, right] 的累加和 */
    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }


    public static void main(String[] args) {
        System.out.println("二维数组的列数：");
        Scanner scan=new Scanner(System.in);
        int l = scan.nextInt();
        int r = scan.nextInt();
//        int[][]matrix=new int[r][c];
//        scan.nextLine();//用来跳过行列后的回车符
//        for(int i=0;i<r;i++){
//            for(int j=0;j<c;j++){
//                matrix[i][j]=scan.nextInt();
//                System.out.print(matrix[i][j]+",");
//            }
//            System.out.println("");
//        }


//        int l = 2;
//        int r = 5;
        int[] arr = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(arr);
        System.out.println(numArray.sumRange(l,r));

        scan.close();
    }

}
