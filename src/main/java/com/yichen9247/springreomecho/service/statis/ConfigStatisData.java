package com.yichen9247.springreomecho.service.statis;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Getter @Component @RestController
public class ConfigStatisData {

    private Boolean statics_pv;
    private Boolean statics_uv;
    private Boolean statics_links;
    private Boolean statics_posts;

    @Value("${statis.statics_pv}")
    public void setStatics_pv(Boolean statics_pv) {this.statics_pv = statics_pv;}

    @Value("${statis.statics_uv}")
    public void setStatics_uv(Boolean statics_uv) {this.statics_uv = statics_uv;}

    @Value("${statis.statics_links}")
    public void setStatics_links(Boolean statics_links) {this.statics_links = statics_links;}

    @Value("${drawer.drawer_statistics}")
    public void setStatics_posts(Boolean statics_posts) {this.statics_posts = statics_posts;}
}
