package com.yichen9247.springreomecho.service.sundry;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter @Getter @Component @RestController
@ConfigurationProperties(prefix = "sundry")
public class ConfigSundryData {
    private Boolean baktop_bton;
    private Boolean click_effect;
    private Boolean moused_waves;
    private Boolean site_openrss;
    private Boolean load_topline;
    private Boolean music_cookie;
    private Boolean is_cssinsert;
    private Boolean is_javainsert;
    private Boolean dynamic_color;
    private Boolean site_mourning;
    private Boolean search_widget;
    private Boolean site_secproduc;
    private Boolean image_lazyload;
    private Boolean backtop_button;
    private Boolean dialog_draggle;
    private Boolean friends_draggle;
    private Boolean load_fullscreen;
}
