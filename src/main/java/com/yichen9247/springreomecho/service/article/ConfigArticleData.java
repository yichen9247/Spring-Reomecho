package com.yichen9247.springreomecho.service.article;

import lombok.Getter;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

@Getter @Component @RestController
public class ConfigArticleData {

    private Boolean post_copynoti;
    private Boolean post_printbtn;
    private Boolean post_sharebtn;
    private Boolean post_copyright;
    private Boolean post_staticspa;
    private Boolean post_graphsbtn;
    private Boolean code_highlight;
    private Boolean post_watermark;

    private String watermark_text;
    private String copy_noticeText;

    @Value("${article.watermark_text}")
    public void setWatermark_text(String watermark_text) {this.watermark_text = watermark_text;}

    @Value("${article.post_copynoti}")
    public void setPost_copynoti(Boolean post_copynoti) {this.post_copynoti = post_copynoti;}

    @Value("${article.post_printbtn}")
    public void setPost_printbtn(Boolean post_printbtn) {this.post_printbtn = post_printbtn;}

    @Value("${article.post_sharebtn}")
    public void setPost_sharebtn(Boolean post_sharebtn) {this.post_sharebtn = post_sharebtn;}

    @Value("${article.post_copyright}")
    public void setPost_copyright(Boolean post_copyright) {this.post_copyright = post_copyright;}

    @Value("${article.post_staticspa}")
    public void setPost_staticspa(Boolean post_staticspa) {this.post_staticspa = post_staticspa;}

    @Value("${article.post_graphsbtn}")
    public void setPost_graphsbtn(Boolean post_graphsbtn) {this.post_graphsbtn = post_graphsbtn;}

    @Value("${article.code_highlight}")
    public void setCode_highlight(Boolean code_highlight) {this.code_highlight = code_highlight;}

    @Value("${article.post_watermark}")
    public void setPost_watermark(Boolean post_watermark) {this.post_watermark = post_watermark;}

    @Value("${article.copy_noticeText}")
    public void setCopy_noticeText(String copy_noticeText) {this.copy_noticeText = copy_noticeText;}
}
