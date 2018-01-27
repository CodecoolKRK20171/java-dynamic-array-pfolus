package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

// put your code here!
public class DynamicIntArray {
    int size;
    int[] members;


    public DynamicIntArray() {
        this.members = new int[5];
        size = 0;
    }

    public DynamicIntArray(int initialSize) {
        this.members = new int[initialSize];
        this.size = 0;
    }

    public void add(int number) {

        ensureSize();
        this.members[size++] = number;

    }

    public void ensureSize() {

        int newSize = this.size;
        newSize++;

        if(newSize > this.members.length) {
            members = Arrays.copyOf(members, newSize);
        }
    }

    private void verifyIndex(int index) {
        if (index >= size || index < 0)
            throw new ArrayIndexOutOfBoundsException("provided index out of range");
    }

    public void remove(int index) {
        verifyIndex(index);

        for (int i = index; i < this.size -1 ; i++) {
            this.members[i] = this.members[i + 1];
        }
        this.size--;
        this.members = Arrays.copyOf(this.members, this.members.length-1);
    }

    @Override
    public String toString() {

        String result = "";
        for (int member : this.members) {
            result += " ";
            result += member;
        }
        return result;

    }



}
