package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;
import com.eomcs.util.Prompt;

public class MoneyCommand implements Command {
	String input;
	String choice;
	
  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try {
      out.println("\n[ 운세 보기 ]");
      out.println("원하시는 운세 정보의 번호를 입력해주세요.");
      out.println(" 1. 성격운");
      out.println(" 2. 취업운");
      out.println(" 3. 학업운");
      out.println(" 4. 금전운");
      out.println(" 5. 애정운");
      input = Prompt.inputString("입력> ", out, in);

   
      switch (input) {
        case "1": 
        	out.println("\n [ 성격운  ]");;
        	out.println("1 ~ 5번까지의 숫자중에 원하는 숫자 하나를 골라주세요:)");
        	out.println("     1번    2번   3번   4번   5번 ");
        	choice = Prompt.inputString("입력> ", out, in);
        	TellFortune.characterFortune(choice);
        	break;
        case "2": 
        	out.println("\n [ 취업운  ]");
        	out.println("1 ~ 5번까지의 숫자중에 원하는 숫자 하나를 골라주세요:)");
        	out.println("     1번    2번   3번   4번   5번 ");
        	choice = Prompt.inputString("입력> ", out, in);
        	TellFortune.employmentFortune(choice);
        	break;
        case "3":
        	out.println("\n [ 학업운  ]");
        	out.println("1 ~ 5번까지의 숫자중에 원하는 숫자 하나를 골라주세요:)");
        	out.println("     1번    2번   3번   4번   5번 ");
        	choice = Prompt.inputString("입력> ", out, in);
        	TellFortune.studyFortune(choice);
        	break;
        case "4": 
        	out.println("\n [ 금전운  ]");
        	out.println("1 ~ 5번까지의 숫자중에 원하는 숫자 하나를 골라주세요:)");
        	out.println("     1번    2번   3번   4번   5번 ");
        	choice = Prompt.inputString("입력> ", out, in);
        	TellFortune.moneyFortune(choice);
        	break;
        case "5": 
        	out.println("\n [ 애정운  ]");
        	out.println("1 ~ 5번까지의 숫자중에 원하는 숫자 하나를 골라주세요:)");
        	out.println("     1번    2번   3번   4번   5번 ");
        	choice = Prompt.inputString("입력> ", out, in);
        	TellFortune.loveFortune(choice);
        	break;
        default:
          out.println("잘못된 번호를 입력하셨습니다..");
          return;
      }
      
      connectChat();
      out.println();
      out.flush();

    } catch(Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
  
  
  private void connectChat() {
	  
	  out.println("자세한 상담을 원하시면 전문가를 연결해드립니다:)");
	  String anwser = Prompt.inputString("상담사와 채팅을 연결하겠습니까?(y/N", out, in);
	  if (anwser.equalsIgnoreCase("y")) {
		  out.println("상담사와 연결 중입니다.");
		  out.println("잠시만 기다려 주세요!");
	  } else {
		  out.println("상담사와의 연결을 취소하셨습니다.");
		  break;
	  }
  }
}
