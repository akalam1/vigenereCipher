package csit212;

public class vigenereCipher {
	
	
	
	private String keyExpanding(String plainT, String key) {
		String result = "";
		int i=0;
		
		while (i<plainT.length()) {
			result += String.valueOf(key.charAt(i% key.length()));
			i++;
		}
		return result;
		
	}
	
	
	
	
    public String vigenereCipher(String plaintext,final String key, boolean isEncode)
    {   
        String result="";// empty string
        String keyE = keyExpanding(plaintext, key);
        	
       
        for (int i=0;i<plaintext.length();i++)//loop runs till the length 
        { 
            //conversion 
          int   x =(plaintext.charAt(i)+ (isEncode? keyE.charAt(i) : -keyE.charAt(i)+26))%26; 
            
          result += (char)(x +65);
        } 
        return result; 
    }

}
