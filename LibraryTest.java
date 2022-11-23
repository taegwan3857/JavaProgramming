package JAVA_PROJECT ;

import java.util.Scanner;

public class LibraryTest {	   
	   public static void start() {
	      int menu = 0;
	      System.out.println("# DMU 도서실 좌석 관리 시스템 #");
	      Scanner sc;
	      do { 
	         System.out.println("\n####### 메 뉴 #######");
	         System.out.println("0. 종 료");
	         System.out.println("1. 입 실");
	         System.out.println("2. 퇴 실");
	         System.out.println("3. 정기 이용권");
	         System.out.println("4. 정기이용 탈퇴");
	         System.out.println("######################");
	         sc = new Scanner(System.in);
	         
	         menu = sc.nextInt();
	         switch(menu) {
	         case 1:  
	            System.out.println("종료되었습니다.");
	            break;
	         case 2:
	            entrance(); // 입실
	            break;
	         case 3:
	            leave(); // 퇴실
	            break;
	         case 4:
	            routine_ticket(); // 정기이용권
	            break;
	         case 5:
	            secession(); // 정기이용권 탈
	            break;
	         }
	      } 
	      while(0== menu || 1== menu || 2== menu || 3== menu || 4== menu); // 0,1,2,3,4 미 선택시 종료 
	      System.out.println("종료되었습니다.");
	      sc.close();
	   }
	   

	   public static void main(String[] args) {
	     start() ;

	   }

	}

