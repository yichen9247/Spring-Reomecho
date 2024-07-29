package com.yichen9247.springreomecho.service.footer;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Getter @Component @RestController
public class ConfigFooterData {

    private String footer_link;
    private String footer_copyright;

    @Value("${footer.footer_link}")
    public void setFooter_link(String footer_link) {this.footer_link = footer_link;}

    @Value("${footer.footer_copyright}")
    public void setFooter_copyright(String footer_copyright) {this.footer_copyright = footer_copyright;}
}
