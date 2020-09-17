/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19myarray;

import java.util.Random;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        int sum;
        sum = 0;
            System.out.println("++++ Программа MyArray ++++");
            System.out.println("Создать массив типа int с название MyArray с");
            int myArray[] = new int [20];
            System.out.println("Заполнить массив случайными значениями в диапозоне от 0 до 49");
            Random random = new Random();
            for(int i = 0; i < myArray.length; i++){
                myArray[i] = random.nextInt(49-0+1)-0;
            }
            System.out.println("Вывести значения массива на экран");
            for(int i = 0; i < myArray.length; i++){
                System.out.printf("%3d", myArray[i]);
            }System.out.println();
            System.out.println("Вывести значения массива на экран");
            for(int i = myArray.length-1; i>=0; i--){
                System.out.printf("%3d", myArray[i]);
            }
            System.out.println("");
            System.out.println("Сумма ячеек: ");
            for(int i = 0; i < myArray.length; i++){
                sum = sum + myArray[i];
            }
            System.out.println(sum);
            
            System.out.println("Первая половина массива: ");
            for (int i = 0; i < myArray.length / 2; i++) {
                System.out.printf("%3d ", myArray[i]);
            }
            System.out.println();
            System.out.println("Вторая половина массива: ");
            for (int i = myArray.length / 2; i < myArray.length / 2; i++) {
                System.out.printf("%3d ", myArray[i]);
            }
    }
    
}
