package com.hoogle.nlp.batch.crawler.config;

import java.util.HashMap;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@RequiredArgsConstructor
@ConfigurationProperties("crawler")
public class CrawlerConfig {
  private final HashMap<String, String> strategies;
}
