import epam.Rudkovskii.array.CustomArray;
import epam.Rudkovskii.array.CustomArrayService;
import org.junit.Assert;
import org.junit.Test;

public class CustomArrayServiceTest {
    CustomArray array = new CustomArray(new int[]{1, 3, 2, 4, 5, 6});
    CustomArray sortedArray = new CustomArray(new int[] {1, 2, 3, 4, 5, 6});
    CustomArray threeDigitArray = new CustomArray(new int[] { 111, 123, 222, 333, 456, 445, 789 });
    @Test
    public void sortTest(){
        int[] actual = CustomArrayService.bubbleSort(array);
        int[] expected = new int[] {1, 2, 3, 4, 5, 6};
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void maxTest(){
        int actual = CustomArrayService.findMax(array);
        int expected = 6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minTest(){
        int actual = CustomArrayService.findMin(array);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binaryFoundTest(){
        boolean actual = CustomArrayService.binaryFound(sortedArray, 2);
        boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberFibonachiTest(){
        int[] actual = CustomArrayService.numbersFibonachi(sortedArray);
        int[] expected = new int[] { 3};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void simpleNumberTest(){
        int[] actual = CustomArrayService.simpleNumbers(array);
        int[] expected = new int[] { 3, 2, 5};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void threeDigitNotRepeateTest(){
        int[] actual = CustomArrayService.threeDigitNoRepeat(threeDigitArray);
        int[] expected = new int[] { 123, 456, 789};
        Assert.assertArrayEquals(expected, actual);
    }
}
