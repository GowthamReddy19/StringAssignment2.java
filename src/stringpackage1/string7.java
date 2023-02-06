package stringpackage1;
//k.sai gowtham reddy
//210303126120
//19 division
public class string7 {
    //EqualsIgnoreCaseExample{

    public static void main(String args[]){
        String s1="gowtham";
        String s2="gowtham";
        String s3="GOWTHAM";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }
}


