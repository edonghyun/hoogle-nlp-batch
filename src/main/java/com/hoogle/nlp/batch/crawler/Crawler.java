package com.hoogle.nlp.batch.crawler;

import com.hoogle.nlp.batch.crawler.dto.ArticleDto;
import com.hoogle.nlp.batch.crawler.parser.Parser;
import com.hoogle.nlp.batch.crawler.parser.strategy.StrategyInterface;
import com.hoogle.nlp.batch.crawler.service.CrawlerService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class Crawler {
  private final List<StrategyInterface> strategies;
  private final CrawlerService crawlerService;
  private final Parser parser;

  public void doCrawling() {
    for(StrategyInterface strategy : strategies) {
      log.info("starts parse with {}", strategy.getClass().getSimpleName());
      parser.setStrategy(strategy);
      List<ArticleDto> articleDtoList = parser.parse();
      crawlerService.createArticles(articleDtoList);
      log.info("parsing ended");
    }
  }
}


