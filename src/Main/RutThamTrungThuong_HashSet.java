package Main;

import java.awt.Choice;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class RutThamTrungThuong_HashSet {
	Set<String> thungPhieuDuThuong = new HashSet<String>();
	
	
	public RutThamTrungThuong_HashSet() {
	}
	
	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri) {
		return this.thungPhieuDuThuong.remove(giaTri);
	}
	public boolean kiemTraPhieuTonTai (String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}
	
	public void xoaTatCaPhieuDuThuong() {
		this.thungPhieuDuThuong.clear();
	}
	public int laySoLuong() {
		return this.thungPhieuDuThuong.size();
	}
	
	public String rutMotPhieu() {
		String ketQua ="";
		Random random = new Random();
		int viTri = random.nextInt(this.thungPhieuDuThuong.size());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	
	public void inAll() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
		int luachon = 0;
		do {
			System.out.println("---------------------------------------");
			System.out.println("MENU:  ");
			System.out.println("1. Them ma so du thuong");
			System.out.println("2. Xoa ma so du thuong");
			System.out.println("3. Kiem tra ma so du thuong co ton tai hay khong");
			System.out.println("4. Xoa ta ca cac phieu du thuong");
			System.out.println("5. So luong phieu du thuong");
			System.out.println("6. Rut tham trung thuong");
			System.out.println("7. In ra tat ca cac phieu");
			System.out.println("0. Thoat khoi chuong trinh");
			luachon = scan.nextInt();
			scan.nextLine();
			
			if(luachon == 1 || luachon == 2 || luachon == 3) {
				System.out.println("Nhap vao ma phieu du thuong");
				String giaTri = scan.nextLine();
				if(luachon == 1) {
					rt.themPhieu(giaTri);
				}else if (luachon == 2) {
					rt.xoaPhieu(giaTri);
				}else {
					System.out.println("Ket qua kiem tra: " + rt.kiemTraPhieuTonTai(giaTri) );
				}
				
			}else if (luachon == 4) {
				rt.xoaTatCaPhieuDuThuong();
			}else if (luachon == 5) {
				System.out.println("So luong phieu la " + rt.laySoLuong() );
			}else if (luachon == 6) {
				System.out.println("Ma so trung thuong la" + rt.rutMotPhieu());
			}else if(luachon == 7) {
				System.out.println("Cac ma phieu du thuong la ");
				rt.inAll();
			}
			
			
		}while (luachon!=0);
	}
}
