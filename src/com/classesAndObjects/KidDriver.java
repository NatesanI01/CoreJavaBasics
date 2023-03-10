package com.classesAndObjects;

public class KidDriver {

	public static void main(String[] args) {
//		Kid kidOne = new Kid();
		Kid kidOne=new Kid("Pinky",8);
		kidOne.play();
		kidOne.printKid("RAju");
		kidOne.printKid(3);
		kidOne.printKid("Raju", 8);
		Kid kidTwo=new Kid("Wicky",8);
//		System.out.println(kidTwo.name);
		kidTwo.play();
		System.out.println("All kids are in "+Kid.studyClass);
		
//		EncapsulatedKid kid=new EncapsulatedKid();
//		kid.setAge(10);
//		kid.setName("Natesan");
//		System.out.println(kid.getAge());
//		kid.play();
		

	}

}
