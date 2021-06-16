package runner;

import array.CustomArray;
import array.CustomArrayService;
import exception.ArrayException;

public class Runner {
    public static void main(String[] args) throws ArrayException {
        CustomArray array=new CustomArray("C:\\Users\\т\\Desktop\\123.txt");
        System.out.println(array.toString());
        array.setArray(CustomArrayService.threeDigitNoRepeat(array));
        System.out.println(array.toString());
    }
}
