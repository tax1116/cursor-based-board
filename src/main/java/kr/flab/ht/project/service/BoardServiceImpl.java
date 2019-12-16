package kr.flab.ht.project.service;

import kr.flab.ht.project.mapper.BoardMapper;
import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import kr.flab.ht.project.model.Pagination;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Resource
    BoardMapper boardMapper;

    @Override
    public Board read(int id) {
        return boardMapper.read(id);
    }

    @Override
    public List<Board> list(Pagination pagination) {
        return boardMapper.list(pagination);
    }

    @Override
    public int getTotalList() {
        return boardMapper.getTotalList();
    }

    @Override
    public void write(BoardInsert boardInsert) {
        boardMapper.write(boardInsert);
    }

    @Override
    public void update(Board board) {
        boardMapper.update(board);
    }

    @Override
    public void delete(int id) {
        boardMapper.delete(id);
    }
}
