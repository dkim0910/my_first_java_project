package JS_Toy;

import java.util.Scanner;

public class JS_Start_Page {

	public static void main(String[] args) {
		// 스케너 추가
		Scanner scanner = new Scanner(System.in);
		 
		// 자동차 이미지들 가지고 오기
		Cars c = new Cars();
		 
		// 옵션들 추가 불러오기
		Options o = new Options();
		
		// 기름 옵션들 불러 오기
		Oil_Level o1 = new Oil_Level();
		 
		
		// 버그 :
		// 만약 기름 사용량이 10이고 기름이 100이 동시에 되면 업그레이드 구문이 먼저 작동함,
		// 그래서 업그레이드 가능해짐... (안되게 막어야됨)
		
		 
		// 시작 이미지 가지고 오기
		c.Start_Page();					
		 
		boolean gameRunning = true;
		while (gameRunning) {
		show_MainMenu();
		        
		String choice = scanner.nextLine();
	
			switch (choice) {
			case "1":				// 이거
		    case "[1]":				// 이거
		    case "[1] 드라이브 가기":	// 이거
		    case "드라이브":			// 이거
		    case "ㄱㄱ":				// 이거 중 하나만 입력해도 아래 구문 실행됨
		    	o.showOption1();
		    	break;
		    	
		    case "2":				
			case "[2]":				
			case "[2] 일반유 넣기 ":	
			case "일반":			
				if(Oil_Level.oil_Use >= 10) {
					System.out.println("\n\n더이상 기름을 채울 수 없습니다");
		    		System.out.println("\n다른 옵션을 선택하여 주세요");
		    		pauseExecution(700);
				} else {
				o.showOption2();
				}
		        break;	
		    	
			case "3":
		    case "[3]":
		    case "[3] 고급유 넣기":
		    case "고급유":
		    case "고급":
		    	if(Oil_Level.oil_Use >= 10) {
					System.out.println("\n\n더이상 기름을 채울 수 없습니다");
		    		System.out.println("\n다른 옵션을 선택하여 주세요");
		    		pauseExecution(700);
		    	} else {
		    	o.showOption3();
		    	}
		        break;
		        
		    case "4":
		    case "[4]":
		    case "[4] 디젤 넣기":
		    case "디젤":
		        o.showOption4();
		        c.brokencar();		
		        System.out.println(
		        "\n"
		        + "  #####     ##     ####   ####  ######     ####  #### ###  ######  ######  \n"
		        + " ##   #     ##      ###   ###    ##  #    ##  ##  ##   #    ##  #   ##  ## \n"
		        + " ##        ###      ###  # ##    ## #     ##  ##  ##  #     ## #    ##  ## \n"
		        + "##         # ##     # ## # ##    ####    ##   ##  ##  #     ####    #####  \n"
		        + "##  ###   #  ##    ## ### ##    ##  #    ##   ##  ## #     ##  #   ## ##   \n"
		        + "##   ##   ######   #  ### ##    ##       ##  ##    ###     ##      ##  ##  \n"
		        + "##  ##   #    ##   #  ##  ##    ##  #    ##  ##    ##      ##  #   ##  ##  \n"
		        + " ### #  ###  #### ### ## ####  ######     ####     ##     ######  #### ### " );
		        replay();		
		        break;  
		    
		    case "5":
		    case "[5]":
		    case "[5] LPG 넣기":
		    case "LPG":
		        o.showOption5(); 
		        c.brokencar();		
		        System.out.println(
		        "\n"
		        + "  #####     ##     ####   ####  ######     ####  #### ###  ######  ######  \n"
		        + " ##   #     ##      ###   ###    ##  #    ##  ##  ##   #    ##  #   ##  ## \n"
		        + " ##        ###      ###  # ##    ## #     ##  ##  ##  #     ## #    ##  ## \n"
		        + "##         # ##     # ## # ##    ####    ##   ##  ##  #     ####    #####  \n"
		        + "##  ###   #  ##    ## ### ##    ##  #    ##   ##  ## #     ##  #   ## ##   \n"
		        + "##   ##   ######   #  ### ##    ##       ##  ##    ###     ##      ##  ##  \n"
		        + "##  ##   #    ##   #  ##  ##    ##  #    ##  ##    ##      ##  #   ##  ##  \n"
		        + " ### #  ###  #### ### ## ####  ######     ####     ##     ######  #### ### " );
		        replay();		
		        break;  
		                  
		    case "6":
		    case "[6]":
		    case "[6]랜덤":
		    case "랜덤":
		    	
		    	Boolean trigger = true;
		    	
		    String[] ops1 = {"드라이브 가기" , "일반유", "고급유" , "디젤" , "LPG"}; 
			int selection = o.showOptions(ops1); 
	        if(selection == 0) {	// 드라이브
	        	o.showOption1();
	        	break;
	        }if(selection == 1) {	// 일반유
	        	if (Oil_Level.oil_Use >= 10) {
	        	System.out.print("\n일반유 넣는중");
	    		for (int i = 0; i < 3; i++) {
	    				pauseExecution(700);
	    				System.out.print(".");
	    			}
	    		System.out.println("\n\n2배 이벤트!!!");
	    		o1.random_Add_Oil(20);
	        	}
	        	else if (Oil_Level.oil_Use <= 10 && trigger == true) 
	        		o.showOption2();
	        		if(Oil_Level.oil_Use == 10) {
	        			trigger = false;
	        	}
	        	break;
	        	
	        }if(selection == 2) {	// 고급유
				if (Oil_Level.oil_Use >= 10) {
	        	System.out.print("\n고급유 넣는중");
	    		for (int i = 0; i < 3; i++) {
	    				pauseExecution(700);
	    				System.out.print(".");
	    			}
	    		System.out.println("\n\n2배 이벤트!!!");
	    		o1.random_Add_Oil(30);
	    		
				}
				else if (Oil_Level.oil_Use <= 10 && trigger == true) 
	        		o.showOption3();
	        		if(Oil_Level.oil_Use == 10) {
	        			trigger = false;
		        }
	        	break;
	        }if(selection == 3 || selection == 4) {
	        	c.brokencar();		// 고장난 차 이미지
	        	System.out.println(
				"\n"
				+ "  #####     ##     ####   ####  ######     ####  #### ###  ######  ######  \n"
				+ " ##   #     ##      ###   ###    ##  #    ##  ##  ##   #    ##  #   ##  ## \n"
				+ " ##        ###      ###  # ##    ## #     ##  ##  ##  #     ## #    ##  ## \n"
				+ "##         # ##     # ## # ##    ####    ##   ##  ##  #     ####    #####  \n"
				+ "##  ###   #  ##    ## ### ##    ##  #    ##   ##  ## #     ##  #   ## ##   \n"
				+ "##   ##   ######   #  ### ##    ##       ##  ##    ###     ##      ##  ##  \n"
				+ "##  ##   #    ##   #  ##  ##    ##  #    ##  ##    ##      ##  #   ##  ##  \n"
				+ " ### #  ###  #### ### ## ####  ######     ####     ##     ######  #### ### " );
	        	replay();		
	        	break;
	        	
	        } else {
	        	System.out.println("error on selection ops");
	        }
	        
		        
		    case "7":
		    case "[7]":
		    case "[7] 게임 설명서":
		    case "게임":
		    case "설명서":
		    	Options.game_Manual();
		    	break;
		    
		    case "8":
		    case "[8]":
		    case "[8] 게임 종료":
		    case "게임 종료":
		    case "종료":
		    	System.out.println("게임 오버");
		    	System.out.println("계속하기 횟수 : " + replay);
		    	System.exit(0);
		    
		    	
		    default:							// 선택지 외 다른 버튼 누루면 아래 구문 출력
		    	System.out.println("\n***** 다시 눌러주세요 *****");
		            }
		        }
		        scanner.close();
		    }
		
	
		
		public static void show_MainMenu() {	
			
			String Font_Blue = "\u001B[36m";	// 색상변경
			String Reset = "\u001B[0m";			// 변경 초기화
			
			if (Oil_Level.oil_level < 0) {		// 기름이 0이하로 낮아지면 replay 로 넘어감
				pauseExecution(500);
			    System.out.println("\n도로 한복판에 차가 서버렸다...");
			    pauseExecution(1000);
			    JS_Start_Page.replay();
			    }
				
		    	System.out.println("\n\n=================== 옵션 ===================");
		    	if(Options.car_Upgrade1 >= 3) {
		    		System.out.println(Font_Blue + "\n*#*#*#*[1] 드라이브 가기 선택시 엔딩*#*#*#*" + Reset);
		    	}
			    System.out.println("[1] 드라이브 가기  [2] 일반유 넣기  [3] 고급유 넣기");
			    System.out.println("[4] 디젤 넣기     [5] LPG 넣기   [6] 랜덤 선택");
			    System.out.println("[7] 게임 설명서    [8] 게임 종료");
			    System.out.println("차량 기름양 : " + Oil_Level.oil_level);
			    System.out.println("기름 넣기 사용 횟수: " + Oil_Level.oil_Use + "/10");
			    System.out.print("\n번호를 입력하세요: ");
			    System.out.println("");
			    }
		    
			static int replay = 0;
			static int replay1 = replay;		// 계속하기 했던 횟수
			
		    public static void replay() {		// 계속하기 옵션
		    	Scanner scanner = new Scanner(System.in);
		    	
		    	String ops;
		            
		    	System.out.println("\n계속하기?\n");
		    	System.out.println("Y?   OR   N?");
		    	System.out.println("\n입력란 : ");
	
		    	while (true) {
		    		ops = scanner.nextLine().trim().toUpperCase();		// 다음줄에 입력 가능, 공백 없애고 소문자도 대문자로 변환하여 입력됨
	
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
		            System.out.println("게임 계속하기");
		            replay++;
		            return; 	// 옵션 쪽으로 돌아감
		            
		            case "N":
		            case "No":
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
		            System.out.println("게임종료");
		            System.out.println("계속하기 횟수 : " + replay);
		            System.exit(0);		// 프로그램 종료
		            
		            default:
		            System.out.println("\n'Y' 또는 'N' 선택해주세요");	// 'y' 또는 'n' 외 선택시 출력
		            break;				// 이 switch 문 반복
		            }
		    	}
		    }
		    
	    public static void pauseExecution(long milliseconds) {		// 위 반복문 쓸때 몇초 기다리는지 설청하는거
	        try {
	            Thread.sleep(milliseconds);
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	            System.out.println("sleep 오류");
	       } 
	    }
		    
}
