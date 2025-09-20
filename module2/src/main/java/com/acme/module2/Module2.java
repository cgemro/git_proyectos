package com.acme.module2;

import java.util.logging.Logger;

public class Module2 {

  private Logger logger;

public void coveredByUnitTest() {
	  logger = Logger.getLogger("This method is covered by unit test");
//    System.out.println("This method is covered by unit test3");
  }

  public void coveredByIntegrationTest() {
    System.out.println("This method is covered by integration test");
  }

  public void uncovered() {
    System.out.println("This method is not covered");
  }
}
