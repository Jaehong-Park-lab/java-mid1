package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmuatableObj obj1 = new ImmuatableObj(10);
        ImmuatableObj add = obj1.add(20);

        //계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue() );
        System.out.println("add = " + add.getValue() );
    }
}
