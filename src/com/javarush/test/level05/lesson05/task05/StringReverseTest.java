package com.javarush.test.level05.lesson05.task05;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ReflectPermission;
import java.security.AccessController;

/**
 * This application demonstrates how to modify java.lang.String object
 * through reflection API.
 *
 * @version 1.0
 * @author Eugene Matyushkin
 */
public class StringReverseTest {

    /**
     * final static string that should be modified.
     */
    public static final String testString = "abcde";
    static{
        if(System.getSecurityManager()==null)
            System.setSecurityManager(new SecurityManager());
    }

    public static void main(String[] args) {

        try {
            System.out.println("Initial static final string:  " + testString);
            Field[] fields = testString.getClass().getDeclaredFields();
            Field value = null;
            for (int i=0; i<fields.length; i++) {
                Field field = fields[i];
                if (field.getType().equals(char[].class)) {
                    value = field;
                    break;
                }
            }
            if (value == null) {
                System.err.println("value wasn't found!");
                return;
            }
            value.setAccessible(true);  // 1.
            char[] charValue = (char[])value.get(testString);
            for (int i=0; i<charValue.length/2; i++ ) {
                char tmp=charValue[i];
                charValue[i] = charValue[charValue.length-1-i];
                charValue[charValue.length-1-i] = tmp;
            }
            value.set(testString, charValue);
            System.out.print("Reversed static final string: ");
            System.out.println(testString);
        } catch (Throwable th) {
            System.err.println("Exception: "+th);
            th.printStackTrace();
        }

        System.out.println(canAccessPrivateMethods());
    }

    static boolean canAccessPrivateMethods() {
        try {
            SecurityManager securityManager = System.getSecurityManager();
            if (null != securityManager) {
                securityManager.checkPermission(new ReflectPermission("suppressAccessChecks"));
            }
        } catch (SecurityException e) {
            return false;
        }
        return true;
    }
}