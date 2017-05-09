package com.task4.nested;

/**
 * Created by Vitalii on 01.05.2017.
 */
public class Outer {
    public static class Static {
        void testInStaticClass(){

        }
    }
    public class Nested{
        void testInNestedClass(){

        }
    }
    public void demo(){
        class DemoLocal{
            void testLocal(){

            }
        }
        Runnable anonymousClass = new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread t = new Thread(new Runnable(){
            public void run(){

            }
        });
    }
}
