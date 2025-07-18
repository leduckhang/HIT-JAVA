package baitap;


import java.util.Scanner;



public class Bai6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("so luong hoc sinh : ");
		int n = sc.nextInt();
		sc.nextLine();
		String [] tenHocSinh = new String[n];
		int [] tuoi = new int[n];
		float [] diemTrungBinh = new float [n];
		
		for (int i = 0; i < tenHocSinh.length; i++){
			System.out.println("nhap ten hoc sinh :");
			tenHocSinh[i]=sc.nextLine();
			System.out.println("tuoi : ");
			tuoi[i]=sc.nextInt();
			sc.nextLine();
			System.out.println("diem trung binh : ");
			diemTrungBinh[i]=sc.nextFloat();
			sc.nextLine();
		}
		System.out.println("ten - tuoi - diem trung binh ");
		for (int j = 0; j < diemTrungBinh.length; j++) {
			System.out.println(tenHocSinh[j] + " - " +tuoi[j]+" - "+diemTrungBinh[j]);
		}
		float sum = 0;
		for (int h = 0; h < diemTrungBinh.length; h++) {
			sum+=diemTrungBinh[h];
		}
		System.out.println("diem trung binh cua lop : "+ sum/n);
		
		int vt = 0;
		
		float max = diemTrungBinh[0];
		for (int k = 1; k < diemTrungBinh.length; k++) {
			if(max<diemTrungBinh[k]) {
				max = diemTrungBinh[k];
				vt = k;
			}
		}
		System.out.print("ban co gpa cao nhat : ");
		for (int l = 0; l < diemTrungBinh.length; l++) {
			if(l==vt) {
				System.out.println(tenHocSinh[l]);
			}
		}
			
		
	}
}
