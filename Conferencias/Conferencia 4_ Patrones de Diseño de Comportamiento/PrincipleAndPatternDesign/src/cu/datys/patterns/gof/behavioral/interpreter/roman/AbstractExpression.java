package cu.datys.patterns.gof.behavioral.interpreter.roman;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * Created by alexander.escalona on 26/10/2017.
 */
public abstract class AbstractExpression {
    public void interpret(Context context) {
        if(context.getRoman().length() == 0)
            return;
        String[] keys = new String[]{"nine", "four", "five"};
        int[] values = new int[]{9, 4, 5};
        boolean flag = false;
        for(int i = 0, length = keys.length; i < length && !flag; i++){
            try {
                Method m = getClass().getDeclaredMethod(keys[i]);
                String pattern = (String) m.invoke(this);
                if(flag = context.getRoman().startsWith(pattern)){
                    context.setValue(context.getValue() + values[i] * multiplier());
                    context.setRoman(context.getRoman().substring(pattern.length()));
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        while (context.getRoman().startsWith(one())){
            context.setValue(context.getValue() + multiplier());
            context.setRoman(context.getRoman().substring(1));
        }
    }

    public abstract String one();
    public abstract String four();
    public abstract String five();
    public abstract String nine();
    public abstract int multiplier();
}
