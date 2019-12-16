package kr.flab.ht.project.service;

import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import kr.flab.ht.project.model.Pagination;

import java.util.List;


public interface BoardService {

    Board read(int id);
    List<Board> list(Pagination pagination);
    int getTotalList();
    void write(BoardInsert boardInsert);
    void update(Board board);
    void delete(int id);
}
