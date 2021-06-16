package advance.dev;

public class Student extends Person{
       float diemToan;
       float diemLy;
       float diemHoa;
       String maSV;
       String lop;
       
      
	public Student(String ten, int old, int number, float diemToan, float diemLy, float diemHoa, String maSV,
			String lop) {
		super(ten, old, number);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSV = maSV;
		this.lop = lop;
	}


	float diemTrungBinh() {
    	   return(diemToan + diemLy + diemHoa)/3;
       }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Name: %s -- Old: %d -- Number: %s -- Diem 3 mon: %f, %f, %f -- MaSV: %s -- Lop: %s",ten,old,number,diemToan,diemLy,diemHoa);
	}
	@Override
	public float diemTB() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float tinhLuong() {
		// TODO Auto-generated method stub
		return 0;
	}
}
