/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio02;

/**
 *
 * @author aluno
 */

import java.util.Arrays;

interface Ordenavel {
    void ordenar(int[] array);
}

class BubbleSort implements Ordenavel {
    @Override
    public void ordenar(int[] array) {
        int n = array.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    }
                }
            }
        }
    }

public class Exercicio02 {
    
    public static void main(String[] args) {
        int[] array = {3, 5, 3, 1, 2};
        
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println("Array antes ordenação: " + Arrays.toString(array));
        
        bubbleSort.ordenar(array);
        
        System.out.println("Array após ordenação: " + Arrays.toString(array));
    }
}
