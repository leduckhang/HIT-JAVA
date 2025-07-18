package baitap;

import java.util.Scanner;

public class BaiTapTuan2 {
	
public static void main(String[] args) {

	// bai 1, bai 2, bai 3
	
	Scanner sc = new Scanner(System.in);
	System.out.println("xin chao!");
	System.out.print("ten toi: ");
	String ten = sc.nextLine();
	System.out.println(ten);
	System.out.print("tuoi: ");
	int tuoi = sc.nextInt();
	sc.nextLine();
	System.out.println(tuoi);
	System.out.print("chieu cao : ");
	double chieuCao = sc.nextDouble();
	sc.nextLine();
	System.out.println(chieuCao+" m ");
	System.out.print("gpa: ");
	float gpa = sc.nextFloat();
	sc.nextLine();
	System.out.println(gpa);
	
	int a,b;
	String c;
	do {
		System.out.println("------------------");
		System.out.println("nhap so a va b : ");
		a= sc.nextInt();
		sc.nextLine();
		b=sc.nextInt();
		System.out.println("tong = "+(a+b));
		System.out.println("hieu = "+(a-b));
		System.out.println("thuong ="+((float)a/b));
		System.out.println("a/b du = "+(a%b));
		if(a==b) {
			System.out.println("a == b");
		}else {
			System.out.println("a!=b");
		}
		System.out.println("ban muon thu tiep thi nhan Y (con khong thi nhan phim bat ki)");
		c=sc.nextLine();
	}while(c=="y"|| c=="Y");
	
}
}
