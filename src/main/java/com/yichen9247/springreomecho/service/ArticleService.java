package com.yichen9247.springreomecho.service;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Base64;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

@RestController @CrossOrigin(origins = "*")
public class ArticleService {
    @GetMapping("/article")
    public String getArticleData(@RequestParam("post") String post) {
        Resource resource = new ClassPathResource("docs/" + post + "/README.md");
        try (InputStream inputStream = resource.getInputStream(); BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            StringBuilder contentBuilder = new StringBuilder();
            String currentLine;
            while ((currentLine = reader.readLine()) != null) contentBuilder.append(currentLine).append("\n");
            return Base64.getEncoder().encodeToString(contentBuilder.toString().getBytes());
        } catch (IOException e) {
            return "server 404：An error occurred while reading the file";
        }
    }
}
