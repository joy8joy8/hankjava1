package com.tom;

public class Four {
	int number;
	int flower;
	int all;
	public Four(int number, int flower) {
		this.number = number;
		this.flower = flower;
	}
	public Four(int all){
		this.all=all;
	}

	public char degree() {
		switch (flower) {
		case 0:
			return 'S'; // 如果沒有return值，要記得break:
		case 1:
			return 'H';
		case 2:
			return 'D';
		case 3:
			return 'C';
		}
		return 0;  //要有一個漏掉值時可以用的東西 或是用default
	}
	public void gameResult(){
		System.out.printf(number+"\t"+degree()+"\n");
	}
	
	
}