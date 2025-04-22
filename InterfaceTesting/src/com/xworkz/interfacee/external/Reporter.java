package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.News;

public class Reporter {
    private News ref;

    public Reporter(News ref) {
        this.ref = ref;
        System.out.println("💡 Reporter created with News dependency");
    }

    public void use() {
        ref.action();
    }
}
