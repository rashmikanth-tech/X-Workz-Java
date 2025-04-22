package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Browser;

public class WebTester {
    private Browser ref;

    public WebTester(Browser ref) {
        this.ref = ref;
        System.out.println("💡 WebTester created with Browser dependency");
    }

    public void use() {
        ref.action();
    }
}
