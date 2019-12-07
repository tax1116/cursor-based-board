package kr.flab.ht.project.mapper;

import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardMapper {
    Board read(int id);
    List<Board> list();
    void write(BoardInsert boardInsert);
    void update(Board board);
    void delete(int id);
}
