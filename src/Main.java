import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringList listString = new StringService();
        System.out.println(listString.add("123"));
        System.out.println(listString.add("456"));
        System.out.println(listString.add("abc"));
        System.out.println(listString.add("def"));
        System.out.println(listString.add(2,"018"));
        System.out.println(listString.set(1,"ccc"));
        System.out.println(listString.remove("def"));
        System.out.println(listString.remove(0));
        System.out.println(listString.contains("018"));
        System.out.println(listString.indexOf("ccc"));
        System.out.println(listString.lastIndexOf("abc"));
        System.out.println(listString.toString());
        System.out.println(listString.get(2));

        StringList otherListString=new StringService();
        otherListString.add("123");
        otherListString.add("456");
        otherListString.add("018");

        System.out.println(listString.equals(otherListString));
        System.out.println(otherListString.size());
        System.out.println(otherListString.isEmpty());
        System.out.println(otherListString.toString());
        otherListString.clear();
        System.out.println(otherListString.isEmpty());
        System.out.println(otherListString);
        System.out.println(Arrays.toString(listString.toArray()));

    }
}