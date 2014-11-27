package rotateImage;

public class Solution {
    public void rotate(int[][] matrix) {
    	int half = matrix.length/2;
    	int halfCeil = (int)Math.ceil( (float)matrix.length / 2);
    	int edge = matrix.length - 1;
    	for (int i = 0; i < half; i++) {
			for (int j = 0; j < halfCeil; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[edge - j][i];
				matrix[edge - j][i] = matrix[edge - i][edge - j];
				matrix[edge - i][edge - j] = matrix[j][edge - i];
				matrix[j][edge - i] = temp;
			}
		}
    }
}