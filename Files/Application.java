package demo.spring.application;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		   while(true) {
			   Scanner sc = new Scanner(System.in);
				System.out.println("Hi, Please Enter your name");
				String name = sc.nextLine();
				String beanId = "";
			   
		System.out.println("Please Select your car of choice \n1) Family Car\n2) Sports Car\n3) Truck");
		  int  choice = sc.nextInt();
		   switch(choice) {
		   case 1 -> {  System.out.println("Please Select which type of tyre want to inject\n1) Normal Tyre\n2) Sport Tyre");
		                 int tyreType = sc.nextInt();
		                 switch(tyreType) {
		                 case 1 -> beanId = "familyCarWithNormalTyre";
		                 case 2 -> beanId = "familyCarWithSportTyre";
		                 default -> System.out.println("Error");
		                 }
		   }
		   case 2 -> {
			   System.out.println("Please Select which type of tyre want to inject\n1) Sport Tyre\n2) Heavy Tyre");
			   int tyreType = sc.nextInt();
			   switch(tyreType) {
			   case 1 -> beanId = "sportCarWithSportTyre";
			   case 2-> beanId = "sportCarWithHeavyTyre";
			   default -> System.out.println("Error");
			   }
		   }
		   case 3 ->  beanId = "truck";
		   default  -> { System.out.println("Invalid Choice ");
		                  sc.close();
		                  context.close();
		                 return;
		               }
		   }
		       
		         Car car = (Car)context.getBean(beanId);     
		            car.setOwnerName(name);
		            car.getInfo();
		         
		        }
		   
		   
		   }
		
	}


