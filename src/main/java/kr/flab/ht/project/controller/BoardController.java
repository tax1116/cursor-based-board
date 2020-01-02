package kr.flab.ht.project.controller;

import java.util.List;
import kr.flab.ht.project.model.Board;
import kr.flab.ht.project.model.BoardInsert;
import kr.flab.ht.project.model.Pagination;
import kr.flab.ht.project.service.BoardService;
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
public class BoardController {

  @Autowired
  BoardService boardService;

  @GetMapping
  public ResponseEntity<List<Board>> list(@RequestParam(required = false, defaultValue = "1") int page,
                                          @RequestParam(required = false) Integer cursor) {
    int totalList = boardService.getTotalList();
    Pagination pagination = new Pagination();
    pagination.pageInfo(page, totalList, cursor);

    return new ResponseEntity<>(boardService.list(pagination), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Board> read(@PathVariable("id") int id) {
    return new ResponseEntity<>(boardService.read(id),HttpStatus.OK);
  }

  @PostMapping
  public ResponseEntity<String> write(@RequestBody BoardInsert boardInsert) {
    boardService.write(boardInsert);
    return new ResponseEntity<> ("success",HttpStatus.CREATED);
  }

  @PutMapping("/{id}")
  public ResponseEntity<String> update(@PathVariable("id") int id, @RequestBody Board board) {
    board.setId(id);
    boardService.update(board);
    return new ResponseEntity<> ("success",HttpStatus.OK);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> delete(@PathVariable("id") int id) {
    boardService.delete(id);
    return new ResponseEntity<> ("success",HttpStatus.OK);
  }
}

