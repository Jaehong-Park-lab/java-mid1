package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String exit = ".txt";

        int exitIndex = str.indexOf(exit);
        String fileName = str.substring(0, exitIndex);
        String exitName = str.substring(exitIndex);
        System.out.println("fileName = " + fileName);
        System.out.println("exitName = " + exitName);
    }
}
