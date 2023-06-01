package io.github.sianabeeblebrox.boundless.meta;

import com.google.gson.reflect.TypeToken;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public final class Hacks {
    private static final Unsafe UNSAFE;
    static {
        Unsafe temp = null;
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            temp = (Unsafe) field.get(null);
        } catch(Exception never) {

        }
        UNSAFE = temp;
    }

    public static final void throwUnchecked(Throwable throwable) {
        UNSAFE.throwException(throwable);
    }
}
