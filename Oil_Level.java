package JS_Toy;

import java.util.Scanner;

public class Oil_Level {
	static Scanner scanner = new Scanner(System.in);

    public static int oil_level = 55;		
    public boolean carrunning = true;
    public static int oil_Use = 0;
    
    public void addOil(int amount) {
    	if (oil_level + amount >= 100 && Options.car_Upgrade1 < 4) {	// 엔딩 더 만들거면 두번째꺼 바꿔야됨 4이 아니라 다른거
    		Scanner scanner = new Scanner(System.in);
	    	
	    	System.out.println("\n\n자동차를 업그레이드 하시겠습니까?\n");
	    	System.out.println("Y?   OR   N?");
	    	System.out.println("\n입력란 : ");

	    	String ops;
	    	ops = scanner.nextLine().trim().toUpperCase();				// 다음줄에 입력 가능, 공백 없애고 소문자도 대문자로 변환하여 입력됨
	    		switch (ops) {
	            case "Y":
	            case "Yes":
	            case "ㅛ":
	            case "네":
	            case "SP":
	            case "예":
	            case "DP":
	            case "ㅇㅇ":
	            case "DD":
	            case "예스":
	            case "DPTM":
	            	System.out.println("자동차 업그레이드!");
	       			oil_level -= 50;				// 자동차 업그레이드 후 -50 됨
	       			System.out.println("\n\n=====차의 기름이 업드레이드 비용으로 소진되었습니다=====");
	       			System.out.println("\n기름량 -50");
	       			Options.car_Upgrade1++;			// 차량 업그레이드 후 1을 더해줘서 Options 에서 나오는 if 문으로 다른 자동차를 나오게끔 만들어줌
	       			oil_level += amount;
	       			oil_Use++;
	       			break;
	            case "N":
	            case "No":
	            case "ㅜ" :
	            case "아니오":
	            case "DKSLDH":
	            case "아니요":
	            case "DKSLDU":
	            case "싫어":
	            case "TLFGDJ":
	            case "ㄴㄴ":
	            case "SS":
	            case "노우":
	            case "SHDN":
	            	oil_level += amount;
	            	oil_Use++;
	        		System.out.println("\n\n기름양 +" + amount);
	        		System.out.println("\n\n=====차의 기름이 조금 찼습니다=====");
	        		break;
	            default:
		            System.out.println("\n'Y' 또는 'N' 선택해주세요");	// 'y' 또는 'n' 외 선택시 출력
		            break;
	    	}
    	}else if (oil_Use >= 10) {									// 지금은 클리어를 위해 17임 나중에 바꿀 수 있음  (10임 지금은)
    		// 기름 10번 이상 못 넣게 하기
    		System.out.println("\n\n더이상 기름을 채울 수 없습니다");
    		System.out.println("\n다른 옵션을 선택하여 주세요");
    		carrunning = false;		// 밑에 종료
    	}else if (carrunning) {	
    		// 기름을 amount 씩 채움
    		oil_level += amount;
    		try {
				Thread.sleep(770);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		System.out.println("\n\n기름양 + " + amount);
    		System.out.println("\n\n=====차의 기름을 채웠습니다=====");
    		oil_Use++;
    	}
    }

	
    
    public int random_Add_Oil(int num1) {
    	oil_level += num1;
    	if(oil_level >= 100) {
    		Scanner scanner = new Scanner(System.in);
	    	
	    	System.out.println("\n\n자동차를 업그레이드 하시겠습니까?\n");
	    	System.out.println("Y?   OR   N?");
	    	System.out.println("\n입력란 : ");

	    	String ops;
	    	ops = scanner.nextLine().trim().toUpperCase();				// 다음줄에 입력 가능, 공백 없애고 소문자도 대문자로 변환하여 입력됨
	    		switch (ops) {
	            case "Y":
	            case "Yes":
	            case "ㅛ":
	            case "네":
	            case "SP":
	            case "예":
	            case "DP":
	            case "ㅇㅇ":
	            case "DD":
	            case "예스":
	            case "DPTM":
	            	System.out.println("자동차 업그레이드!");
	       			oil_level -= 50;				// 자동차 업그레이드 후 -50 됨
	       			System.out.println("\n\n=====차의 기름이 업드레이드 비용으로 소진되었습니다=====");
	       			System.out.println("\n기름량 -50");
	       			Options.car_Upgrade1++;			// 차량 업그레이드 후 1을 더해줘서 Options 에서 나오는 if 문으로 다른 자동차를 나오게끔 만들어줌
	       			break;
	            case "N":
	            case "No":
	            case "ㅜ" :
	            case "아니오":
	            case "DKSLDH":
	            case "아니요":
	            case "DKSLDU":
	            case "싫어":
	            case "TLFGDJ":
	            case "ㄴㄴ":
	            case "SS":
	            case "노우":
	            case "SHDN":
	        		System.out.println("\n\n기름양 +" + oil_level);
	        		System.out.println("\n\n=====차의 기름이 조금 찼습니다=====");
	        		break;
	            default:
		            System.out.println("\n'Y' 또는 'N' 선택해주세요");	// 'y' 또는 'n' 외 선택시 출력
		            break;
	    		}
    		}
    	return oil_level;
	}
    	
    // 드라이브하면 기름 다는 구문 + 기름 남은양 알려줌
    public void useOil(int i) {
		oil_level -= i;
		System.out.println("\n\n차량 기름양 : " + oil_level);
    }
}

		 
