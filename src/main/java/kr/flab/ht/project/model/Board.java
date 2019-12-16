package kr.flab.ht.project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Board {
    private int id;
    private String author;
    private String title;
    private String content;

    public Board(){
    }

    public Board(int id, String author, String title, String content) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
    }
}
