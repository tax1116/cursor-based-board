package kr.flab.ht.project.controller;

import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import kr.flab.ht.project.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/board")
public class BoardController {
    private static final Logger LOGGER = LoggerFactory.getLogger(BoardController.class);

    @Autowired
    BoardService boardService;

    @GetMapping("/list")
    public List<Board> list(){
        return boardService.list();
    }

    @GetMapping("/list/{id}")
    public Board read(@PathVariable("id") int id) {
        return boardService.read(id);
    }

    @PostMapping("/edit")
    public String write(@RequestBody BoardInsert boardInsert) {
        boardService.write(boardInsert);
        return "write success";
    }

    @PutMapping("/edit/{id}")
    public String update(@PathVariable("id") int id, @RequestBody Board board) {
        board.setId(id);
        boardService.update(board);
        return "update success";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        boardService.delete(id);
        return "delete success";
    }
}

