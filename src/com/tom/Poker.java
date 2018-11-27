package com.tom;

public class Poker {

	int[] number;
	
	public Poker(int[]number) {
		this.number=number;
		
	}
		
	public void printAll() {
		for(int i=0;i<13;i++){
			char c=0x2663;
			System.out.print(((number[i]%13)+1));
			System.out.print(c+"\t");
		}
		System.out.println();
		for(int i=13;i>12&&i<26;i++){
			char d=0x2666;
			System.out.print(((number[i]%13)+1));
			System.out.print(d+"\t");
		}
		System.out.println();
		for(int i=26;i>25&&i<39;i++){
			char h=0x2665;
			System.out.print(((number[i]%13)+1));
			System.out.print(h+"\t");
		}		
		System.out.println();
		for(int i=39;i>38&&i<52;i++){
			char s=0x2660;
			System.out.print(((number[i]%13)+1));
			System.out.print(s+"\t");
		}
		
	}
			
			
}
