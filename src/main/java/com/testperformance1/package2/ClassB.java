package com.testperformance1.package2;

import com.testperformance1.package1.ClassA;
import com.testperformance1.package3.ClassC;
public class ClassB {
    public void useClassA() {
        ClassA classA = new ClassA();
        classA.setDataA("Hello from ClassB");
        classA.printDataA();
    }
}
