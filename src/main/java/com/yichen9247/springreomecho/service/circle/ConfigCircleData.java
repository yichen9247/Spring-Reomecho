package com.yichen9247.springreomecho.service.circle;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Getter @Component @RestController
public class ConfigCircleData {

    private Number eachItem;
    private String serverAdress;

    @Value("${circle.eachItem}")
    public void setEachItem(Number eachItem) {this.eachItem = eachItem;}

    @Value("${circle.serverAdress}")
    public void setServerAdress(String serverAdress) {this.serverAdress = serverAdress;}
}
