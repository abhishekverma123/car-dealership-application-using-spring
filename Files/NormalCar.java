package demo.spring.application;

public class NormalCar implements Car {
	public String owner;

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		
		     System.out.println(this.owner+" owns A family car");
		
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
