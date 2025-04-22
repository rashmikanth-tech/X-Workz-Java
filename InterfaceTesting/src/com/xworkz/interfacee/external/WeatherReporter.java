package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Weather;

public class WeatherReporter {
    private Weather ref;

    public WeatherReporter(Weather ref) {
        this.ref = ref;
        System.out.println("💡 WeatherReporter created with Weather dependency");
    }

    public void use() {
        ref.action();
    }
}
