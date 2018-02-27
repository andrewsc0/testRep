
public class LilyPad {
	
	int numHops = 0;
	int curr = 0;
	
	
	// calculates how many hops the frog has to take
	// to get the the final lilyPad
	public int howManyHops(int numLilys, int canHop) {
		
		while(curr<numLilys) {
			
			if((numLilys-curr)<canHop) {
				
				curr = numLilys;
				numHops++;
				
			} else {
				
				curr = curr + canHop;
				numHops++;
				
			}
			
		}
		
		return numHops;
		
	}
	
	public int hoeManyHopsOp(int numLilys, int canHop) {
		
		return (int) Math.ceil(numLilys/canHop);
		
	}
	
	public void getNum() {
		
		
	}

}
