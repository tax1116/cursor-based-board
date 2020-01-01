package kr.flab.ht.project.mapper;

import java.util.List;
import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import kr.flab.ht.project.model.Pagination;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

  Board read(int id);

  List<Board> list(Pagination pagination);

  List<Board> getFirstList(Pagination pagination);

  int getTotalList();

  void write(BoardInsert boardInsert);

  void update(Board board);

  void delete(int id);
}
