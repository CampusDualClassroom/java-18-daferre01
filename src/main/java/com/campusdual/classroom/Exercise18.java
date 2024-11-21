package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {


	public static void main(String[] args) {

		int[] a=createAndInitializeArray(Utils.getRandomNumberInRange(1,10));
		showInlineArray(a);
	}
	public static int[] createAndInitializeArray(int entero){
		int[] array=new int[entero];
		for (int i=0;i<=array.length-1;i++){
			array[i]=i+1;
		}
		return array;
	}
	public static void showInlineArray(int[] array){
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
	}
}

