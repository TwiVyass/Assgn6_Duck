
public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
		swimBehaviour = new CantSwim();
	}
	
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("This is Decoy Duck....");
		
	}

}
