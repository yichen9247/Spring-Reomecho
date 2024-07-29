package com.yichen9247.springreomecho.service.function;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter @Getter @Component @RestController
@ConfigurationProperties(prefix = "function")
public class ConfigFunctionData {
    private List<MusicBody> musics;
    private List<FriendBody> friends;
    private List<AdvertisementBody> advertisement;
}
