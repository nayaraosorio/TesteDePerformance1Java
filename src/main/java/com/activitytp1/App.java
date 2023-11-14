package com.activitytp1;

import com.testperformance1.package1.ClassA;
import com.testperformance1.package2.ClassB;
import com.testperformance1.package3.ClassC;
public class App 
{
    public static void main( String[] args )
    {
        ClassA classA = new ClassA();
        classA.setDataA("Hello from APP");

        classA.printDataA();

        ClassB classB = new ClassB();
        classB.useClassA();
    }
}
