package com.yichen9247.springreomecho.service.index;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter @Component @RestController
@ConfigurationProperties(prefix = "index")
public class ConfigIndexData {

    private Boolean hitokoto;
    private Number post_eachNum;

    @Setter
    private List<String> index_hitokoto;

    @Value("${index.hitokoto}")
    public void setHitokoto(Boolean hitokoto) {this.hitokoto = hitokoto;}

    @Value("${index.post_eachNum}")
    public void setPost_eachNum(Number post_eachNum) {this.post_eachNum = post_eachNum;}
}
