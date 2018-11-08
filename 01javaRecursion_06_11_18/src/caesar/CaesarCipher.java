package caesar;

public class CaesarCipher {

    //caesar encryption algorithm
    public String encrypt(String plainText) {

        //the encrypted message
        String cipherText = "";
        //we make the algorithm case insensitive
        plainText = plainText.toUpperCase();

        //consider all the letters in the plain_text
        for (int i = 0; i < plainText.length(); ++i) {
            char character = plainText.charAt(i);
            //find the numerical representation (index) associated with that character in the alphabet
            int charIndex = Constants.ALPHABET.indexOf(character);
            //caesar encryption is just a simple shift of characters according to the key
            //use modular arithmetic to transform the values within the range [0,num_of_letters_in_alphabet]
            int encryptedIndex = Math.floorMod(charIndex + Constants.KEY, Constants.ALPHABET.length());
            //keep appending the encrypted character to the cipher_text
            cipherText = cipherText + Constants.ALPHABET.charAt(encryptedIndex);
        }

        return cipherText;
    }

    //caesar decryption algorithm: basically the same but using -KEY in this case
    public String decrypt(String cipherText) {

        //the input cipherText is already upper case
        //cipherText = cipherText.toUpperCase();
        String plainText = "";

        for (int i = 0; i < cipherText.length(); ++i) {
            char character = cipherText.charAt(i);
            int charIndex = Constants.ALPHABET.indexOf(character);
            int decryptedIndex = Math.floorMod(charIndex - Constants.KEY, Constants.ALPHABET.length());
            plainText = plainText + Constants.ALPHABET.charAt(decryptedIndex);
        }

        return plainText;
    }

    //caesar encryption algorithm
    public String gustavo(String plainText) {

        //the encrypted message
        String cipherText = "";

        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        //we make the algorithm case insensitive
        plainText = plainText.toUpperCase();

        //consider all the letters in the plain_text
        for (int i = 0; i < plainText.length(); ++i) {
            char character = plainText.charAt(i);
            //find the numerical representation (index) associated with that character in the alphabet
            if (Constants.CARACTERES1.indexOf(character) >= 0) {
                numero1++;
            }
            if (Constants.CARACTERES2.indexOf(character) >= 0) {
                numero2++;
            }
            if (Constants.CARACTERES3.indexOf(character) >= 0) {
                numero3++;
            }
            if (Constants.CARACTERES4.indexOf(character) >= 0) {
                numero4++;
            }

        }
        if ((numero1 - numero2) == 0 && (numero3 - numero4) == 0) {
            cipherText = "Es correcto";
        } else {
            cipherText = "Es Incorrecto";
        }

        return cipherText;
    }

    public String gustavo(int n) {
        boolean verificar = false;
        int contador = 0;
//    for x in range(1,n+1):
//        if(n%x==0):
//            contador = contador +1
//            print(contador , n%x) 
//                #return -1
//        if (contador >= 3):
//            verificar=True
//            break #esto rompe el for!!
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                contador++;
                System.out.println(contador + "  " + n%i);
            }
            if (contador >= 3) {
                verificar = true;
                break;
            }
        }
        if(contador==2 || verificar==false && n>1){
        return "Es primo";
        }
        else 
         {return "No es primo";}
             
       // return "error";
    }

}

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
