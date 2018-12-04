package com.tom;

public class Cards {
int value;
char[] suits={'\u2663','\u2666','\u2665','\u2660'};
	public Cards(int value){
	this.value=value;
	}
	
	public String get(){
		String g = value%13+1+" "+suits[value/13]+"\t";
		return g;
	}
}
