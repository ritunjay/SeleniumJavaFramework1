package Demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
         try {
			demo();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void demo() throws Exception{
			System.out.println("Hello World.....!");
			int i = 1/0;
			System.out.println("Test Completed");
			
	}
	

}
