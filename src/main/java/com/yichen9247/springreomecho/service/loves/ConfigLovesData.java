package com.yichen9247.springreomecho.service.loves;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Getter @Component @RestController
public class ConfigLovesData {

    private String star_date;
    private String left_avatar;
    private String righ_avatar;

    @Value("${lovevs.star_date}")
    public void setStar_date(String star_date) {this.star_date = star_date;}

    @Value("${lovevs.left_avatar}")
    public void setLeft_avatar(String left_avatar) {this.left_avatar = left_avatar;}

    @Value("${lovevs.righ_avatar}")
    public void setRigh_avatar(String righ_avatar) {this.righ_avatar = righ_avatar;}
}
