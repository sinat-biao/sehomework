package com.softwareMethodology.jiangbiao;

import org.junit.Test;
import static java.lang.String.valueOf;

/**
 * @author: MF1933041_江彪
 * @className: String_valueOf_double
 * @apiSignature: java.lang.String$ public static String valueOf(double d)
 * @description: Test java api java.lang.String$valueOf(double d)
 * @Map: String$init(_ c: Character)
 */
public class String_valueOf_double {

    /**
     * input: 1
     * class0 class0=123
     * output: 1
     * ret0  ret0="123"
     */
    @Test
    public void valueOf0() {
        System.out.println("----------------------------------------");
        Double class0 = new Double(123);
        System.out.println(class0 + " -> " + class0.getClass().toString());
        String string = valueOf(class0);
        System.out.println(string + " -> " + getClass().toString());
        // print:
        // ----------------------------------------
        // 123.0 -> class java.lang.Double
        // 123.0 -> class com.softwareMethodology.jiangbiao.String_valueOf_double
    }

    /**
     * input: 1
     * class0 class0=-0.2514
     * output: 1
     * ret0  ret0="-0.2514"
     */
    @Test
    public void valueOf1() {
        System.out.println("----------------------------------------");
        Double class0 = new Double(-0.2514);
        System.out.println(class0 + " -> " + class0.getClass().toString());
        String string = valueOf(class0);
        System.out.println(string + " -> " + getClass().toString());
        // print:
        // ----------------------------------------
        // -0.2514 -> class java.lang.Double
        // -0.2514 -> class com.softwareMethodology.jiangbiao.String_valueOf_double
    }
}
