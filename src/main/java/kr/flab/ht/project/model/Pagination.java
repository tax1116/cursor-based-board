package kr.flab.ht.project.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagination {

  private int totalList;
  private int totalPage;
  private int page;
  private int listSize = 10;
  private int rangeSize = 10;
  private int startPage;
  private int endPage;
  private int startList;
  private boolean prev;
  private boolean next;

  public void pageInfo(int page, int totalList) {

    this.page = page;
    this.totalList = totalList;
    this.totalPage = (int) Math.ceil((double) totalList / listSize);
    this.startPage = ((page - 1) / rangeSize) * rangeSize + 1;
    this.endPage = startPage + rangeSize - 1;

    if (endPage > totalPage) {
      endPage = totalPage;
    }

    this.startList = (page - 1) * listSize;
    this.prev = startPage != 1;
    this.next = endPage != totalPage;
  }
}
