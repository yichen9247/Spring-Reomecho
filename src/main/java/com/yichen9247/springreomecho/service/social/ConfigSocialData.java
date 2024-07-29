package com.yichen9247.springreomecho.service.social;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Setter @Getter @Component @RestController
@ConfigurationProperties(prefix = "social")
public class ConfigSocialData {
    private SocialBody tcqq;
    private SocialBody tcwx;
    private SocialBody huab;
    private SocialBody ding;
    private SocialBody qqmu;
    private SocialBody bili;
}
