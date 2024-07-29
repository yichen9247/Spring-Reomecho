package com.yichen9247.springreomecho.service.function;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter @Getter @Component
public class MusicBody {
    private String img;
    private String src;
    private String name;
    private String lyric;
}
