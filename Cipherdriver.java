package csit212;

import java.util.Scanner;

public class Driver {
	
	
	
	// this is mainly to Generate random keys
	
	public String getRandomString(int num)
    {
			
		//  random string
        String RandomS="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       
        
        StringBuilder sb=new StringBuilder(num);
        
        int i;
        for(i=0;i<num;i++)//loop starts till n
        {
            int position=(int)(RandomS.length()*Math.random());
            //generating a random number 
            sb.append(RandomS.charAt(position));
            //creating the random string
        }
        return sb.toString();// random string generated
    }
	
	
	
	
public static void main(String[] args) {
	
	
	 Scanner userout =new Scanner(System.in);
	 String plaintexts;
	 
	//taking a message input from the user 
     System.out.println("Enter a message in upper case : ");
     
     //input message
     plaintexts = userout.nextLine();
     
     
     
     // capatalizing to uppercase
     String plaintext = plaintexts.toUpperCase();

	
	
     
     Driver  obcreateO = new  Driver ();//object creation
     int messageLength = plaintext.length();//calculating the length of the message given by the user
     String key=obcreateO.getRandomString(messageLength);//generating the random key by passing the length of the message
  

	
	
	vigenereCipher m = new vigenereCipher();
	System.out.println("Given Plain text is \""+plaintext+"\"");
	System.out.println("Randomnly generated Key : \""+key+"\"");
	
	String ciphertext = m.vigenereCipher(plaintext, key, true);
	System.out.println("Generated Cipher Text: "+ciphertext);
	System.out.println("Plain Text: " +m.vigenereCipher(ciphertext, key, false));
	
	

}
}
