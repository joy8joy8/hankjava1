package com.tom;

import java.util.ArrayList;

public class Pocker2 {
	ArrayList bag = new ArrayList();
	public Pocker2(){
		for(int i=0;i<52;i++){
			Cards c=new Cards(i);
			bag.add(c);
			System.out.println(bag.size());
			System.out.println(bag.get(i));
			if(i%13==12){
				System.out.println();
			}

		}
	}
	
	
}
