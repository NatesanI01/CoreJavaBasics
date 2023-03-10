package com.ioSamples;

public class InSufficientBalance extends Exception {
	double amount;
	InSufficientBalance(double amt){
		amount=amt;
	}

}
