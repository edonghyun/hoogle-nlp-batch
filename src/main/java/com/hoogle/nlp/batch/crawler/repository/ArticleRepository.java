package com.hoogle.nlp.batch.crawler.repository;

import com.hoogle.nlp.batch.crawler.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

}
