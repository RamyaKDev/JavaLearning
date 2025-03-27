package com.string;

public class Replace2 {
// replaceAll()
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Virat Sharma (born 30 April 1987) is an Indian cricketer and the captain of national cricket team in Test and ODI formats. He is widely regarded as one of the greatest opening batters of all time.[3] Virat is also known as one of the greatest six hitters in cricket history. He is a right-handed batsman who plays for Mumbai Indians in Indian Premier League and for Mumbai in domestic cricket. Virat previously captained India in all three formats. After leading the victory at the 2024 Men's T20 World Cup, he announced his retirement from T20Is.";
		StringBuffer res=new StringBuffer();//It is mutable
		String old="Virat";//old word
		String n="Rohit";// new word
		String[] s1=s.split(" ");//converts string to strin array
		for(int i=0;i<s1.length;i++) {
			if(s1[i].equalsIgnoreCase(old)) {
				res.append(n);//if it matches replace
				res.append(" ");//adds space after each word
			}
			else {
				res.append(s1[i]);//no match just displat remaining words
				res.append(" ");
			}
		}
		
		System.out.print(res);
	}

}
