package org.example;

import org.example.util.ArrayListCustom;
import org.example.util.ArrayUtils;
import org.example.util.ListCustom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<String> list = new ArrayList<>();
        ListCustom<String> lst = new ArrayListCustom<>();
        lst.add("nam");
        lst.add("Quang");
        lst.remove(0);
        System.out.println(lst.toString());

    }
}
