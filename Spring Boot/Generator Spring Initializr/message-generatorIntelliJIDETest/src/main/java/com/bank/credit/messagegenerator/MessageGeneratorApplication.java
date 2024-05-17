package com.bank.credit.messagegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageGeneratorApplication.class, args);
		System.out.println("Hello Brandon Main");
		//MyFunc objMyFunc = new MyFunc();
	}

}
/*
class Client{

	private Integer a;
	private Integer b;

	public void setA_B(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}

	public Integer getA() {
		return a;
	}

	public Integer getB() {
		return b;
	}
}

class MyFunc{
	public Integer myFunc(){
		Integer result;
		Client objClient = new Client();
		objClient.setA_B(20, 30);
		result = objClient.getA() + objClient.getB();
		return(result);
	}
}
*/

