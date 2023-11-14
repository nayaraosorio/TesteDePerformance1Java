package com.testperformance1.package3;

import com.testperformance1.package1.ClassA;
import com.testperformance1.package2.ClassB;
public class ClassC{
    public void useClasses(){
        ClassA classA = new ClassA();
        classA.setDataA("Hello from ClassicC");
        classA.printDataA();

        ClassB classB = new ClassB();
        classB.useClassA();
    }
}