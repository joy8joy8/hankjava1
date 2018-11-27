package com.tom;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		int[] nums =new int[5]; //索引值從0~4
		nums[0]=99;  //預設值為0
		nums[4]=57;
		//System.out.println(nums[0]);
		
		int[]number ={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,
				36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
		int[] type={0x2663,0x2666,0x2665,0x2660}; 
		System.out.println(type.length); //陣列長度，有幾個值
		for(int i=0;i<number.length;i++){
			//System.out.println(number[i]);
			if(number[i]/13==0){
			System.out.println(((number[i]%13)+1)+"\t"+type[0]);
			}else if((number[i]/13)==1){
			System.out.println(((number[i]%13)+1)+"\t"+type[1]);	
			}
			
		}
		
		char c=0x2666;
		System.out.println(type[1]);
		System.out.println(c);
		
		Random random = new Random();
		int all=random.nextInt(53);
		
		
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
