package com.tom;

import com.sun.jndi.url.corbaname.corbanameURLContextFactory;

//import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		
//		Cards c = new Cards(5);
//		Cards[] cards = new Cards[52];
		
		Poker all = new Poker();
		all.printAll();
				
	/*int[] nums =new int[5]; //索引值從0~4
		nums[0]=99;  //預設值為0
		nums[4]=57;
		System.out.println(nums[0]);
		
		int[]number ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,
				18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,
				35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51};
		char[] type={0x2666,2,3,4}; 
		System.out.println(type[0]);
		System.out.println(type.length); //陣列長度，有幾個值
		*/

		
	/*	for(int i=0;i<number.length;i++){
			//System.out.println(number[i]);
			char d=0x2666;
			char c=0x2663;
			char s=0x2660;
			char h=0x2665;
			if(number[i]/13==0){
				System.out.println(((number[i]%13)+1)+"\t"+c);
				
				}else if((number[i]/13)==1){
				System.out.println(((number[i]%13)+1)+"\t"+d);
				}else if((number[i]/13)==2){
					System.out.println(((number[i]%13)+1)+"\t"+h);	
				}else if((number[i]/13)==3){
					System.out.println(((number[i]%13)+1)+"\t"+s);	
				}
			
		}*/
		
		/*char c=0x2666;
		char d=0x2663;
		System.out.println(type[1]);
		System.out.println(c);
		System.out.println(d);*/
		
			
		/*
		int number=random.nextInt(13)+1;
		int flower=random.nextInt(4);
		Four card = new Four(number,flower);
		card.gameResult();*/
			
			
		/*
		System.out.print(number);
		if(flower==0){
			System.out.print("S");
		}else if(flower==1){
			System.out.print("H");
		}else if(flower==2){
			System.out.print("D");
		}else{
			System.out.print("C");
		}*/

	}

}
