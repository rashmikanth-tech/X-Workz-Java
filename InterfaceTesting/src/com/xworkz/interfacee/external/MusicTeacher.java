package com.xworkz.interfacee.external;

import com.xworkz.interfacee.internal.Music;

public class MusicTeacher {
    private Music ref;

    public MusicTeacher(Music ref) {
        this.ref = ref;
        System.out.println("💡 MusicTeacher created with Music dependency");
    }

    public void use() {
        ref.action();
    }
}
