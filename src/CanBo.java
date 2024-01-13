import java.util.Scanner;

public class CanBo extends Nguoi{
	private String maCB;
	private int namsinh;
	
	public CanBo() {
	}
	
	public CanBo(String hoten, String gioitinh, String maCB, int namsinh) {
		super(hoten, gioitinh);
		this.maCB = maCB;
		this.namsinh = namsinh;
	}
	
	public void nhapCB(Scanner sc) {
		super.nhapTT(sc);
		System.out.print("\t Nhập mã cán bộ: ");
		maCB = sc.nextLine();
		do {
			System.out.print("\t Nhập năm sinh: ");
			namsinh = sc.nextInt();
			sc.nextLine();
			if(namsinh < 0)
				System.out.println("\t Năm sinh không âm!!!\n\t Nhập lại!!!\n");
		}while(namsinh < 0);
	}
	
	public void hienThiCB() {
		super.hienThiTT();
		System.out.println("\t Mã cán bộ: "+maCB);
		System.out.println("\t Năm sinh: "+namsinh);
	}
	
	public String getMaCB() {
		return maCB;
	}

	public int getNamsinh() {
		return namsinh;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CanBo cb = new CanBo();
		System.out.println("Nhập thông tin: ");
		cb.nhapCB(sc);
		System.out.println("Hiển thị thông tin: ");
		cb.hienThiCB();
	}
	
	
}
