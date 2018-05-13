package com.br;

import java.util.Arrays;

import com.br.blockchain.Block;
import com.br.blockchain.Transaction;

public class MainApp {
	
	/** 
	 * BlockChain 
	 * -> Block (Hash of Previous Block + Transactions)
	 * -> Chained together
	 * */

	public static void main(String...args) {
		Transaction transaction1 = new Transaction("Peter","Sam", 100L);
		Transaction transaction2 = new Transaction("Sam","Ryan", 1000L);
		Transaction transaction3 = new Transaction("Sam","Ryan", 1000L);
		Transaction transaction4 = new Transaction("Peter","Lico", 20900L);
		
		System.out.println("hashCode 1 "+transaction1.hashCode());
		System.out.println("hashCode 2 "+transaction2.hashCode());
		System.out.println("hashCode 3 "+transaction3.hashCode());
		System.out.println("hashCode 4 "+transaction4.hashCode());
		
		Block firstBlock = new Block(0, Arrays.asList(transaction1,
													  transaction2));
		
		System.out.println("hashCode first block "+firstBlock.hashCode());
		
		Block secondBlock = new Block(123, Arrays.asList(transaction3,
				  									   transaction4));	
		
		System.out.println("hashCode second block "+secondBlock.hashCode());
		
		/*hashCode first block    1627583016
		  hashCode second block -528450798
		  
		  hashCode first block 	  1627583016
		  hashCode second block -528432298 
		  
		  hashCode first block 1627583016
		  hashCode second block -528446985
		  
		  hashCode first block 1627583016
		  hashCode second block -528428085
		  */
		
	}
	
}
