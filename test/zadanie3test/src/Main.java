import java.lang.StringBuffer;

 public class dodatek {
    public static String delete(String str, char c)
    {
        StringBuffer buffer = new StringBuffer();
        boolean first = true;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=c)
                buffer.append(str.charAt(i));
            else{
                if(first){
                    buffer.append(str.charAt(i));
                    first=false;
                }
            }
        }
        return buffer.toString();
    }
    public static void main(String[] args) throws Exception {
        String txt = "good morning";
        System.out.println(delete(txt, 'l'));
        txt = "Good morning sir";
        System.out.println(delete(txt, 'l'));
    }
}