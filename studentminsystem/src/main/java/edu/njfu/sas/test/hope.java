package edu.njfu.sas.test;
import edu.njfu.sas.test.CR;
public class hope {
    private String hope;
    public hope(String hope) {
        this.hope = hope;
    }

    public void diaoyong(){
        CR had=new CR(hope);
        had.test();
    }

}
