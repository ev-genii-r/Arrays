package com.epam.Rudkovskii.matrix;

import com.epam.Rudkovskii.array.CustomArrayService;

public class JaggetArrayService{

    public static void sortBySum(JaggetArray matrix, boolean order) {
        Sorter sorter = (int i) -> {
            return matrix.arrayByIndex(i).sumOfElements();
        };
        sort(matrix, order, sorter);
    }

    public static void sortByMax(JaggetArray matrix, boolean order) {
        Sorter sorter = (int i) -> {
            return CustomArrayService.findMax(matrix.arrayByIndex(i));
        };
        sort(matrix, order, sorter);
    }

    public static void sortByMin(JaggetArray matrix, boolean order) {
        Sorter sorter = (int i) -> {
            return CustomArrayService.findMin(matrix.arrayByIndex(i));
        };
        sort(matrix, order, sorter);
    }

    private static void sort(JaggetArray matrix, boolean ind, Sorter sorter) {
        int factor = ind ? 1: -1;
        for (int i = 0; i < matrix.getSize(); i++) {
            for (int j = 0; j < matrix.getSize() - 1; j++) {
                if (sorter.sortType(j)*factor>sorter.sortType(j+1)*factor){
                    matrix.changeArrays(j,j+1);
                }
            }
        }
    }
}
