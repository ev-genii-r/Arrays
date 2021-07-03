package array;

public class CustomArrayService {

    public static int[] bubbleSort(CustomArray array) {
        if(isNull(array)){
            return null;
        }
        int arraySize= array.getSize();
        int[] tempArray=array.getArray();
        int buffer;
        for(int i=0;i<arraySize;i++){
            for(int j=0;j<arraySize-1;j++){
                if(tempArray[j]>tempArray[j+1]){
                    buffer=tempArray[j];
                    tempArray[j]=tempArray[j+1];
                    tempArray[j+1]=buffer;
                }
            }
        }
        return tempArray;
    }

    public static int[]  selectSort(CustomArray array){
        if(isNull(array)){
            return null;
        }
        int[] tempArray=array.getArray();
        int size=array.getSize();
        int buffer;
        for (int left = 0; left < size; left++) {
            int minInd = left;
            for (int i = left; i < size; i++) {
                if (tempArray[i] < tempArray[minInd]) {
                    minInd = i;
                }
            }
            buffer=tempArray[left];
            tempArray[left]=tempArray[minInd];
            tempArray[minInd]=buffer;
        }
        return tempArray;
    }

    public static int[] insertSort(CustomArray array){
        if(isNull(array)){
            return null;
        }
        int[] tempArray=array.getArray();
        int size=array.getSize();
        int buffer;
        for (int left = 0; left < size; left++) {
            buffer = tempArray[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (buffer < tempArray[i]) {
                    tempArray[i + 1] = tempArray[i];
                } else {
                    break;
                }
            }
            tempArray[i + 1] = buffer;
        }
        return tempArray;
    }


    public static int findMax(CustomArray array){
        if(isNull(array)){
            return 0;
        }
        if(array.getSize()==1)
            return array.elementAt(0);
        int max=array.elementAt(0);
        for(int i=1; i<array.getSize();i++) {
            if(array.elementAt(i)>max)
                max=array.elementAt(i);
        }
        return max;
    }

    public static int findMin(CustomArray array){
        if(isNull(array)){
            return 0;
        }
        if(array.getSize()==1)
            return array.elementAt(0);
        int min=array.elementAt(0);
        for(int i=1; i<array.getSize();i++) {
            if(array.elementAt(i)<min)
                min=array.elementAt(i);
        }
        return min;
    }


    public static boolean binaryFound(CustomArray array, int element){
        if(isNull(array)){
            return false;
        }
        int[] tempArray= bubbleSort(array);

        int left = 0;
        int right = array.getSize();

        boolean result=false;

        while (true)
        {
            int mid = left + (right - left) / 2;

            if (tempArray[mid] == element) {
                result = true;
            }
            if (left>=right )
                break;

            if (tempArray[mid] > element)
                right = mid;
            else
                left = mid + 1;
        }

        return result;
    }

    public static int[] numbersFibonachi(CustomArray array){
        if(isNull(array)){
            return null;
        }
        if(array.getSize()<3){
            return new int[]{0};
        }
        int[] fibonachiArray=new int[array.getSize()-2];
        int ind=0;
        for(int i=2;i<array.getSize();i++){
            if(array.elementAt(i)==array.elementAt(i-1)+array.elementAt(i-2)){
                fibonachiArray[ind]=array.elementAt(i);
                ind++;
            }
        }
        int[] resultArray=new int[ind];
        for(int i=0;i<ind;i++){
            resultArray[i]=fibonachiArray[i];
        }
        return resultArray;
    }

    public static int[] simpleNumbers(CustomArray array){
        if(isNull(array)){
            return null;
        }
        int[] tempArray=new int[array.getSize()];
        int counter = 0;
        for(int i=0;i<array.getSize();i++){
            if(array.elementAt(i)>1){
                int buffer=0;
                for(int j=1;j<array.elementAt(i)/2+1;j++){
                    if(array.elementAt(i)%j==0) {
                        buffer++;
                    }
                }
                if(buffer==1){
                    tempArray[i]=array.elementAt(i);
                    counter++;
                }
            }
        }
        int[] resArray= new int[counter];
        counter=0;
        for(int i=0;i<array.getSize();i++){
            if(tempArray[i]!=0){
                resArray[counter]=tempArray[i];
                counter++;
            }
        }
        return resArray;
    }

    public static int[] threeDigitNoRepeat(CustomArray array){
        if(isNull(array)){
            return null;
        }
        int[] tempArray=new int[array.getSize()];
        int counter=0;
        for(int i=0; i<array.getSize(); i++){
            tempArray[i]=0;
            if(array.elementAt(i)/100!=0){
                int units= array.elementAt(i)%10;
                int dozens= (array.elementAt(i)%100)/10;
                int hundreds = array.elementAt(i)/100;
                if((units != dozens && units != hundreds)&&(dozens!=hundreds)){
                    counter++;
                    tempArray[i]=array.elementAt(i);
                }
            }
        }
        int[] resArray=new int[counter];
        counter=0;
        for(int i=0;i<array.getSize();i++){
            if(tempArray[i]!=0){
                resArray[counter]=tempArray[i];
                counter++;
            }

        }
        return resArray;
    }
    private static boolean isNull(CustomArray array){
        if(array==null){
            return true;
        }
        return false;
    }
}
