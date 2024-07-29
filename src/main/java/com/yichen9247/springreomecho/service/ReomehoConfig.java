package com.yichen9247.springreomecho.service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController @CrossOrigin(origins = "*")
public class ReomehoConfig {
    private final ConfigService configService;

    public ReomehoConfig(ConfigService configService) {
        this.configService = configService;
    }

    @ResponseBody @RequestMapping("/config/getAll")
    public ConfigService getConfigService() {return configService;}
}
