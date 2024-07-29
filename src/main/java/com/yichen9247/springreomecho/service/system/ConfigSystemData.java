package com.yichen9247.springreomecho.service.system;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter @Getter @Component @RestController
@ConfigurationProperties(prefix = "system")
public class ConfigSystemData {
    private AdminBody admin;
    private String server_adress;
}
