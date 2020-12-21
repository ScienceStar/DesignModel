package inter.impl;

import inter.ICaculate;

public class CaculateImpl<T> implements ICaculate<T> {
    @Override
    public T getResult(T a, T b) {
        Object result = null;
        if (a instanceof Integer && b instanceof Integer) {
            result = ((Integer) a).intValue()+((Integer) b).intValue();
        } else if (a instanceof String && b instanceof String) {
            result = a.toString().concat(" "+b.toString());
        }
        return (T) result;
    }
}
