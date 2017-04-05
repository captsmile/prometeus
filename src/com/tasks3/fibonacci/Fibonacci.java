package com.tasks3.fibonacci;

public class Fibonacci
{
    //Повертає число Фібоначчі за номером, нумерація почнеться з одиниці
    //якщо число не можливо вирахувати поверніть -1
    public long getNumber(int position){
        if (position <= 0) return -1;
        if (position == 1) return 1;
        if (position == 2) return 1;

        return getNumber(position-1)+getNumber(position-2);
    }

}