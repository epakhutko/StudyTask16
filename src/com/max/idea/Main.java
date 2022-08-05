package com.max.idea;

public class Main {
    public static void main(String[] args) {
        double minNum=20.0;
        double maxNum=-20.0;
        double maxMod=0.0;
        double[] Arr = new double [15];
        for (int i=0; i<15; i++) {
            Arr[i]=(Math.random()-0.5)*40;
            if (Arr[i]>maxNum) {
                maxNum= Arr[i];
            }
            if (Arr[i]<minNum) {
                minNum=Arr[i];
            }
        }
        if (Math.abs(minNum)>Math.abs(maxNum)) {
            maxMod=minNum;
        }
        else maxMod=maxNum;

   System.out.printf("Smallest number in array: %f \nBiggest number in array: %f \nBiggest absolute number: %f", minNum, maxNum, maxMod);

    }
}
