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
			return 'S'; // �p�G�S��return�ȡA�n�O�obreak:
		case 1:
			return 'H';
		case 2:
			return 'D';
	/*	case 3:
			return'C';*/
		default:
			return 'C';
		}
	}
	public void gameResult(){
		System.out.printf(number+"\t"+degree()+"\n");
	}
	
	
}