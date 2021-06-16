package advance.dev;

public abstract class Person {
     String ten;
     int old;
     int number;
     
	public Person(String ten, int old, int number) {
		super();
		this.ten = ten;
		this.old = old;
		this.number = number;
	}
	public abstract String toString();
	public abstract float diemTB();
	public abstract float tinhLuong();
}
