package kr.flab.ht.project.mapper;

import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public class BoardMapperMySQL implements BoardMapper{

    private SqlSessionTemplate sqlSessionTemplate;

    @Autowired
    public void setSqlMapClient(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public Board read(int id) {
        return sqlSessionTemplate.selectOne("read");
    }

    @Override
    public List<Board> list() {
        return sqlSessionTemplate.selectList("list");
    }

    @Override
    public void write(BoardInsert boardInsert) {
        sqlSessionTemplate.insert("write",boardInsert);
    }

    @Override
    public void update(Board board) {
        sqlSessionTemplate.update("update", board);
    }

    @Override
    public void delete(int id) {
        sqlSessionTemplate.delete("delete", id);
    }
}
