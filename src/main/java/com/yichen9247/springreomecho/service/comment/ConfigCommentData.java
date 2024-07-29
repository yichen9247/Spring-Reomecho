package com.yichen9247.springreomecho.service.comment;

import lombok.Getter;
import lombok.Setter;
import java.util.Base64;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter @Component @RestController
@ConfigurationProperties(prefix = "comment")
public class ConfigCommentData {

    private String twikoo_envid;

    @Setter
    private Number comment_styl;
    @Setter
    private Number comment_psiz;
    @Setter
    private Number comment_maxs;
    @Setter
    private String comment_type;
    @Setter
    private String comment_lang;
    @Setter
    private String valine_appid;
    @Setter
    private String valine_appkey;
    @Setter
    private String waline_server;
    @Setter
    private String artalk_server;
    @Setter
    private Boolean comment_glba;
    @Setter
    private Boolean valine_emoje;
    @Setter
    private Boolean waline_login;
    @Setter
    private Boolean waline_reaction;
    @Setter
    private String comment_placehoter;
    public void setTwikoo_envid(String twikoo_envid) {this.twikoo_envid = Base64.getEncoder().encodeToString(twikoo_envid.getBytes());}
}
