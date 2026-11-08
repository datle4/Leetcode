class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int number = 1;

        int top = 0;
        int bottom = result.length-1;
        int left = 0;
        int right = result[0].length-1;

        while (number <= n*n) {
            for (int i = left; i <= right; i++) {
                result[top][i] = number++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[i][right] = number++;
            }
            right--;

            if (left <= right) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = number++;
                }
                bottom--;
            }

            if (top <= bottom) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = number++;
                }
                left++;
            }
        }

        return result;
    }
}