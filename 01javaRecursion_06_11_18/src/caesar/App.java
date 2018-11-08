package caesar;

public class App {

	public static void main(String[] args) {
		
		CaesarCipher caesarCipher = new CaesarCipher();
		
		String plainText = "If he had anything confidential to say he wrote it in cipher that is by so changing the order of the letters of the alphabet that not a word could be made out";
		String cipherText = caesarCipher.encrypt(plainText);
		System.out.println(cipherText);
		
		cipherText = "VKDQQRQGHILQHGWKHTXDQWLWBRILQIRUPDWLRQSURGXFHGEBDVRXUFHIRUHADPSOHWKHTXDQWLWBLQDPHVVDJHEBDIRUPXODVLPLODUWRWKHHTXDWLRQWKDWGHILQHVWKHUPRGBQDPLFHQWURSBLQSKBVLFVLQLWVPRVWEDVLFWHUPVVKDQQRQVLQIRUPDWLRQDOHQWURSBLVWKHQXPEHURIELQDUBGLJLWVUHTXLUHGWRHQFRGHDPHVVDJHWRGDBWKDWVRXQGVOLNHDVLPSOHHYHQREYLRXVZDBWRGHILQHKRZPXFKLQIRUPDWLRQLVLQDPHVVDJHLQDWWKHYHUBGDZQRIWKHLQIRUPDWLRQDJHWKLVGLJLWLCLQJRILQIRUPDWLRQRIDQBVRUWZDVDUHYROXWLRQDUBVWHSKLVSDSHUPDBKDYHEHHQWKHILUVWWRXVHWKHZRUGELWVKRUWIRUELQDUBGLJLWDVZHOODVGHILQLQJLQIRUPDWLRQVKDQQRQDQDOBCHGWKHDELOLWBWRVHQGLQIRUPDWLRQWKURXJKDFRPPXQLFDWLRQVFKDQQHOKHIRXQGWKDWDFKDQQHOKDGDFHUWDLQPDALPXPWUDQVPLVVLRQUDWHWKDWFRXOGQRWEHHAFHHGHGWRGDBZHFDOOWKDWWKHEDQGZLGWKRIWKHFKDQQHOVKDQQRQGHPRQVWUDWHGPDWKHPDWLFDOOBWKDWHYHQLQDQRLVBFKDQQHOZLWKDORZEDQGZLGWKHVVHQWLDOOBSHUIHFWHUURUIUHHFRPPXQLFDWLRQFRXOGEHDFKLHYHGEBNHHSLQJWKHWUDQVPLVVLRQUDWHZLWKLQWKHFKDQQHOVEDQGZLGWKDQGEBXVLQJHUURUFRUUHFWLQJVFKHPHVWKHWUDQVPLVVLRQRIDGGLWLRQDOELWVWKDWZRXOGHQDEOHWKHGDWDWREHHAWUDFWHGIURPWKHQRLVHULGGHQVLJQDOWRGDBHYHUBWKLQJIURPPRGHPVWRPXVLFFGVUHOBRQHUURUFRUUHFWLRQWRIXQFWLRQDPDMRUDFFRPSOLVKPHQWRITXDQWXPLQIRUPDWLRQVFLHQWLVWVKDVEHHQWKHGHYHORSPHQWRIWHFKQLTXHVWRFRUUHFWHUURUVLQWURGXFHGLQTXDQWXPLQIRUPDWLRQDQGWRGHWHUPLQHMXVWKRZPXFKFDQEHGRQHZLWKDQRLVBTXDQWXPFRPPXQLFDWLRQVFKDQQHORUZLWKHQWDQJOHGTXDQWXPELWVTXELWVZKRVHHQWDQJOHPHQWKDVEHHQSDUWLDOOBGHJUDGHGEBQRLVH";
		
		plainText = caesarCipher.decrypt(cipherText);
		System.out.println(plainText);
                
                
                System.out.println(caesarCipher.gustavo("{{}{}}]][["));
                
                //solo faltaria los primos :
                
                    //                def primo3(n):
                    //	verificar= False
                    //	contador=0
                    //	for x in range(1,n+1):
                    //		if(n%x==0):
                    //				contador = contador +1 
                    //				#return -1
                    //		if (contador >= 3):
                    //        		verificar=True
                    //        		break #esto rompe el for!!		
                    //	if(contador==2 or  verificar==False):
                    //				
                    //				return("es primo")
                    //				#return -1
                    //	else:
                    //			return('NO es primo')	
                    //
                    //
                    //		
                    //
                    //print(primo3(17))
                    //                
                
		
	}
}
