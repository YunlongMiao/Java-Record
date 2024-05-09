package demo;
import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
/*
* List������ӣ���������EXCLUSIVE MULTIPLE IMPLICIT��
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
  exitCommand = new Command("�˳�", Command.EXIT, 1);
  backCommand = new Command("����", Command.BACK, 1);
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
  * ������ͬ���͵�List����
  */
  
  mainList = new List("ѡ������", Choice.IMPLICIT, strArray1, null);
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
  /*��ΪmainList��implicitList����ͬ���͵ģ�IMPLICIT������ֻ��mainList��SELECT_COMMAND�Ĵ���*/
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

