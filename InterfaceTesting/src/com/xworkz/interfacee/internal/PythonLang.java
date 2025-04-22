package com.xworkz.interfacee.internal;

//.Language;

public class PythonLang implements Language {
    public PythonLang() {
        System.out.println("✅ PythonLang object created");
    }

    @Override
    public void action() {
        System.out.println("PythonLang is performing its Language action.");
    }
}
