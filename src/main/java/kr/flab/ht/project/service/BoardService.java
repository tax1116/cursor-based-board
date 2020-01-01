package kr.flab.ht.project.service;

import java.util.List;
import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import kr.flab.ht.project.model.Pagination;

public interface BoardService {

  Board read(int id);

  List<Board> list(Pagination pagination);

  List<Board> getFirstList(Pagination pagination);

  int getTotalList();

  void write(BoardInsert boardInsert);

  void update(Board board);

  void delete(int id);
}
