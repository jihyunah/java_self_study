package org.opentutorials.javatutorials.condition;

public class LoginDemo3 {

	public static void main(String[] args) {
		String id = args[0];
        String password = args[1];
        if (id.equals("egoing") && password.equals("111111")) { //논리연산자 and
            System.out.println("right");
        } else {
            //System.out.println("wrong");
            System.out.println("wrong");
            System.out.println("wrong");

        }
	}

}
