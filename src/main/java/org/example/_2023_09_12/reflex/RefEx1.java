package org.example._2023_09_12.reflex;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefEx1 {
    public static void main(String[] args) throws
            ClassNotFoundException,
            NoSuchFieldException,
            NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException {
//        Class securityClassObject = Security.class;
        Class<?> securityClassObject = Class.forName("org.example._2023_09_12.reflex.Security");
//
        System.out.println("**********************10**********************");
        Field field = securityClassObject.getField("id");
        System.out.println("Field: " + field);
        Field[] fields = securityClassObject.getFields();
        for (Field f : fields) {
            System.out.println("Field from array: " + f.getName() + ". Type: " + f.getType());
        }

        System.out.println("**********************19**********************");
        Field[] fieldssss = securityClassObject.getDeclaredFields();
        for (Field f : fieldssss) {
            System.out.println("Declared fields from array: " + f.getName() + ". Type: " + f.getType());
        }

        System.out.println("**********************25**********************");
        Method method = securityClassObject.getMethod("salaryUp");
        System.out.println("Method: " + method.getName() + ". Return type: " + method.getReturnType());

        System.out.println("**********************29**********************");
        Method method1 = securityClassObject.getMethod("setSalary", double.class);
        System.out.println("Method: " + method1.getName() + ". Return type: " + method1.getReturnType());

        System.out.println("**********************35**********************");
        Method[] methods = securityClassObject.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Declared fields from array: " + m.getName() + ". Type: " + m.getReturnType());
        }

//        System.out.println("**********************39**********************");
//        Constructor<?> constructor = securityClassObject.getConstructor(int.class, String.class, String.class);
//        System.out.println("Constructor parameter count: " + constructor.getParameterCount());
//        System.out.println("Constructor parameter type: " + Arrays.toString(constructor.getParameterTypes()));

//        System.out.println("**********************46**********************");
//        Constructor<Security> securityConstructor = (Constructor<Security>) securityClassObject.getConstructor();
//        Security obj = securityConstructor.newInstance();
//        System.out.println(obj);

//        System.out.println("**********************58**********************");
//        Constructor<?> constructor1 = securityClassObject.getConstructor(int.class, String.class, String.class);
//        Object object = constructor1.newInstance(1, "Nik", "ENTERPRISE");
//        System.out.println(object);
//
//        System.out.println("**********************63**********************");
//        Method method2 = securityClassObject.getMethod("setSalary", double.class);
//        method2.invoke(object, 9999);
//        System.out.println(object);

        System.out.println("**********************68**********************");
        Security security = new Security(22, "Mik", "CxO");
        Class<? extends Security> securityClass = security.getClass();
        Field field1 = securityClass.getDeclaredField("salary");
        field1.setAccessible(true);

        double salaryValue = (double) field1.get(security);
        System.out.println("Salary value: " + salaryValue);

        field1.set(security, 1111);
        System.out.println("Salary after increasing: " + security);
    }
}