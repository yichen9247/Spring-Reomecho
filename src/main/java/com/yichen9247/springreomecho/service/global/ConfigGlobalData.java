package com.yichen9247.springreomecho.service.global;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Component @RestController
public class ConfigGlobalData {

    @Getter
    private String site_title;
    @Getter
    private String site_icons;
    @Getter
    private String site_rssPath;
    @Getter
    private String site_address;
    @Getter
    private String site_hreflinks;
    @Getter
    private String site_loadingIcon;
    @Getter
    private String site_description;

    @Value("${system.server_adress}")
    private String server_adress;
    private final String urlRegex = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";

    @Value("${global.site_title}")
    public void setSite_title(String site_title) {this.site_title = site_title;}

    @Value("${global.site_icons}")
    public void setSite_icons(String site_icons) {
        if (site_icons.matches(urlRegex)) {
            this.site_icons = site_icons;
        } else this.site_icons = server_adress + "/api" + site_icons;
    }

    @Value("${global.site_rssPath}")
    public void setSite_rssPath(String site_rssPath) {this.site_rssPath = site_rssPath;}

    @Value("${global.site_address}")
    public void setSite_address(String site_address) {this.site_address = site_address;}

    @Value("${global.site_hreflinks}")
    public void setSite_hreflinks(String site_hreflinks) {this.site_hreflinks = site_hreflinks;}

    @Value("${global.site_loadingIcon}")
    public void setSite_loadingIcon(String site_loadingIcon) {
        if (site_loadingIcon.matches(urlRegex)) {
            this.site_loadingIcon = site_loadingIcon;
        } else this.site_loadingIcon = server_adress + "/api" + site_loadingIcon;
    }

    @Value("${global.site_description}")
    public void setSite_description(String site_description) {this.site_description = site_description;}
}