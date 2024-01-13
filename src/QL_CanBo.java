import java.util.ArrayList;
import java.util.Scanner;

public class QL_CanBo {
	private ArrayList<CanBo> dscb;

	public QL_CanBo() {
		dscb = new ArrayList<CanBo>(51);
	}
	
	public void addCB(CanBo n) {
		dscb.add(n);
	}
	
	public void input(Scanner sc) {
		CanBo cb;
		int n;
		System.out.println("\n--------------------------------------\n");
		System.out.println("\t Nhập vào danh sách!!!\n");
		do {
			System.out.print("\t Nhập số cán bộ: ");
			n = sc.nextInt();
			sc.nextLine();
		}while(n<2 || n>50);
		System.out.println("\n--------------------------------------\n");
		System.out.println("\t Nhập Thông Tin Các Cán Bộ!!!");
		for(int i=0; i<n; i++) {
			System.out.println("\t Nhập cán bộ thứ "+(i+1)+":");
			cb = new CanBo();
			cb.nhapCB(sc);
			addCB(cb);
			System.out.println("\n--------------------------------------\n");
		}
	}
	
	public void timCB(Scanner sc) {
		int nam, nu, year;
		System.out.print("\t Nhập năm hiện tại: ");
		year = sc.nextInt();
		sc.nextLine();
		System.out.print("\t Nhập tuổi nghỉ hưu của cán bộ nam: ");
		nam = sc.nextInt();
		sc.nextLine();
		System.out.print("\t Nhập tuổi nghỉ hưu của cán bộ nữ: ");
		nu = sc.nextInt();
		sc.nextLine();
		System.out.println("\n--------------------------------------\n");
		System.out.println("\n\t Các cán bộ tới tuổi nghỉ hưu: ");
		for(CanBo cb:dscb) {
			if((cb.getGioitinh().equals("nam") && year - cb.getNamsinh() >= nam)
					|| (cb.getGioitinh().equals("nu") && year - cb.getNamsinh() >= nu)) {
				cb.hienThiCB();
				System.out.println("\n--------------------------------------\n");
			}
		}
		
		
	}
	
	public void output() {
		System.out.println("\t Danh sách của bạn!!!");
		for(CanBo cb:dscb) {
			cb.hienThiCB();
			System.out.println("\n--------------------------------------\n");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QL_CanBo qlcb = new QL_CanBo();
		qlcb.input(sc);
		qlcb.output();
		qlcb.timCB(sc);
	}
	
	
	
	
	
	
}
