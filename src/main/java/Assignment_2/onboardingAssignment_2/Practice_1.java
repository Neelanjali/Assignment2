package Assignment_2.onboardingAssignment_2;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Practice_1 p=new Practice_1(2);		
	}

	Practice_1(int x)
	{
	switch(x % 2)
	{
	case 0:
		System.out.println("Odd");
		break;
	
	case 1:
		System.out.println("Even");
		break;
	}
}
}
