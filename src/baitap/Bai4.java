package baitap;

import java.util.Scanner;


public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] mang = new int[5];
		for (int i = 0; i < mang.length; i++) {
			mang[i]=sc.nextInt();
		}
		System.out.print(" mang : ");
		for(int x : mang) {
			System.out.println(x+" ");
		}
		
		// tong phan tu trong mang
		
		int sum = 0;
		for (int i = 0; i < mang.length; i++) {
			sum+=mang[i];
		}
		System.out.println("tong cac ptu trong mang : "+sum);
		
		//tim gtri max
		int max = mang[0];
		for (int h = 1; h < mang.length; h++) {
			if(max<mang[h]) {
				max = mang[h];
			}
		}
		System.out.println("max can tim trong mang : "+max);
		
}
}