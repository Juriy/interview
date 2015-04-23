package com.juriy.interview.stack;

public class Stack {

    private Object data[];
    private int pos;

    public Stack(int size) {
       data = new Object[size];
       pos = 0;
    }

    public void push(Object obj) {
        if (pos == data.length) {
            Object[] newData = new Object[data.length * 2];

            for (int i=0; i < data.length; i++) {
                newData[i] = data[i];
            }

            data = newData;
        }

        data[pos++] = obj;
    }

    public Object pop() {
        return data[--pos];
    }

    public int getMaxPos() {
        return this.data.length;
    }
}