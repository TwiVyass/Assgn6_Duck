
abstract public class Duck {
	/* objects of flybehaviour and quackbahiovu objects of interface */
	// to display, class is abstract
	// individual behaviours 
	// method display needed by all ducks ]
	// common function display, create abstract class
	// interface should be unique and individual so Duck cannot be interface 
	// first seting behaviour and then displaying
	
	FlyBehaviour flyBehaviour;
	QuackBehaviour quackBehaviour;
	SwimBehaviour swimBehaviour;
	
	public void setQuackBehaviour(QuackBehaviour qb) {
		
		quackBehaviour = qb;
	}


	public void setFlyBehaviour(FlyBehaviour fb) {
		
		flyBehaviour = fb;
	}
	
	public void setSwimBehavior(SwimBehaviour sb) {
		
		swimBehaviour = sb;
	}
	
	
	abstract void display();
	
	public void performFly() {
		flyBehaviour.fly();
	}
	
	public void performQuack() {
		quackBehaviour.quack();		
	}	
	
	public void performSwim() {
		swimBehaviour.swim();
	}
	
	
	// also a type of encapsulation  bcuz not calling flybehaviour
	// calling performfly
	
}
