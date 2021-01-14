package com.example.atm.cmd;

import com.example.atm.CommandRouter;
import com.example.atm.CommandRouterFactory;
import com.example.atm.DaggerCommandRouterFactory;
import java.util.Scanner;

class CommandLineAtm {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      CommandRouterFactory commandRouterFactory = DaggerCommandRouterFactory.create();
      CommandRouter commandRouter = commandRouterFactory.router();

      while (scanner.hasNextLine()) {
        commandRouter.route(scanner.nextLine());
      }
    }
  }
}
