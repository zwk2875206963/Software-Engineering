package lianxi;
import lianxi.Person;
public class Class {
    private int num;
    private Person sir;
    public Class(int num, Person sir) {
        super();
        this.num = num;
        this.sir = sir;
    }
    
    public Class() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Person getSir() {
        return sir;
    }

    public void setSir(Person sir) {
        this.sir = sir;
    }
}
