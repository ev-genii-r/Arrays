package runner;

import array.CustomArray;
import exception.ArrayException;
import matrix.JaggetArray;
import matrix.JaggetArrayService;

public class Runner {
    public static void main(String[] args) throws ArrayException {
        JaggetArray matrix = getJaggedArray();
        JaggetArrayService.sortBySum(matrix,false);
        System.out.println(matrix);
    }

    private static JaggetArray getJaggedArray() {
        JaggetArray matrix=new JaggetArray();
        CustomArray customArray1=new CustomArray(new int[]{3,4});
        CustomArray customArray2=new CustomArray(new int[]{1,2,3});
        CustomArray customArray3=new CustomArray(new int[]{2});
        matrix.addArray(customArray1);
        matrix.addArray(customArray2);
        matrix.addArray(customArray3);

        return matrix;
    }
}
