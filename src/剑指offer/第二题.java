package 剑指offer;

public class 第二题 {
    /**
     * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     *
     *     示例:
     *
     *     现有矩阵 matrix 如下：
     *
     *             [
     *             [1,   4,  7, 11, 15],
     *             [2,   5,  8, 12, 19],
     *             [3,   6,  9, 16, 22],
     *             [10, 13, 14, 17, 24],
     *             [18, 21, 23, 26, 30]
     *             ]
     *     给定 target = 5，返回 true。
     *
     *     给定 target = 20，返回 false。
     */
    // 二分查找方法
    //class Solution {
    //    public boolean findNumberIn2DArray(int[][] matrix, int target) {
    //        int m = matrix.length;
    //        if (m == 0) return false;
    //        int n = matrix[0].length;
    //        int s = Math.min(m, n);
    //        for (int i = 0; i < s; i++) {
    //            boolean row = BSrow(matrix, i, target);
    //            boolean col = BScol(matrix, i, target);
    //            if (row || col) {
    //                return true;
    //            }
    //        }
    //        return false;
    //    }
    //
    //    public boolean BSrow(int[][] matrix, int row, int target) {
    //        int end = matrix[0].length - 1;
    //        int low = row;
    //        while (low <= end) {
    //            int mid =(low + end) / 2;
    //            if (matrix[row][mid] == target) {
    //                return true;
    //            } else if (matrix[row][mid] > target) {
    //                end = mid - 1;
    //            } else if (matrix[row][mid] < target) {
    //                low = mid + 1;
    //            }
    //        }
    //        return false;
    //    }
    //
    //    public boolean BScol(int[][] matrix, int col, int target) {
    //        int end = matrix.length - 1;
    //        int low = col;
    //        while (low <= end) {
    //            int mid =(low + end) / 2;
    //            if (matrix[mid][col] == target) {
    //                return true;
    //            } else if (matrix[mid][col] > target) {
    //                end = mid - 1;
    //            } else if (matrix[mid][col] < target) {
    //                low = mid + 1;
    //            }
    //        }
    //        return false;
    //    }
    //}
    //  二叉搜索树
    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            int i = matrix.length - 1, j = 0;
            while(i >= 0 && j < matrix[0].length)
            {
                if(matrix[i][j] > target) i--;
                else if(matrix[i][j] < target) j++;
                else return true;
            }
            return false;
        }
    }
}
