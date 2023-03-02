package com.example;

public class Person extends Object  implements Cloneable{

    protected String id;
    int[] arr = { 1,2,3};

    public Person(String id) {
        this.id = id;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person cloned = new Person(this.id);
        System.arraycopy(this.arr, 0, cloned.arr, 0, arr.length);
        return cloned;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj instanceof Person == false)
            return false;
        Person other = (Person)obj;
        return this.id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Person id=%s", this.id);
    }
}
