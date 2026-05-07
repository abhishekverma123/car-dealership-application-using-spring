package demo.spring.application;

public class SportCar implements Car {
     

	  String owner;
      Tyre tyre;
      // constructor DI 
//      SportCar(Tyre tyre){
//		   this.tyre = tyre;
//	}
      // DI using setter method
      public void setTyre(Tyre tyre) {
  		this.tyre = tyre;
  	}
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(this.owner+" owns A Sport Car "+tyre.getTyreInfo());
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
