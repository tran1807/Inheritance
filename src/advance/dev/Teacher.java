package advance.dev;

public class Teacher extends Person{
      String maGV;
      float heSoLuong;
     
	public Teacher(String ten, int old, int number, String maGV, float heSoLuong) {
		super(ten, old, number);
		this.maGV = maGV;
		this.heSoLuong = heSoLuong;
	}
	public float tinhLuong() {
		return heSoLuong * 1200000;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s -- Age: %d -- Number: %s -- MaGV: %s, He so luong: %f", ten,old,number,maGV,heSoLuong);
	}
	@Override
	public float diemTB() {
		// TODO Auto-generated method stub
		return 0;
	}
}
