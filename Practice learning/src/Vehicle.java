class Vehicle {
      int speed = 100; //instance variable
      
      public Vehicle() {
    	  System.out.println(" Default Vehicle constructor");
      }
      public Vehicle(int speed) {
    	  System.out.println("Constructor with speed");
    	  this.speed = speed;//this keyword only used for same class
      }
}
class car extends Vehicle{  // car inherited vehicle
	                         // car is subclass
	String name;
	
	public car(int speed, String name){
		super(speed); // call the superclass constructor.
		this.name = name;// this accessed the name variable 
	}
			
	public void display() {
		System.out.println(super.speed); // super on variable method

	}
	
}