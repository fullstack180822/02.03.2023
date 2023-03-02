package com.example;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Object o = new Object();
        System.out.println(o.getClass());
        Person p1 = new Person("1");
        System.out.println(p1.getClass());
        Person p2 = new Person("1");
        //p1 = null;

        int x_prim = 12;
        Integer x = 12;
        Integer y = 12;
        System.out.println(x == y);
        System.out.format("x == y? %s x.hashcode %s y. hashcode %s \n",
                x == y, String.valueOf(x.hashCode()), y.hashCode());
        Float f1 = 4.0f;
        System.out.println(f1.hashCode());

        System.out.println(x.hashCode());

        System.out.printf("'hello' %s \n", ("hello".hashCode()));
        System.out.printf("'hello' %s \n", ("hello".hashCode()));
        System.out.printf("11 %s \n", ("11".hashCode()));
        System.out.printf("12 %s \n", ("12".hashCode()));

        System.out.printf("p1 == p2 ? %b \n", p1 == p2);
        System.out.printf("p1 equals p2 ? %b \n", p1.equals(p2));
        System.out.printf("p1 equals o ? %b \n", p1.equals(o));
        System.out.printf("p1 hash-code %s \n", String.valueOf(p1.hashCode()));
        System.out.printf("p2 hash-code %s \n", String.valueOf(p2.hashCode()));
        System.out.printf("p1 is %s \n", p1);
        System.out.printf("p2 is %s \n", p2);
        Person cloned_p1 = p1.clone();
        System.out.printf("cloned_p1 is %s \n", cloned_p1);
    }
}
