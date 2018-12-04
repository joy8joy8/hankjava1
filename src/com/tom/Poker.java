package com.tom;

import java.util.Random;

public class Poker {
Cards [] card=new Cards[52];
	public void shuffle(){
		for(int i=0;i<52;i++){
		int c=new Random().nextInt(52);	
			//a=card[i]
			//b=card[r]
		
		}
	}

	public void printAll() {
		for(int i=0;i<52;i++){
			//System.out.print(number[i]);
			//System.out.print((i%13)+1);
			card[i]=new Cards(i);
			System.out.print(card[i].get());
			if(i%13==12){
				System.out.println();
			}

	}
			
	}
}

