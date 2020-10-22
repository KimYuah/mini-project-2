package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.util.Prompt;

public class MoneyCommand implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("\n[ 운세 보기 ]");
      out.println("원하시는 운세 정보의 번호를 입력하세요.");
      out.println(" 1. 성격운");
      out.println(" 2. 취업운");
      out.println(" 3. 학업운");
      out.println(" 4. 금전운");
      out.println(" 5. 연애운");
      String input = Prompt.inputString("입력> ", out, in);

      switch (input) {
        case "1": out.println("\n [ 성격운  ]");
        	break;
        case "2": 
        	out.println("\n [ 취업운  ]");
        	out.println("1 ~ 5번까지의 숫자중에 원하는 숫자 하나를 골라주세요:)");
        	out.println("     1번    2번   3번   4번   5번 ");
        	String choice = Prompt.inputString("입력> ", out, in);
        	
        	
        	break;
        case "3": out.println("\n 3번의 학업운 "); out.println("길가다가 돈 주울 수 있을지도...?!! 금전운 60%"); break;
        case "4": out.println("\n 4번의 금전운 "); out.println("당장 로또를 사러가세요! 금전운 100%"); break;
        case "5": out.println("\n 5번의 애정운 "); out.println("나쁘지않아요!! 금전운 70%"); break;
        default:
          out.println("잘못된 번호를 입력하셨습니다..");
          out.flush();
          return;

      }
      out.println();

    } catch(Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}
