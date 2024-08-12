package JS_Toy;

import java.util.Scanner;
import java.awt.Font;
import java.util.Random;

public class Options {
	// 스케너 추기
	Scanner scanner = new Scanner(System.in);
	// 자동차 이미지 가지고 오기
	Cars c = new Cars();
	// 기름 다는거 시작하는거 가지고 오기
	Oil_Level oil = new Oil_Level();

	static int car_Upgrade = 0;
	static int car_Upgrade1 = car_Upgrade;			// 이게 ++된거 가지고 온거
	
	public int showOption1() {		
	 if(car_Upgrade1 == 3) {						// 3번차 다음 게임 끝?
		System.out.println("\nGame Clear!!!");		// 게임 클리어 메세지
		pauseExecution(700);
		System.exit(0);								// 게임종료
		System.out.println("\n드라이브 즐기는중");
		pauseExecution(700);
	 }
		if(car_Upgrade1 == 0) {
			c.car1();
		} if(car_Upgrade1 == 1) {
			c.car2();
		} if(car_Upgrade1 == 2) {
			c.car3();
		}
		for (int i=0; i<3; i++) {			 
			pauseExecution(750);
			System.out.println("부릉\n");
		}
		RandomOption();
		pauseExecution(1300);
		System.out.println("\n\n~~~~~~~~~~드라이브 완료~~~~~~~~~~");
		pauseExecution(1000);
		j = 0;								// 기름 넣는 구문 연속적으로 선택후 다른거(이거) 선택하면 초기화
		j1 = 0;
		return car_Upgrade1;				// 새로운 값이 몇인지를 리턴해줌
}
	
	int j = 0;
	
	public void showOption2() {							// 일반유 넣는거
		if(j >= 3) {									// 기름 넣는걸 연속적으로 3번 하면 발생함
			pauseExecution(500);
			System.out.println("\n연속적으로 너무 많이 선택하였습니다");
			System.out.println("다른 옵션을 선택하여 주십시오");
			pauseExecution(700);
			j1 = 0;										// 초기화 
		} else if(j <= 3 && Oil_Level.oil_Use <= 10) {	// 기름 사용 횟수가 10이거나 10 이상이면 이거 실행
			System.out.print("\n일반유 넣는중");
		for (int i = 0; i < 3; i++) {
				pauseExecution(700);
				System.out.print(".");
			}
				pauseExecution(770);
				oil.addOil(10);		//10
				pauseExecution(750);
				j1 = 0;
			} 
			j++;
}
	
	int j1 = 0;
	
	public void showOption3() {							// 고급유 넣는거
		if(j1 >= 3) {									// 기름 넣는걸 연속적으로 3번 하면 발생함
			pauseExecution(500);
			System.out.println("\n연속적으로 너무 많이 선택하였습니다");
			System.out.println("다른 옵션을 선택하여 주십시오");
			pauseExecution(700);
			j = 0;										// 초기화 
		} else if(j1 <= 3 && Oil_Level.oil_Use <= 10) {	// 기름 사용 횟수가 10이거나 10 이상이면 이거 실행
			System.out.print("\n고급유 넣는중");
		for (int i = 0; i < 3; i++) {
				pauseExecution(700);
				System.out.print(".");
			}
				pauseExecution(770);
				oil.addOil(15);		//15
				pauseExecution(750);
				j = 0;
			} 
			j1++;
}
	
	public int showOptions(String[] ops_ops) {		// 배열 선택하는거
		
		int result = 0;
		
		result = randomOption(ops_ops);				// 랜덤으로 배열중 한개를 선택하여 출룍함
		
		for (int i = 0; i < 3; i++) {
			pauseExecution(700);
			System.out.print(".");
		}
		System.out.println("");
		System.out.println("");
    	pauseExecution(700);
		return result;
	}
	
	public static int randomOption(String[] randoms) {
		Random r = new Random();
	    // 0 부터 4까지
	    int ops_result = r.nextInt(randoms.length);		
	    System.out.print("\n\n"+ "랜덤 결과 : " + randoms[ops_result] + " 선택 됨");	// 이걸 마지막에 나오게끔 만들어 보기
	    pauseExecution(1000);
	    return ops_result;
	}
	    
	
	 public void showOption4() {			// 디젤 넣는 옵션
		 System.out.println("옵션 4번 디젤 넣기를 선택하셨습니다");
	     pauseExecution(1000);
	     System.out.println("\n디젤 선택중");		
	     pauseExecution(1000);
	     System.out.println("\n디젤 선택 완료");
	     pauseExecution(1350);
	     System.out.print("\n디젤 넣는중");
	     pauseExecution(1000);
		 for (int i = 0; i < 3; i++) {
			pauseExecution(700);
			System.out.print(".");
		 }
		 pauseExecution(500);
		 System.out.println("\n\n=====차가 퍼졌습니다=====");
		 pauseExecution(750);
		 j = 0;
		 j1 = 0;
		 return;
	}
	 
	 public void showOption5() {			// LPG 넣는 옵션
		 System.out.println("옵션 5번 LPG 넣기를 선택하셨습니다");
	     pauseExecution(1000);
	     System.out.println("\nLPG 선택중");		
	     pauseExecution(1000);
	     System.out.println("\nLPG 선택 완료");
	     pauseExecution(1350);
	     System.out.print("\nLPG 넣는중");
	     pauseExecution(1000);
		 for (int i = 0; i < 3; i++) {
			pauseExecution(700);
			System.out.print(".");
		 }
		 pauseExecution(500);
		 System.out.println("\n\n=====차가 퍼졌습니다=====");
		 pauseExecution(750);
		 j = 0;
		 j1 = 0;
		 return;
	}
	 
	

	public void RandomOption() {
		int ops;	
		// 랜덤
		Random r = new Random();
	    // 0 부터 9까지
		int randomNumber = r.nextInt(10);	// 최대 랜덤 옵션 값(개수) (숫자 0~9중에 한가지 선택하여 랜덤하게 나옴)
        if (randomNumber >= 5) {
            ops = 5; // 랜덤돌려서 나온 숫자가 5보다 크거나 같으면 ops 를 5로 만들어서 강제로 확율 50%을 만들어줬음 (50%) 5~9까지 가 여기
            j = 0;
    		j1 = 0;
        } else {
            ops = randomNumber % 5; 		// 위에 빼고 5 빼고 남어지 숫자 0~4까지 나오면 알아서 대입 (50%) 
            j = 0;	
    		j1 = 0;
        }
        
	    	switch (ops) {
	        case 0:
	        	pauseExecution(800);
	            System.out.print("\n누유 발생");				
	            System.out.println("\n\n기름양 -10");			
	            oil.useOil(10);								// -10
	            pauseExecution(750);
	            System.out.println("\n\n드라이브에 쓴 기름양 -10");
	            pauseExecution(750);
	            oil.useOil(10); 
	            break;
	        case 1:
	        	pauseExecution(800);
	            System.out.print("\n너무 밟았습니다");			
	            System.out.print("\n\n기름양 -30");
	            pauseExecution(750);
	            oil.useOil(30);								// -30
	            System.out.println("\n\n드라이브에 쓴 기름양 -10");
	            pauseExecution(750);
	            oil.useOil(10);
	            break;
	        case 2:
	        	pauseExecution(800);
	            System.out.print("\n경찰 단속에 걸렸습니다\n");	
	            pauseExecution(700);
	            System.out.print("\n경찰에 차량을 압류당했습니다\n");
	            pauseExecution(1100);
	            JS_Start_Page.replay();						// 다시하기
	            break;
	        case 3:
	        	pauseExecution(800);
	        	System.out.print("\n고통사고 났습니다\n");		
	        	pauseExecution(700);
	        	System.out.print("\n차량 폐차\n");
	        	pauseExecution(1100);
	        	JS_Start_Page.replay();						// 다시하기
	        	break;
	        case 4:
	        	pauseExecution(800);
	        	System.out.print("\n고통 체증이 심합니다");		
	        	System.out.print("\n\n기름양 -5");
	        	pauseExecution(750);
	        	oil.useOil(5);								// -5
	        	System.out.println("\n\n드라이브에 쓴 기름양 -10");
	        	pauseExecution(750);
	        	oil.useOil(10); 
	        	break;
	        case 5:
	        	pauseExecution(800);						
	        	System.out.println("\n\n드라이브에 쓴 기름양 -10");
	        	oil.useOil(10);								// -10
	        	// 여기만 확율 50퍼임 남어진 각각 10퍼씩
	        	break;
	        default:
	            throw new IllegalStateException("랜덤 옵션3 오류:  " + ops);
	        }
	        return;
	    	}
	
	public static void game_Manual() {			// 게임 설명서
		String Font_Blue = "\u001B[36m";		// 색상변경	(파랑색)
		String Reset = "\u001B[0m";				// 변경 초기화
		System.out.println("\n=================== 게임 설명서 ===================\n");
		System.out.println("• 게임은 자동차를 "+ Font_Blue +"'3번'" + Reset + " 업그레이드하면 게임이 종료된다");
		System.out.println("");
		System.out.println("• 게임 플레이 동안 기름은 딱 " + Font_Blue + "'10번'" + Reset + " 사용이 가능하다");  
		System.out.println("");  
		System.out.println("• [2] 일반유 넣기, [3] 고급유 넣기는 " + Font_Blue + "'3번'" + Reset + " 연속적으로 사용불가");  
		System.out.println("");  
		if(Oil_Level.oil_Use >= 10) {
		System.out.println("• [7] 랜덤 선택시 기름은 " + Font_Blue + "'2배'" + Reset + " 이벤트 중");  
		} 
		pauseExecution(3300);
		
	}
	
	public static void pauseExecution(long milliseconds) {		// 위 반복문 쓸때 몇초 기다리는지 설청하는거
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("sleep 오류");
		} 
		
	}
	

}		// 마지막

	




