package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2026,3,10);
        ImmutableMyDate date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date1);

        System.out.println("2026 -> date1");
//        date1.setYear(2025);
//        date2 = new ImmutableMyDate(2026,3,10)
        date1 = date1.withYear(2025);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date1);


    }
}
