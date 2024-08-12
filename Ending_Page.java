package JS_Toy;

public class Ending_Page {
	
	// 시간 나면 이미지 넣기
	
	
	public void pauseExecution(long milliseconds) {		// 위 반복문 쓸때 몇초 기다리는지 설청하는거
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("sleep 오류");
            return;
        } 
	
	}
}
