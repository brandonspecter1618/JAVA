package com.bank.credit.messagegenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageGeneratorApplication.class, args);
		MyFunc objMyFunc = new MyFunc();
		System.out.println("Hello Brandon MAIN" + " The result is " + objMyFunc.myFunc());
	}

}

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
