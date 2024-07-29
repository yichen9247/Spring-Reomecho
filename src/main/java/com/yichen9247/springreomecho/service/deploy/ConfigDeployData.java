package com.yichen9247.springreomecho.service.deploy;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Getter @Component @RestController
public class ConfigDeployData {

    private String method;
    private Boolean speedInsights;

    @Value("${deploy.method}")
    public void setMethod(String method) {this.method = method;}

    @Value("${deploy.speedInsights}")
    public void setSpeedInsights(Boolean speedInsights) {this.speedInsights = speedInsights;}
}
