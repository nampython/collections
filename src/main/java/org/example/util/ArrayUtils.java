package org.example.util;

/**
 *
 */
public class ArrayUtils {

    /**
     *
     */
    public static void arraycopy(Object[] srcArray, int srcPos, Object[] dest, int destPos, int length) {
        System.arraycopy(srcArray, srcPos, dest, destPos, length);
    }
}
