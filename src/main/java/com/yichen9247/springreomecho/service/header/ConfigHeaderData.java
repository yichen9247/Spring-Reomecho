package com.yichen9247.springreomecho.service.header;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter @Getter @Component @RestController
@ConfigurationProperties(prefix = "header")
public class ConfigHeaderData {
    private Boolean music_widget;
    private Boolean users_widget;
    private Boolean rando_widget;
    private Boolean theme_widget;
    private Boolean resize_widget;
    private Boolean search_widget;
    private Boolean header_widget;
    private Boolean header_setting;
    private List<NavigationBody> header_navlist;
}
