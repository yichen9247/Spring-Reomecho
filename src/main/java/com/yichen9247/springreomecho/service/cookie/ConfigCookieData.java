package com.yichen9247.springreomecho.service.cookie;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Getter @Component @RestController
public class ConfigCookieData {

    private Boolean cookie_notice;
    private String cookie_mb_message;
    private String cookie_pc_message;
    private String confirmButtonText;

    @Value("${cookie.cookie_notice}")
    public void setCookie_notice(Boolean cookie_notice) {this.cookie_notice = cookie_notice;}

    @Value("${cookie.confirmButtonText}")
    public void setConfirmButtonText(String confirmButtonText) {this.confirmButtonText = confirmButtonText;}

    @Value("${cookie.cookie_mb_message}")
    public void setCookie_mb_message(String cookie_mb_message) {this.cookie_mb_message = cookie_mb_message;}

    @Value("${cookie.cookie_pc_message}")
    public void setCookie_pc_message(String cookie_pc_message) {this.cookie_pc_message = cookie_pc_message;}
}
