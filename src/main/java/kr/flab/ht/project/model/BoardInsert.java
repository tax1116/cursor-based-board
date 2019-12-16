package kr.flab.ht.project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardInsert {

    private String author;
    private String title;
    private String content;

    public BoardInsert(){

    }

    public BoardInsert(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

}
