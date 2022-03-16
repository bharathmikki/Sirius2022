package sample;

public class Investment {

	public static void main(String[] args) {
		
		int original = 14000;
		
		System.out.println("Original Worth "+original);

		float total = (float)original+(original*0.4f);
		
		System.out.println("After One year "+total);
		
		float secondyear = (float)total - 1500;
		
		System.out.println("After Second Year "+secondyear);
		
		float thirdyear = (float)(secondyear)+(secondyear*0.12f);
		
		System.out.println("Third year "+thirdyear);
	}

}
