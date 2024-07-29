package com.yichen9247.springreomecho.service.aside;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Component @RestController
@ConfigurationProperties(prefix = "aside")
public class ConfigAsideData {

    @Value("${system.server_adress}")
    private String server_adress;

    @Getter
    private String sponsor_image;

    @Setter
    @Getter
    private String gitbuttons_hrefs;

    @Setter
    @Getter
    private List<String> aside_list;

    public void setSponsor_image(String sponsor_image) {
        String urlRegex = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";
        if (sponsor_image.matches(urlRegex)) {
            this.sponsor_image = sponsor_image;
        } else this.sponsor_image = server_adress + "/api" + sponsor_image;
    }

}
