package com.yichen9247.springreomecho.service;

import com.yichen9247.springreomecho.service.index.ConfigIndexData;
import com.yichen9247.springreomecho.service.aside.ConfigAsideData;
import com.yichen9247.springreomecho.service.loves.ConfigLovesData;
import com.yichen9247.springreomecho.service.sundry.ConfigSundryData;
import com.yichen9247.springreomecho.service.system.ConfigSystemData;
import com.yichen9247.springreomecho.service.drawer.ConfigDrawerData;
import com.yichen9247.springreomecho.service.statis.ConfigStatisData;
import com.yichen9247.springreomecho.service.social.ConfigSocialData;
import com.yichen9247.springreomecho.service.header.ConfigHeaderData;
import com.yichen9247.springreomecho.service.author.ConfigAuthorData;
import com.yichen9247.springreomecho.service.footer.ConfigFooterData;
import com.yichen9247.springreomecho.service.global.ConfigGlobalData;
import com.yichen9247.springreomecho.service.circle.ConfigCircleData;
import com.yichen9247.springreomecho.service.cookie.ConfigCookieData;
import com.yichen9247.springreomecho.service.deploy.ConfigDeployData;
import com.yichen9247.springreomecho.service.styles.ConfigStylesData;
import com.yichen9247.springreomecho.service.article.ConfigArticleData;
import com.yichen9247.springreomecho.service.comment.ConfigCommentData;
import com.yichen9247.springreomecho.service.function.ConfigFunctionData;

import java.util.Map;
import java.io.IOException;

import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;

@RestController @CrossOrigin(origins = "*")
public class ConfigService {

    private final ConfigIndexData configIndexData;
    private final ConfigAsideData configAsideData;
    private final ConfigLovesData configLovesData;
    private final ConfigGlobalData configGlobalData;
    private final ConfigStylesData configStylesData;
    private final ConfigCookieData configCookieData;
    private final ConfigDeployData configDeployData;
    private final ConfigFooterData configFooterData;
    private final ConfigAuthorData configAuthorData;
    private final ConfigHeaderData configHeaderData;
    private final ConfigSocialData configSocialData;
    private final ConfigDrawerData configDrawerData;
    private final ConfigStatisData configStatisData;
    private final ConfigCircleData configCircleData;
    private final ConfigSystemData configSystemData;
    private final ConfigSundryData configSundryData;
    private final ConfigArticleData configArticleData;
    private final ConfigCommentData configCommentData;
    private final ConfigFunctionData configFunctionData;

    @Autowired
    public ConfigService(
            ConfigIndexData configIndexData,
            ConfigAsideData configAsideData,
            ConfigLovesData configLovesData,
            ConfigGlobalData configGlobalData,
            ConfigStylesData configStylesData,
            ConfigCookieData configCookieData,
            ConfigDeployData configDeployData,
            ConfigAuthorData configAuthorData,
            ConfigFooterData configFooterData,
            ConfigHeaderData configHeaderData,
            ConfigSocialData configSocialData,
            ConfigDrawerData configDrawerData,
            ConfigStatisData configStatisData,
            ConfigCircleData configCircleData,
            ConfigSundryData configSundryData,
            ConfigSystemData configSystemData,
            ConfigArticleData configArticleData,
            ConfigCommentData configCommentData,
            ConfigFunctionData configFunctionData
    ) {
        this.configIndexData = configIndexData;
        this.configAsideData = configAsideData;
        this.configLovesData = configLovesData;
        this.configGlobalData = configGlobalData;
        this.configStylesData = configStylesData;
        this.configCookieData = configCookieData;
        this.configDeployData = configDeployData;
        this.configAuthorData = configAuthorData;
        this.configFooterData = configFooterData;
        this.configHeaderData = configHeaderData;
        this.configSocialData = configSocialData;
        this.configDrawerData = configDrawerData;
        this.configStatisData = configStatisData;
        this.configCircleData = configCircleData;
        this.configSystemData = configSystemData;
        this.configSundryData = configSundryData;
        this.configArticleData = configArticleData;
        this.configCommentData = configCommentData;
        this.configFunctionData = configFunctionData;
    }

    @ResponseBody @RequestMapping("/config/getIndex")
    public ConfigIndexData getConfigIndexData() {return configIndexData;}

    @ResponseBody @RequestMapping("/config/getAside")
    public ConfigAsideData getConfigAsideData() {return configAsideData;}

    @ResponseBody @RequestMapping("/config/getLoves")
    public ConfigLovesData getConfigLovesData() {return configLovesData;}

    @ResponseBody
    @RequestMapping("/config/getGlobal")
    public ConfigGlobalData getConfigGlobalData() {return configGlobalData;}

    @ResponseBody @RequestMapping("/config/getStyles")
    public ConfigStylesData getConfigStylesData() {return configStylesData;}

    @ResponseBody @RequestMapping("/config/getCookie")
    public ConfigCookieData getConfigCookieData() {return configCookieData;}

    @ResponseBody @RequestMapping("/config/getDeploy")
    public ConfigDeployData getConfigDeployData() {return configDeployData;}

    @ResponseBody @RequestMapping("/config/getAuthor")
    public ConfigAuthorData getConfigAuthorData() {return configAuthorData;}

    @ResponseBody @RequestMapping("/config/getHeader")
    public ConfigHeaderData getConfigHeaderData() {return configHeaderData;}

    @ResponseBody @RequestMapping("/config/getFooter")
    public ConfigFooterData getConfigFooterData() {return configFooterData;}

    @ResponseBody @RequestMapping("/config/getSocial")
    public ConfigSocialData getConfigSocialData() {return configSocialData;}

    @ResponseBody @RequestMapping("/config/getDrawer")
    public ConfigDrawerData getConfigDrawerData() {return configDrawerData;}

    @ResponseBody @RequestMapping("/config/getStatis")
    public ConfigStatisData getConfigStatisData() {return configStatisData;}

    @ResponseBody @RequestMapping("/config/getArticle")
    public ConfigArticleData getConfigArticleData() {return configArticleData;}

    @ResponseBody @RequestMapping("/config/getSundry")
    public ConfigSundryData getConfigSundryData() {return configSundryData;}

    @ResponseBody @RequestMapping("/config/getCircle")
    public ConfigCircleData getConfigCircleData() {return configCircleData;}

    @ResponseBody @RequestMapping("/config/getSystem")
    public ConfigSystemData getConfigSystemData() {return configSystemData;}

    @ResponseBody @RequestMapping("/config/getComment")
    public ConfigCommentData getConfigCommentData() {return configCommentData;}

    @ResponseBody @RequestMapping("/config/getFunction")
    public ConfigFunctionData getConfigFunctionData() {return configFunctionData;}

    @Value("classpath:config/application.json")
    private Resource applicationResource;

    private final ObjectMapper objectMapper = new ObjectMapper();

    @ResponseBody @RequestMapping(value = "/config/application", method = RequestMethod.GET)
    public Map getApplication() {
        try {
            String content = new String(applicationResource.getInputStream().readAllBytes());
            Map<String, Object> root = objectMapper.readValue(content, new TypeReference<Map<String, Object>>(){});
            return root;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Map.of();
    }
}
