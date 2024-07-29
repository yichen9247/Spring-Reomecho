package com.yichen9247.springreomecho.service.header;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter @Getter @Component
public class NavigationBody {
    private String name;
    private String link;
    private String target;
    private String iconFill;
    private String featherIcon;
}