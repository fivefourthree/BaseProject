package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int select;
    int flag = 0;   //����h�j��
    Scanner input = new Scanner(System.in);
    
    while(true) {      
      
      System.out.println("1.�c�ؤu�@�ɶ���     2.�إ�¾����O�ɮ�     3.�˯��X�A���u�@¾��     4.���R�]�ȱ��p     0.���}�{��");
      select = input.nextInt();    
      
      switch(select) {
        case 0:
          input.close();
          System.exit(0);          
          break;
        case 1:
           
          while(flag == 0) {
            clear();    //�M�ŵe��
            System.out.println("�c�ؤu�@�ɶ���\n1.�s�W     2.�s��     3.�u�@��     0.�^��D���");
            select = input.nextInt();
            switch(select) {
              case 0:
                System.out.println("�^��D���");
                flag = 1;
                break;
              case 1:
                System.out.println("�s�W");
                break;
              case 2:
                System.out.println("�s��");
                break;
              case 3:
                System.out.println("�u�@��");
                break;
              default:
                System.out.println("�п�J���T���N��(0 ~ 3)");
                break;
            }            
          }
          flag = 0;
          break;
        case 2:
          clear();
          System.out.println("�إ�¾����O�ɮ�");
          break;
        case 3:
          clear();
          System.out.println("�˯��X�A���u�@¾��");
          break;
        case 4:
          clear();
          System.out.println("���R�]�ȱ��p");
          break;
        default:
          clear();
          System.out.println("�п�J���T���N��(0 ~ 4)");
          break;
      }      
    }    
  }
  
  public static void clear() {
    try {
      Robot r = new Robot();
      r.mousePress(InputEvent.BUTTON3_MASK);      // ���U�ƹ��k��
      r.mouseRelease(InputEvent.BUTTON3_MASK);    // ����ƹ��k��
      r.keyPress(KeyEvent.VK_CONTROL);            // ���UCtrl��
      r.keyPress(KeyEvent.VK_R);                  // ���UR��
      r.keyRelease(KeyEvent.VK_R);                // ����R��
      r.keyRelease(KeyEvent.VK_CONTROL);          // ����Ctrl��
      r.delay(100);       
    } catch (AWTException e){
      e.printStackTrace();
    }      
  }
}
