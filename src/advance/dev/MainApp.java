package advance.dev;

import java.util.Scanner;

public class MainApp {
	static void input(Person[] persons) {
		Scanner sc = new Scanner(System.in);
		final int number_teacher = 4;
		final int number_student = 6;
		for (int i = 0; i < 5; i++) {
			System.out.println("Giao vien thu "+(i+1));
			System.out.println("Nhap ten");
			String ten = sc.next();
			System.out.println("Nhap tuoi");
			int old = sc.nextInt();
			System.out.println("Nhap so dien thoai");
			int number = sc.nextInt();
			System.out.println("Nhap ma giao vien");
			String maGV = sc.next();
			System.out.println("Nhap he so luong");
			float heSoLuong = sc.nextFloat();
			Teacher teacher = new Teacher(ten, old, number, maGV, heSoLuong);
		}
		for (int i = 0; i < 7; i++) {
			System.out.println("sinh vien thu : "+(i+1));
			System.out.println("Nhap ten");
			String ten = sc.next();
			System.out.println("Nhap tuoi");
			int old = sc.nextInt();
			System.out.println("Nhap so dien thoai");
			int number = sc.nextInt();
			System.out.println("Nhap diem toan");
			float diemToan = sc.nextFloat();
			System.out.println("Nhap diem ly");
			float diemLy = sc.nextFloat();
			System.out.println("Nhap diem hoa");
			float diemHoa = sc.nextFloat();
			System.out.println("Nhap ma sinh vien");
			String maSV = sc.next();
			System.out.println("Nhap lop");
			String lop = sc.next();
			Student std = new Student(ten, old, number, diemToan, diemLy, diemHoa, maSV, lop);
		}
	}
		static void print(Person[] persons) {
			for (int i = 0; i < persons.length; i++) {
				System.out.println(persons[i].toString());
			}
		}
		static void findTeacher(Person[] persons) {
			Person preMax = persons[0];
			for (int i = 0; i < 4; i++) {
				if(preMax.tinhLuong() < persons[i].tinhLuong()) {
					preMax = persons[i];
				}
			}
			System.out.println("So luong cao nhat:" + preMax);
		}
		static void findMaxDTB(Person[] persons) {
			Person MaxDTB = persons[0];
			for (int i = 0; i < 6; i++) {
				if(MaxDTB.diemTB() < persons[i].diemTB()) {
					MaxDTB = persons[i];
				}
			}
			System.out.println("DTB cao nhat:" + MaxDTB);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Person[] persons = new Person[10];
     input(persons);
     print(persons);
     findTeacher(persons);
     findMaxDTB(persons);
	}

}
