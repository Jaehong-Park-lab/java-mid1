package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        //split()
        String[] splitsStr = str.split(",");
        for (String s : splitsStr){
            System.out.println(s);
        }

        String joinStr = "";
        for (int i = 0; i < splitsStr.length; i++){
            String string = splitsStr[i];
            joinStr += string;
            if(i  != splitsStr.length-1){
                joinStr += "-";
            }

        }

        System.out.println("joinStr = " + joinStr);

        String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinStr);

        String result = String.join("-", splitsStr);
        System.out.println("result = " + result);
    }
}
