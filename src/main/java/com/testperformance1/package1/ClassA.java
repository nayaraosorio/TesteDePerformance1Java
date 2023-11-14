package com.testperformance1.package1;

import lombok.Data;

@Data
public class ClassA {
    private String dataA;

    public void printDataA(){
        System.out.println("Data from ClassA: " + dataA);
    }
}
