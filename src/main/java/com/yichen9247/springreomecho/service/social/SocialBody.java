package com.yichen9247.springreomecho.service.social;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter @Getter @Component
public class SocialBody {
    private String link;
    private Boolean show;
}