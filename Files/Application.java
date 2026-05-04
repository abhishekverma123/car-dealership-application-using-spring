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
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi, Please Enter your name");
		String name = sc.next();
		String beanId = "";
		
		     
		 
		   while(true) {
		System.out.println("Please Select your car of choice \n1) Family Car\n2) Sports Car\n3) Truck");
		  int  choice = sc.nextInt();
		   switch(choice) {
		   case 1 ->     beanId = "familyCar";
		   case 2 -> beanId = "sportCar";
		   case 3 ->  beanId = "truck";
		   default  -> { System.out.println("Invalid Choice ");
		                  continue;
		               }
		   }
		       
		         Car car = (Car)context.getBean(beanId);     
		            car.setOwnerName(name);
		            car.getInfo();
		         
		        }
		   
		   
		   }
		
	}


