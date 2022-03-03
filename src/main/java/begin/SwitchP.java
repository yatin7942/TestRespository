package begin;


public class SwitchP {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int quarter;
		switch(month)
		{
		case 1:
		case 2:
		case 3:
			quarter=1;
			System.out.println("Quarter="+quarter);
			break;
		case 4:
		case 5:
		case 6:
			quarter=2;
			System.out.println("Quarter="+quarter);
			break;
		case 7:
		case 8:
		case 9:
			quarter=3;
			System.out.println("Quarter="+quarter);
			break;
		case 10:
		case 11:
		case 12:
			quarter=4;
			System.out.println("Quarter="+quarter);
			break;
		default:
			System.out.println("Enter Valid Month(1-12)!!!");
		}
		

	}

}
