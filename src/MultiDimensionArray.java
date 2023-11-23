public class MultiDimensionArray {

    public static void main(String[] args) {
        int[][] int2DArray = new int[3][2];
        for(int i = 0; i < int2DArray.length; i++){
            for (int j = 0; j < int2DArray[i].length; j++){
                int2DArray[i][j] = (i + j) * 6;
            }
        }
        for(int i = 0; i < int2DArray.length; i++){
            for (int j = 0; j < int2DArray[i].length; j++){
                System.out.println("Row " + i + " Column " + j + " has value = " + int2DArray[i][j]);
            }
        }

    }
}
