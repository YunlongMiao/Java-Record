package demo;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/*
* List类的例子（三种类型EXCLUSIVE MULTIPLE IMPLICIT）
*/
public class ListExample  extends MIDlet implements CommandListener
{
 private Command exitCommand;
 private Command backCommand;
 private List mainList;
 private List exclusiveList;
 private List multipleList;
 private List implicitList;
 private Display display;

 public ListExample()
 {
  display = Display.getDisplay(this);
  exitCommand = new Command("退出", Command.EXIT, 1);
  backCommand = new Command("后退", Command.BACK, 1);
  String[] strArray1 = {
   "EXCLUSIVE",
   "MULTIPLE",
   "IMPLICIT"
  };
  String[] strArray2 = {
   "www.google.com",
   "www.sina.com.cn",
   "www.pku.edu.cn"
  };
        /*
  * 创建不同类型的List对象
  */
  
  mainList = new List("选择类型", Choice.IMPLICIT, strArray1, null);
  mainList.addCommand(exitCommand);
  mainList.setCommandListener(this);

  exclusiveList = new List("EXCLUSIVE", Choice.EXCLUSIVE ,strArray2, null);
  exclusiveList.addCommand(exitCommand);
  exclusiveList.addCommand(backCommand);
  exclusiveList.setCommandListener(this);

  multipleList = new List("MULTIPLE", Choice.MULTIPLE ,strArray2, null);
  multipleList.addCommand(exitCommand);
  multipleList.addCommand(backCommand);
  multipleList.setCommandListener(this);

  implicitList = new List("IMPLICIT", Choice.IMPLICIT, strArray2, null);
  implicitList.addCommand(exitCommand);
  implicitList.addCommand(backCommand);
  implicitList.setCommandListener(this);
 }

 public void startApp()
 {
  display.setCurrent(mainList);
 }

 public void pauseApp()
 {
 }

 public void destroyApp(boolean condition)
 {

 }

 public void commandAction(Command command , Displayable displayable)
 {
  /*因为mainList与implicitList都是同类型的（IMPLICIT）所以只做mainList的SELECT_COMMAND的处理*/
  if(displayable.equals(mainList))
  {
   if(command == List.SELECT_COMMAND)
   {
    switch(((List)displayable).getSelectedIndex())
    {
     case 0:
      display.setCurrent(exclusiveList);
      break;
     case 1:
      display.setCurrent(multipleList);
      break;
     case 2:
      display.setCurrent(implicitList);
      break;
    }
   }
  }
  else
  {
   if( command == backCommand)
   {
    display.setCurrent(mainList);
   }
  }

  if( command == exitCommand)
  {
   destroyApp(false);
   notifyDestroyed();
  }
 }

}

