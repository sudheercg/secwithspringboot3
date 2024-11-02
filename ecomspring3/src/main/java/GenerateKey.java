import java.security.SecureRandom;
import java.util.Base64;

public class GenerateKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom random = new SecureRandom();
		byte[] keyBytes = new byte[32];//256 bits or 32 bytes is a common choice for HMAC-SHA256
		random.nextBytes(keyBytes);
		
		String secretKey = Base64.getEncoder().encodeToString(keyBytes);
		System.out.println("Generated SECRET_KEY: "+secretKey);
		
		

	}

}
