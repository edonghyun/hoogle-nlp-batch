package com.hoogle.nlp.batch.crawler.parser;

import com.hoogle.nlp.batch.crawler.dto.ArticleDto;
import com.hoogle.nlp.batch.crawler.parser.strategy.StrategyInterface;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Parser {
  private StrategyInterface strategy;
  public List<ArticleDto> parse() {
    return null;
  }
}
