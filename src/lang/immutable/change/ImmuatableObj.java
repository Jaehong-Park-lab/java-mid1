package lang.immutable.change;

public class ImmuatableObj {

    private final int value;

    public ImmuatableObj(int value) {
        this.value = value;
    }

    public ImmuatableObj add(int addValue){
        int result = value + addValue;
        return new ImmuatableObj(result);
    }

    public int getValue() {
        return value;
    }
}
