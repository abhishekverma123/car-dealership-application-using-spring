package demo.spring.application;

public class Truck implements Car {
    String owner;
    Tyre tyre;
    // constructor DI 
    Truck(Tyre tyre){
		   this.tyre = tyre;
	}
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(this.owner+" owns A truck "+tyre.getTyreInfo());
		
	}

	@Override
	public void setOwnerName(String owner) {
		// TODO Auto-generated method stub
		this.owner = owner;	
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return this.owner;
		
	}

}
