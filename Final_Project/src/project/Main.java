package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int select;
    int flag = 0;   //控制內層迴圈
    Scanner input = new Scanner(System.in);
    
    while(true) {      
      
      System.out.println("1.構建工作時間表     2.建立職場能力檔案     3.檢索合適的工作職位     4.分析財務情況     0.離開程式");
      select = input.nextInt();    
      
      switch(select) {
        case 0:
          input.close();
          System.exit(0);          
          break;
        case 1:
           
          while(flag == 0) {
            clear();    //清空畫面
            System.out.println("構建工作時間表\n1.新增     2.編輯     3.工作表     0.回到主選單");
            select = input.nextInt();
            switch(select) {
              case 0:
                System.out.println("回到主選單");
                flag = 1;
                break;
              case 1:
                System.out.println("新增");
                break;
              case 2:
                System.out.println("編輯");
                break;
              case 3:
                System.out.println("工作表");
                break;
              default:
                System.out.println("請輸入正確的代號(0 ~ 3)");
                break;
            }            
          }
          flag = 0;
          break;
        case 2:
          clear();
          System.out.println("建立職場能力檔案");
          break;
        case 3:
          clear();
          System.out.println("檢索合適的工作職位");
          break;
        case 4:
          clear();
          System.out.println("分析財務情況");
          break;
        default:
          clear();
          System.out.println("請輸入正確的代號(0 ~ 4)");
          break;
      }      
    }    
  }
  
  public static void clear() {
    try {
      Robot r = new Robot();
      r.mousePress(InputEvent.BUTTON3_MASK);      // 按下滑鼠右鍵
      r.mouseRelease(InputEvent.BUTTON3_MASK);    // 釋放滑鼠右鍵
      r.keyPress(KeyEvent.VK_CONTROL);            // 按下Ctrl鍵
      r.keyPress(KeyEvent.VK_R);                  // 按下R鍵
      r.keyRelease(KeyEvent.VK_R);                // 釋放R鍵
      r.keyRelease(KeyEvent.VK_CONTROL);          // 釋放Ctrl鍵
      r.delay(100);       
    } catch (AWTException e){
      e.printStackTrace();
    }      
  }
}
