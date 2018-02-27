
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LilyPad pad = new LilyPad();
		
		int hops = pad.howManyHops(3, 2);
		int hops2 = pad.hoeManyHopsOp(3, 2);
		System.out.println("With looping: " + hops);
		System.out.println("Without looping: " + hops2);
		
		pad.getNum();

	}

}
