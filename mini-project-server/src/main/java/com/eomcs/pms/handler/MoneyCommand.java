package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.util.Prompt;

public class MoneyCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("\n[금전운]");

      String input = Prompt.inputString("1 ~ 5번까지 끌리는 번호를 골라주세요!(예: 1) ", out, in);

      switch (input) {
        case "1": out.println("\n[1번의 금전운]\n지갑 잘 챙기세요! 금전운 50%"); break;
        case "2": out.println("\n[2번의 금전운]\n우와!! 부러워요... 저 백원만 주세요!! 금전운 80%"); break;
        case "3": out.println("\n[3번의 금전운]\n길가다가 돈 주울 수 있을지도...?!! 금전운 60%"); break;
        case "4": out.println("\n[4번의 금전운]\n당장 로또를 사러가세요! 금전운 100%"); break;
        case "5": out.println("\n[5번의 금전운]\n나쁘지않아요!! 금전운 70%"); break;
        default:
          out.println("잘못된 번호를 입력하셨습니다..");
          return;

      }
      out.println();

    } catch(Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}
