package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class ChatFortune implements Command {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {

//    try {
      out.println("[운세 상담을 시작합니다!]");


//      try (Socket socket = new Socket("localhost", 8888);
//      PrintWriter chatout = new PrintWriter(socket.getOutputStream());
//      BufferedReader chatin = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
//
//        while (true) {
//          String input = Prompt.inputString("채팅 입력 > ", out, in);
//          out.println(input);
//          out.flush();
//
//          receiveResponse(out, in);
//
//
//          if (input.equalsIgnoreCase("quit"))
//            break;
//        }
//      }
//       } catch (Exception e) {
//          out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
//      }
//}
//
//
//  private static void receiveResponse(PrintWriter out, BufferedReader in) throws Exception {
//    while (true) {
//      String response = in.readLine();
//      if (response.length() == 0) {
//        break;
//      } else if (response.equals("!{}!")) {
//        // 사용자로부터 값을 입력을 받아서 서버에 보낸다.
//        out.println(Prompt.inputString(""));
//        out.flush(); // 주의! 출력하면 버퍼에 쌓인다. 서버로 보내고 싶다면 flush()를 호출하라!
//      } else {
//        System.out.println(response);
//      }
//    }
  }
}





