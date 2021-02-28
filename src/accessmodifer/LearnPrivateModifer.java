package accessmodifer;

public class LearnPrivateModifer {

	private int val =15;
	
	private void disp()
	{
		System.out.println("Private Mthod - Package 2 - Hello");
	}
	
	public static void main(String[] args) {

		LearnPrivateModifer obj = new LearnPrivateModifer();
		System.out.println(obj.val);
		obj.disp();
		
	}
	

}
