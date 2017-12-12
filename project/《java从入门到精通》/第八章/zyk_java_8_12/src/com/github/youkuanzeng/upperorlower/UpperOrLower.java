package com.github.youkuanzeng.upperorlower;

public class UpperOrLower {
	public static void main(String[] args) {
		Character mychar1 = new Character('A');
		Character mychar2 = new Character('a');
		System.out.println(mychar1 + "ÊÇ´óĞ´×ÖÄ¸Âğ£¿"
				+ Character.isUpperCase(mychar1));
		System.out.println(mychar2 + "ÊÇĞ¡Ğ´×ÖÄ¸Âğ£¿"
				+ Character.isLowerCase(mychar2));
	}
}
