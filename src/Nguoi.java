import java.util.Scanner;

public class Nguoi {
	private String hoten;
	private String gioitinh;
	public Nguoi() {
	}
	public Nguoi(String hoten, String gioitinh) {
		this.hoten = hoten;
		this.gioitinh = gioitinh;
	}
	
	public void nhapTT(Scanner sc) {
		System.out.print("\t Nhập Họ và Tên: ");
		hoten = sc.nextLine();
		System.out.print("\t Nhập giới tính: ");
		gioitinh = sc.nextLine();
	}
	public void hienThiTT() {
		System.out.println("\t Họ và Tên: "+hoten);
		System.out.println("\t Giới tính: "+gioitinh);
	}
	
	public String getHoten() {
		return hoten;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Nguoi n = new Nguoi();
		System.out.println("Nhập thông tin: ");
		n.nhapTT(sc);
		System.out.println("Hiển thị thông tin: ");
		n.hienThiTT();
	}
}
