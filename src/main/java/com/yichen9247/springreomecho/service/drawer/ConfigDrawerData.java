package com.yichen9247.springreomecho.service.drawer;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Component @RestController
public class ConfigDrawerData {

    @Getter
    private Boolean drawer_show;
    @Getter
    private String drawer_image;
    @Getter
    private Boolean drawer_footer;
    @Getter
    private Boolean drawer_social;
    @Getter
    private Boolean drawer_search;
    @Getter
    private Boolean drawer_musicst;
    @Getter
    private Boolean drawer_statistics;

    @Value("${system.server_adress}")
    private String server_adress;

    @Value("${drawer.drawer_show}")
    public void setDrawer_show(Boolean drawer_show) {this.drawer_show = drawer_show;}

    @Value("${drawer.drawer_image}")
    public void setDrawer_image(String drawer_image) {
        String urlRegex = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";
        if (drawer_image.matches(urlRegex)) {
            this.drawer_image = drawer_image;
        } else this.drawer_image = server_adress + "/api" + drawer_image;
    }

    @Value("${drawer.drawer_footer}")
    public void setDrawer_footer(Boolean drawer_footer) {this.drawer_footer = drawer_footer;}

    @Value("${drawer.drawer_social}")
    public void setDrawer_social(Boolean drawer_social) {this.drawer_social = drawer_social;}

    @Value("${drawer.drawer_search}")
    public void setDrawer_search(Boolean drawer_search) {this.drawer_search = drawer_search;}

    @Value("${drawer.drawer_musicst}")
    public void setDrawer_musicst(Boolean drawerMusicst) {this.drawer_musicst = drawerMusicst;}

    @Value("${drawer.drawer_statistics}")
    public void setDrawer_statistics(Boolean drawer_statistics) {this.drawer_statistics = drawer_statistics;}
}
