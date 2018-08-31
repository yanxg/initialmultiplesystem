public class Hand{
	private FirstFinger firstfinger;
	private SecondFinger secondfinger;

	public Hand(FirstFinger firstfinger, SecondFinger secondfinger){
		this.firstfinger = firstfinger;
		this.secondfinger = secondfinger;
	}

	public void sayFingers(){
		System.out.println("I have two fingers.");
	}

	public Finger getFirstFinger(){
		return firstfinger;
	}
	
	public Finger getSecondFinger(){
		return secondfinger;
	}

	public static void main(String[] args){
		FirstFinger ff = new FirstFinger();
		SecondFinger sf = new SecondFinger();

		Hand hand = new Hand(ff, sf);
		hand.sayFingers();
		hand.getFirstFinger().printFinger();
		hand.getSecondFinger().printFinger();
		
	}
}
