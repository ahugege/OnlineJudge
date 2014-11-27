package rotateImage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int[][] image = {{1,2,3},{4,5,6},{7,8,9}};
		 int[][] image = {{1}};
        Solution solution = new Solution();
        solution.rotate(image);
        for (int i = 0; i < image.length; i++) {
			int[] js = image[i];
			for (int j = 0; j < js.length; j++) {
				System.out.print(image[i][j]);
			}
			System.out.println();
        }
	}

}
