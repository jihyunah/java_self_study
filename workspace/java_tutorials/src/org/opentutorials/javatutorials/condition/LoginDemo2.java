package org.opentutorials.javatutorials.condition;

public class LoginDemo2 {

	public static void main(String[] args) {
		String id = args[0]; //args[0]은 입력값을 말한다고 생각하면 됨. ex) LoginDemo egoing
        if(id.equals("egoing")){
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
	}

}
