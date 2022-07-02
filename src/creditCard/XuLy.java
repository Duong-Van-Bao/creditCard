package creditCard;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		/*
		 * Bước 1: Tạo biến creditCardBalance, payment, balance, penalty;
		 * Bước 2: In thông báo nhập số dư thẻ tín dụng
		 * Bước 3: Cho người dùng nhập số dư và gán creditCardBalance
		 * Bước 4: In thông báo nhập tiền trả trong tháng 
		 * Bước 5: Cho người dùng nhập tiền trả và gán payment
		 * Bước 6: Tạo biến balance lưu kết quả tiền chưa được thanh toán 
		 * Bước 7: Xét điều kiện balance > 0
		 * Bước 8: Tính tiền phạt nếu bước 7 xảy ra và gán cho penalty
		 * Bước 9: xuất kết quả
		 * */
		final float INTEREST = 0.015f;
		float creditCardBalance;
		float payment;
		float balance;
		float penalty = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui lòng nhập số dư thẻ tín dụng:");
		creditCardBalance = Float.parseFloat(scan.nextLine());
		
		System.out.println("Nhập số tiền bạn đã thanh toán:");
		payment = Float.parseFloat(scan.nextLine());
		
		balance = creditCardBalance - payment;
		if(balance > 0) {
		  penalty = balance * INTEREST; 	
		}
		
		System.out.println("Tiền phạt phải trả là: " + penalty);
	}

}
