package com.examples;

import com.examples.StacksAndQueues.StoneWall;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class StoneWallTest {
  private StoneWall solution;
 
  @BeforeTest
  public void setUp() {
    solution = new StoneWall();
  }

  @DataProvider(name = "test1")
  public Object [][] createData1() {
    return new Object [][] {
      new Object [] { new int [] { 8, 8, 5, 7, 9, 8, 7, 4, 8 }, 7 },
      new Object [] { new int [] { 8, 8, 5, 7, 9, 8, 7, 5, 8 }, 6 },
      new Object [] { new int [] { 1, 2, 3, 4, 3 }, 4 },
      new Object [] { new int [] { 8, 8, 5 }, 2 },
      new Object [] { new int [] { 8, }, 1 },
      new Object [] { new int [] { 8, 8 }, 1 },
      new Object [] { new int [] { 8, 8, 8, 8, 8 }, 1 },
      new Object [] { new int [] { 1000000000 }, 1 },
      new Object [] { new int [] { 1000000000, 2 }, 2 },
      new Object [] { new int [] { 2, 1000000000, 2 }, 2 },
      new Object [] { new int [] { 2, 1000000000, 2, 1000000000 }, 3 },
      new Object [] { new int [] { 2, 1000000000, 2, 1000000000, 1000000000 }, 3 },
    };
  }

  @Test(dataProvider = "test1")
  public void verifySolution(int[] pA, int pExpected) {  
    Assert.assertEquals(solution.solution(pA), pExpected);
  }
}