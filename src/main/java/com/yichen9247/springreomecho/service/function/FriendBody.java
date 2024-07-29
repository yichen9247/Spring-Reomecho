package com.yichen9247.springreomecho.service.function;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter @Getter @Component
public class FriendBody {
    private String name;
    private String desc;
    private String href;
    private String image;
    private String target;
}
