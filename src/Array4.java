import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        int[][] array1 = new int[][]{{1, 2, 3}, {1}, {2, 6}};
        System.out.println(Arrays.toString(linearize(array1)));
    }

    private static int findArrayLength(int[][] origin){
        int result = 0;
        for (int[] anOrigin : origin) {
            result += anOrigin.length;
        }
        return result;
    }

    private static int[] linearize(int [][] origin){
        int[] result = new int[findArrayLength(origin)];
        for (int i = 0, x = 0; i <origin.length; i++){
            for (int j = 0; j < origin[i].length; j++, x++){
                result[x] = origin[i][j];
            }
        }
        return result;
    }
}
