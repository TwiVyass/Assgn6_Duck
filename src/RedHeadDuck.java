
public class RedHeadDuck extends Duck {
	
	// default constructor
	
	public RedHeadDuck() {
		// creating object of quack
		quackBehaviour = new Quack();
		// creating object of fly
		flyBehaviour = new FlyWithWings();
		swimBehaviour = new CanSwim();
		
	}
	
	// extending abstract class; inheritance
	

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("This is a RehHead Duck....");
		
	}

}
