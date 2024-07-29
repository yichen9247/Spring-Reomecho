package com.yichen9247.springreomecho.service.author;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Component @RestController
public class ConfigAuthorData {

    @Getter
    private String author_name;
    @Getter
    private String author_link;
    @Getter
    private String author_desc;
    @Getter
    private String author_mail;
    @Getter
    private String author_avatar;
    @Getter
    private String author_github;
    @Getter
    private String author_background;

    @Value("${system.server_adress}")
    private String server_adress;
    private final String urlRegex = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$";

    @Value("${author.author_name}")
    public void setAuthor_name(String author_name) {this.author_name = author_name;}

    @Value("${author.author_link}")
    public void setAuthor_link(String author_link) {this.author_link = author_link;}

    @Value("${author.author_desc}")
    public void setAuthor_desc(String author_desc) {this.author_desc = author_desc;}

    @Value("${author.author_mail}")
    public void setAuthor_mail(String author_mail) {this.author_mail = author_mail;}

    @Value("${author.author_avatar}")
    public void setAuthor_avatar(String author_avatar) {
        if (author_avatar.matches(urlRegex)) {
            this.author_avatar = author_avatar;
        } else this.author_avatar = server_adress + "/api" + author_avatar;
    }

    @Value("${author.author_github}")
    public void setAuthor_github(String author_github) {this.author_github = author_github;}

    @Value("${author.author_background}")
    public void setAuthor_background(String author_background) {
        if (author_background.matches(urlRegex)) {
            this.author_background = author_background;
        } else this.author_background = server_adress + "/api" + author_background;
    }
}
