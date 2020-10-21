package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import com.eomcs.pms.domain.Fortune;

public class FortuneCommand implements Command  {

  List<Fortune> fortuneList;

  public FortuneCommand(List<Fortune> list) {
    this.fortuneList = list;
  }


  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    out.println("[운세 목록]");

    // 전체 목록을 조회할 때 `Iterator` 객체를 사용한다.
    // 만약 목록의 일부만 조회하면다면 인덱스를 직접 다루는 이전 방식을 사용해야 한다.
    Iterator<Fortune> iterator = fortuneList.iterator();

    while (iterator.hasNext()) {
      Fortune fortune = iterator.next();
      out.printf("%d, %s, %s, %s, %d\n",
          fortune.getNo(),
          fortune.getTitle(),
          fortune.getWriter(),
          fortune.getRegisteredDate(),
          fortune.getViewCount());
    }
  }

}
