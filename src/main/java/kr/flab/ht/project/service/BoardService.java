package kr.flab.ht.project.service;

import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface BoardService {

    Board read(int id);
    List<Board> list();
    void write(BoardInsert boardInsert);
    void update(Board board);
    void delete(int id);
}
