package com.eomcs.pms.handler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import com.eomcs.util.Prompt;

public class ChatFortune  implements Command  {

  @Override
  public void execute(PrintWriter out, BufferedReader in) {
    try (Socket socket = new Socket("localhost", 8888);
        PrintWriter out2 = new PrintWriter(socket.getOutputStream());
        BufferedReader in2 = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      while (true) {

        out.println("[ 1:1 운세 상담을 시작합니다.]");
        out.println("질문을 입력해주세요!\n ");
        String input2 = Prompt.inputString("> ");
        out.println(input2);
        out.flush();

        String response2 = in.readLine();
        System.out.println(response2);

        if (input2.equalsIgnoreCase("quit"))
          break;
        return;
      }

    } catch (Exception e) {
      out.printf("작업 처리 중 오류 발생! - %s\n", e.getMessage());
    }
  }
}
