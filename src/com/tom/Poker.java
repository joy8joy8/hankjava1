package com.tom;

import java.util.ArrayList;
import java.util.Random;

public class Poker {
int a;
Cards [] card=new Cards[52*a];
	public void shuffle(){
		for(int i=0;i<52;i++){
			int c=new Random().nextInt(52);	
			//a=card[i]
			//b=card[r]
			Cards trm = card[i];
			card[i]=card[c];
			card[c]=trm;
			System.out.print(card[i].get());
			if(i%13==12){
				System.out.println();
			}
		}
	}

	public void printAll() {
		a=1;
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
	public void add(){
		a=2;
		for(int i=0;i<52*a;i++){
			card[i]=new Cards(i);
			System.out.print(card[i].get());
			if(i%13==12){
				System.out.println();
			}

		}
	}
}


