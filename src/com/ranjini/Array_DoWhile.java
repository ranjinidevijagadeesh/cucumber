package com.ranjini;

public class Array_DoWhile {
	
	public static void main(String[] args) {
		int i [] = new int [10];
		i[0] = 9;
		i[1] = 9;
		i[2] = 6;
		i[3] = 2;
		i[4] = 9;
		i[5] = 9;
		i[6] = 9;
		i[7] = 9;
		i[8] = 4;
		i[9] = 9;
		int j = 0;
		{
			do
			{
				System.out.println(i[j]);
				j++;
			}
			while(j<i.length);
		}
	}
}
