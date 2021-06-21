package matrix;

import array.CustomArray;

import java.util.Arrays;
import java.util.Objects;

public class JaggetArray {
    public static final int DEFAULT_SIZE=4;
    private CustomArray[] matrix= new CustomArray[DEFAULT_SIZE];
    private int size;

    public JaggetArray(){
        size=0;
    }

    public JaggetArray(CustomArray[] matrix){
        if(matrix!=null){
            this.matrix=matrix;
            size=matrix.length;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int length) {
        this.size = length;
    }

    public void addArray(CustomArray array){
        matrix[size]=array;
        size++;

    }

    public CustomArray arrayByIndex(int index){
        if(index<0){
            index=0;
        }
        if(index>size){
            index=size;
        }
        return matrix[index];
    }

    public void changeArrays(int firstIndex, int secondIndex){
        CustomArray tempArray=matrix[firstIndex];
        matrix[firstIndex]=matrix[secondIndex];
        matrix[secondIndex]=tempArray;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JaggetArray that = (JaggetArray) o;
        return size == that.size &&
                Arrays.equals(matrix, that.matrix);
    }

    @Override
    public int hashCode() {
        int result;
        result = 31 * size + matrix[0].getSize();
        return result;
    }

    @Override
    public String toString(){
        String resString=this.getClass()+": size= "+size+"\n";
        for(int i=0;i<size;i++){
            resString+=matrix[i].toString()+"\n";
        }
        return resString;
    }
}
