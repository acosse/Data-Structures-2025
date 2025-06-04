import java.lang.Math;
import java.util.Random;

public class RandomCipher {

protected char[ ] encoder = new char[52];
protected char[ ] decoder = new char[52];

protected int[ ] encoder_i = new int[52];
protected int[ ] decoder_i = new int[52];


/** Constructor */
public RandomCipher() {


int[] random_encoder = new int[52];

//random_encoder[0] = (int) (Math.random())*51;
Random r= new Random();
random_encoder[0] = r.nextInt(52); 


int position = 0;

boolean already_taken;

for(int kk=1; kk<51; kk++){

	already_taken = true;

	while(already_taken==true){

	position = r.nextInt(52);

	already_taken = false;
	for(int ll=0; ll<kk; ll++){

		if (position == random_encoder[ll]){

			already_taken = true;

		}
			

	}}
	random_encoder[kk] = position;

	}


encoder_i = random_encoder;

int[] random_decoder = new int[52];

for(int m=0; m<51; m++){

	random_decoder[random_encoder[m]] = m;

}

decoder_i = random_decoder;


for(int ll=0; ll<51; ll++){

	if(random_encoder[ll]<26){
	encoder[ll] = (char) ('A'+random_encoder[ll]);
	}
	else{
	encoder[ll] = (char) ('a'+random_encoder[ll]-26);}

	if(random_decoder[ll]<26){
	decoder[ll] = (char) ('A'+random_decoder[ll]);
	}
	else{
	decoder[ll] = (char) ('a'+random_decoder[ll]-26);}

}



// A is stored as 0, a is stored as 26


}

public String encrypt(String message) {
return transform(message, encoder);
}
public String decrypt(String secret) {
return transform(secret, decoder);
}
private String transform(String original, char[ ] code) {
char[ ] msg = original.toCharArray( );
for (int k=0; k < msg.length; k++)
if (Character.isUpperCase(msg[k])) {
int j = msg[k] - 'A'; // get the shift
msg[k] = code[j]; // obtain character in code
} else if(Character.isLowerCase(msg[k])){
int jj = msg[k] - 'a'; // get the shift
msg[k] = code[26+jj]; // 

}
return new String(msg);}
}





