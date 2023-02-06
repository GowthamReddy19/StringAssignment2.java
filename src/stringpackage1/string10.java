package stringpackage1;
//k.sai gowtham reddy
//210303126120
//19 division
public class string10 {
    //StringGetCharsExample
        public static void main(String args[]){
            String str = new String("hello javatpoint how r u");
            char[] ch = new char[10];
            try{
                str.getChars(6, 16, ch, 0);
                System.out.println(ch);
            }catch(Exception ex){System.out.println(ex);}
        }
}


