package array;

import exception.ArrayException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CustomArray {
    public final static int ARRAY_COMMON_SIZE=20;
    private int size;
    private int[] array= new int[size];

    public CustomArray(){
        this.size=ARRAY_COMMON_SIZE;
    }

    public CustomArray(int size){
        if(size==0) size=ARRAY_COMMON_SIZE;
        this.size= size;
    }

    public CustomArray(int[] array){
        if(array==null){
            for (int i=0;i<ARRAY_COMMON_SIZE;i++){
                this.array[i]=0;
            }
        }else {
            size = array.length;
            this.array = array;
        }
    }

    public CustomArray(String filePath){
        String buffer;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            buffer = bufferedReader.readLine();
            int counter=0;
            for(int i=0; i<buffer.length();i++){
                if(buffer.charAt(i)==' ')
                    counter++;
            }
            int[] tempArray=new int[counter+1];
            String tempNumber="";
            counter=0;
            for(int i=0; i<buffer.length();i++){
                if(buffer.charAt(i)==' '){
                    tempArray[counter]=Integer.parseInt(tempNumber);
                    counter++;
                    tempNumber="";
                    continue;
                }
                tempNumber+=buffer.charAt(i);
            }
            tempArray[counter]=Integer.parseInt(tempNumber);
            size=tempArray.length;
            array=tempArray;
        } catch (IOException ex) {
            ex.getMessage();
        }
    }



    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.size=array.length;
        this.array = array;
    }

    public void generateRandomArray(){
        for (int i=0; i<size; i++){
            array[i]=(int)(Math.random()*10);
        }
    }

    public int indexOf(int element){
        int index=-1;
        for(int i=0;i<size;i++){
            if(i==element){
                index=i;
                break;
            }
        }
        return index;
    }

    public int elementAt(int index){
        if(index>size)
            index=size;
        if(index<0)
            index=0;
        return array[index];
    }

    public void addElement(int element){
        size++;
        int[] tempArray;
        tempArray=array;
        tempArray[size]=element;
        array=tempArray;
    }

    public void deleteElementByIndex(int index){
        if (index > size-1 || index < 0) {
            index=size-1;
        }
        int[] tempArray=new int[size-1];
        int counter=0;
        for(int i=0; i<size-1; i++){
            if(i==index)
                continue;
            tempArray[counter]=array[i];
            counter++;
        }
    }

    public int sumOfElements(){
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=array[i];
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return size == that.size &&
                Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return 31*array[0]+size;
    }

    @Override
    public String toString(){
        String str="";
        for (int i:array)
            str+=i+" ";
        return this.getClass()+" : "+str+" size: "+size+ " sum: "+sumOfElements();
    }
}
