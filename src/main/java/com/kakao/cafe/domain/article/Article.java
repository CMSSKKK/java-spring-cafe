package com.kakao.cafe.domain.article;


import java.time.LocalDateTime;
import java.util.Objects;

public class Article {

    private Integer id;
    private final String writer;
    private final String title;
    private final String contents;
    private final LocalDateTime writtenTime;

    private Article(Integer id, String writer, String title, String contents, LocalDateTime writtenTime) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.contents = contents;
        this.writtenTime = writtenTime;
    }

    public static Article newInstance(Integer id, String writer, String title, String contents) {
        return new Article(id, writer, title, contents, LocalDateTime.now());
    }

    public  static Article of(Integer id, String writer, String title, String contents, LocalDateTime writtenTime){
        return new Article(id, writer, title, contents, writtenTime);
    }


    public boolean hasId() {
        return this.id != null;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public LocalDateTime getWrittenTime() {
        return writtenTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return this.id.equals(article.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
