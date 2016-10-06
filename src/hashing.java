import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

public class hashing 
{
	public static void main(String args[])
	{
		//Integer myint=new Integer(4);
		//String mystr="2345676879787666";
		String sha1code="ca73ab65568cd125c2d27a22bbd9e863c10b675d";
		/*System.out.println("The length of the SHA-1 Code is : "+sha1code.length());
		String myhash1="";
		try {
			myhash1 = SimpleSHA1.SHA1("I");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("the hash code of the integer is "+myhash1);*/
		
		//Calendar calendar=Calendar.getInstance();
		System.out.println("DATE="+Calendar.DATE+"\n MONTH="+Calendar.MONTH+" \n YEAR="+Calendar.YEAR+"\n DAY of year="+Calendar.DAY_OF_YEAR+"\n DAy of week="+Calendar.DAY_OF_WEEK+"\n DAY of month="+Calendar.DAY_OF_MONTH);
		
	}
}


 class SimpleSHA1 { 
	 
    private static String convertToHex(byte[] data) { 
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < data.length; i++) { 
            int halfbyte = (data[i] >>> 4) & 0x0F;
            int two_halfs = 0;
            do { 
                if ((0 <= halfbyte) && (halfbyte <= 9)) 
                    buf.append((char) ('0' + halfbyte));
                else 
                    buf.append((char) ('a' + (halfbyte - 10)));
                halfbyte = data[i] & 0x0F;
            } while(two_halfs++ < 1);
        } 
        return buf.toString();
    } 
 
    public static String SHA1(String text) 
    throws NoSuchAlgorithmException, UnsupportedEncodingException  { 
    MessageDigest md;
    md = MessageDigest.getInstance("SHA-1");
    byte[] sha1hash = new byte[40];
    md.update(text.getBytes("iso-8859-1"), 0, text.length());
    sha1hash = md.digest();
    return convertToHex(sha1hash);
    } 
} 