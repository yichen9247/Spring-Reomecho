package com.yichen9247.springreomecho.service.styles;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Component @RestController
public class ConfigStylesData {

    @Getter
    private Number msgStyle;
    @Getter
    private Number darkTheme;
    @Getter
    private Number fontStyle;
    @Getter
    private Number imgsandbox;
    @Getter
    private String transition;
    @Getter
    private String dominColor;
    @Getter
    private String buttoColor;
    @Getter
    private String background;
    @Getter
    private String qrcodeColor;
    @Getter
    private String lazyloadImg;
    @Getter
    private String lazyloadErr;
    @Getter
    private String notfoundImg;
    @Getter
    private String dottedColor1;
    @Getter
    private String dottedColor2;

    @Value("${system.server_adress}")
    private String server_adress;
    private final String urlRegex = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";

    @Value("${styles.msgs_style}")
    public void setMsgStyle(Number msgStyle) {this.msgStyle = msgStyle;}

    @Value("${styles.darkTheme}")
    public void setDarkTheme(Number darkTheme) {this.darkTheme = darkTheme;}

    @Value("${styles.font_style}")
    public void setFontStyle(Number fontStyle) {this.fontStyle = fontStyle;}

    @Value("${styles.imgsandbox}")
    public void setImgsandbox(Number imgsandbox) {this.imgsandbox = imgsandbox;}

    @Value("${styles.transition}")
    public void setTransition(String transition) {this.transition = transition;}

    @Value("${styles.background}")
    public void setBackground(String background) {
        if (background.matches(urlRegex)) {
            this.background = background;
        } else this.background = server_adress + "/api" + background;
    }

    @Value("${styles.domin_color}")
    public void setDominColor(String dominColor) {this.dominColor = dominColor;}

    @Value("${styles.butto_color}")
    public void setButtoColor(String buttoColor) {this.buttoColor = buttoColor;}

    @Value("${styles.qrcode_color}")
    public void setQrcodeColor(String qrcodeColor) {this.qrcodeColor = qrcodeColor;}

    @Value("${styles.lazyloadImg}")
    public void setLazyloadImg(String lazyloadImg) {
        if (lazyloadImg.matches(urlRegex)) {
            this.lazyloadImg = lazyloadImg;
        } else this.lazyloadImg = server_adress + "/api" + lazyloadImg;
    }

    @Value("${styles.lazyloadErr}")
    public void setLazyloadErr(String lazyloadErr) {
        if (lazyloadErr.matches(urlRegex)) {
            this.lazyloadErr = lazyloadErr;
        } else this.lazyloadErr = server_adress + "/api" + lazyloadErr;
    }

    @Value("${styles.notfoundImg}")
    public void setNotfoundImg(String notfoundImg) {
        if (notfoundImg.matches(urlRegex)) {
            this.notfoundImg = notfoundImg;
        } else this.notfoundImg = server_adress + "/api" + notfoundImg;
    }

    @Value("${styles.dotted_color1}")
    public void setDottedColor1(String dottedColor1) {this.dottedColor1 = dottedColor1;}

    @Value("${styles.dotted_color2}")
    public void setDottedColor2(String dottedColor2) {this.dottedColor2 = dottedColor2;}
}
