package runner;

import array.CustomArray;
import array.CustomArrayService;
import exception.ArrayException;
import matrix.JaggetArray;
import matrix.JaggetArrayService;

public class Runner {
    public static void main(String[] args) throws ArrayException {
        JaggetArray matrix=new JaggetArray();
        CustomArray customArray1=new CustomArray(new int[]{3,4});
        CustomArray customArray2=new CustomArray(new int[]{1,2,3});
        CustomArray customArray3=new CustomArray(new int[]{2});
        matrix.addArray(customArray1);
        matrix.addArray(customArray2);
        matrix.addArray(customArray3);
        System.out.println(matrix.toString());
        matrix.changeArrays(0,1);
        System.out.println(matrix.toString());
        JaggetArrayService.sortBySum(matrix,true);
        System.out.println(matrix.toString());
        JaggetArrayService.sortByMax(matrix,false);
        System.out.println(matrix.toString());
        JaggetArrayService.sortByMin(matrix,true);
        System.out.println(matrix.toString());
    }
}
