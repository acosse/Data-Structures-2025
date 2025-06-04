public class testEncryption{


public static void main(String[ ] args) {
RandomCipher cipher = new RandomCipher();


System.out.println(cipher.encoder_i.length);

for(int k =0; k<cipher.encoder_i.length; k++){

	System.out.print(cipher.encoder_i[k]+" ");
}
System.out.println("");
System.out.println(cipher.decoder_i.length);

for(int k =0; k<cipher.decoder_i.length; k++){

	System.out.print(cipher.decoder_i[k]+" ");
}


System.out.println("Encryption code = " +
new String(cipher.encoder));
System.out.println("Decryption code = " +
new String(cipher.decoder));
String message = "NYU IS AN AWESOME UNIVERSITY";
String coded = cipher.encrypt(message);
System.out.println("Secret: " + coded);
String answer = cipher.decrypt(coded);
System.out.println("Message: " + answer); 


}}


