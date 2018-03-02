package cu.datys.patterns.gof.behavioral.chainofresponsibility.atm;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Alex on 08/02/2018.
 */
public class ATM {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String p = ATM.class.getPackage().getName();
        Bill successor = null, current = null;
        for(int e : new int[]{1, 5, 10, 20, 50}){
            Class bill = Class.forName(p + ".Bill" + e);
            current = (Bill) bill.getConstructor(int.class).newInstance(100);
            current.setSuccessor(successor);
            successor = current;
        }
        System.out.println(current);
        System.out.println(current.canDoOperation(1000));
    }
}
