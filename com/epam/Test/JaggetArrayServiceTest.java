import array.CustomArray;
import matrix.JaggetArray;
import matrix.JaggetArrayService;
import org.junit.Assert;
import org.junit.Test;

public class JaggetArrayServiceTest {

    JaggetArray matrix=new JaggetArray();
    CustomArray customArray1=new CustomArray(new int[]{3,4});
    CustomArray customArray2=new CustomArray(new int[]{1,2,3});
    CustomArray customArray3=new CustomArray(new int[]{2});


    @Test
    public void sortBySumTest(){
        matrix.addArray(customArray1);
        matrix.addArray(customArray2);
        matrix.addArray(customArray3);
        JaggetArrayService.sortBySum(matrix, true);
        JaggetArray actual = matrix;
        JaggetArray expected= new JaggetArray();
        expected.addArray(customArray3);
        expected.addArray(customArray2);
        expected.addArray(customArray1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortByMaxTest(){
        matrix.addArray(customArray1);
        matrix.addArray(customArray2);
        matrix.addArray(customArray3);
        JaggetArrayService.sortByMax(matrix, true);
        JaggetArray actual = matrix;
        JaggetArray expected= new JaggetArray();
        expected.addArray(customArray3);
        expected.addArray(customArray2);
        expected.addArray(customArray1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sortByMinTest(){
        matrix.addArray(customArray1);
        matrix.addArray(customArray2);
        matrix.addArray(customArray3);
        JaggetArrayService.sortByMin(matrix, true);
        JaggetArray actual = matrix;
        JaggetArray expected= new JaggetArray();
        expected.addArray(customArray2);
        expected.addArray(customArray3);
        expected.addArray(customArray1);
        Assert.assertEquals(expected, actual);
    }
}
