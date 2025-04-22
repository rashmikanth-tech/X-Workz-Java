package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Shape;

public class DrawingTool {
    private Shape ref;

    public DrawingTool(Shape ref) {
        this.ref = ref;
        System.out.println("💡 DrawingTool created with Shape dependency");
    }

    public void use() {
        ref.action();
    }
}
