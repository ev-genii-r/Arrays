package matrix;

import array.CustomArrayService;

public class JaggetArrayService {

    public static void sortBySum(JaggetArray matrix, boolean ind){
        int[] array=new int[matrix.getSize()];
        for(int i=0;i<matrix.getSize();i++){
            array[i]=matrix.arrayByIndex(i).sumOfElements();
            if(ind==false){
                array[i]*=-1;
            }
        }
        sort(matrix,array);
    }

    public static void sortByMax(JaggetArray matrix,boolean ind){
        int[] array=new int[matrix.getSize()];
        for(int i=0;i<matrix.getSize();i++){
            array[i]= CustomArrayService.findMax(matrix.arrayByIndex(i));
            if(ind==false){
                array[i]*=-1;
            }
        }
        sort(matrix,array);
    }

    public static void sortByMin(JaggetArray matrix,boolean ind){
        int[] array=new int[matrix.getSize()];
        for(int i=0;i<matrix.getSize();i++){
            array[i]= CustomArrayService.findMin(matrix.arrayByIndex(i));
            if(ind==false){
                array[i]*=-1;
            }
        }
        sort(matrix,array);
    }

    private static void sort(JaggetArray matrix,int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=1;j<array.length;j++){
                if(array[j-1]>array[j]){
                    int buf=array[j-1];
                    array[j-1]=array[j];
                    array[j]=buf;
                    matrix.changeArrays(j-1,j);
                }
            }
        }
    }
}
