
public class WoodenDuck extends Duck {
	
	public WoodenDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
		swimBehaviour = new CantSwim();
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Duck is wooden...");
	}
	

}
