package com.yichen9247.springreomecho.service.function;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Setter @Getter @Component
public class AdvertisementBody {
    private String href;
    private String title;
    private String image;
    private String height;
    private String target;
}
