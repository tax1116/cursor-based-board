package kr.flab.ht.project.controller;

import java.util.List;
import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import kr.flab.ht.project.model.Pagination;
import kr.flab.ht.project.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boards")
public class
BoardController {

  private static final Logger LOGGER = LoggerFactory.getLogger(BoardController.class);

  @Autowired
  BoardService boardService;

  @GetMapping
  public ResponseEntity<List<Board>> list(@RequestParam(required = false,
          defaultValue = "1") int page) {
    int totalList = boardService.getTotalList();
    Pagination pagination = new Pagination();
    pagination.pageInfo(page, totalList);
    return new ResponseEntity<List<Board>>(boardService.list(pagination),HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Board> read(@PathVariable("id") int id) {
    return new ResponseEntity<Board>(boardService.read(id),HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity write(@RequestBody BoardInsert boardInsert) {
    boardService.write(boardInsert);
    return new ResponseEntity(HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity update(@PathVariable("id") int id, @RequestBody Board board) {
    board.setId(id);
    boardService.update(board);
    return new ResponseEntity(HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable("id") int id) {
    boardService.delete(id);
    return new ResponseEntity(HttpStatus.OK);
  }
}

