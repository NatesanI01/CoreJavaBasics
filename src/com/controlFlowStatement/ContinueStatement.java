package com.controlFlowStatement;

public class ContinueStatement {

	public static void main(String[] args) {
		int arr[]= {12,56,85,96,78,23,25};
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==56)
				continue;
			else
				System.out.println(arr[i]);
		}

	}

}
