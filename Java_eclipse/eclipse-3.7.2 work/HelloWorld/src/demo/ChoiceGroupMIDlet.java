package demo;

import java.io.IOException;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.lcdui.*;

public class ChoiceGroupMIDlet extends MIDlet implements ItemStateListener{
	 private Display display;  //(ctrl+shift+O)导入需要的包
	 private Form myform;
	 //声名三个ChoiceGroup
	 private ChoiceGroup myExclusiveChoiceGroup;
	 private ChoiceGroup myMultipleChoiceGroup;
	 private ChoiceGroup mypopChoiceGroup;
	 //通过StringItem将选中的信息显示出来
	 private StringItem myChoice;
	 private Image img=null;
	  //构造方法
	 public ChoiceGroupMIDlet() {
	  //初始化
	  display=Display.getDisplay(this);
	  myChoice=new StringItem("你选择的内容是：",null);
	  myform=new Form("ChoiceGrop实例测试");
	  try {
	   img=Image.createImage("/test.png");
	  } catch (IOException e) {
	   img=null;
	  }
	  //采用2个参数的构造方法创建ChoiceGroup对象，类型是单选按钮
	  myExclusiveChoiceGroup=new ChoiceGroup("选择性别",Choice.EXCLUSIVE);
	  myExclusiveChoiceGroup.append("男性", img);
	  myExclusiveChoiceGroup.append("女性", img);
	  //采用4个参数的构造方法创建ChoiceGroup对象，类型是多选按钮
	  String [] schoolType={
	    "西瓜",
	    "苹果",
	    "香蕉",
	    "菠萝"
	  };
	  Image[] imageElements=new Image[4];
	  try {
	   imageElements[0]=Image.createImage("/school1.png");
	   imageElements[1]=Image.createImage("/school2.png");
	   imageElements[2]=Image.createImage("/school3.png");
	   imageElements[3]=Image.createImage("/school4.png");
	  } catch (IOException e) {
	   imageElements[0]=null;
	   imageElements[1]=null;
	   imageElements[2]=null;
	   imageElements[3]=null;
	  }
	  myMultipleChoiceGroup=new ChoiceGroup("爱吃的水果",Choice.MULTIPLE,schoolType,imageElements);
	  
	  //采用2个参数的构造方法创建ChoiceGroup对象，类型是弹出式
	  mypopChoiceGroup=new ChoiceGroup("请选择喜欢的编程语言",Choice.POPUP);
	  mypopChoiceGroup.append("Java", null);
	  mypopChoiceGroup.append("C语言", null);
	  
	  //将Item对象添加的form中进行显示
	  myform.append(myExclusiveChoiceGroup);
	  myform.append(myMultipleChoiceGroup);
	  myform.append(mypopChoiceGroup);
	  myform.append(myChoice);
	  //注册监听
	  myform.setItemStateListener(this);
	 }
	 protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
	 }
	 protected void pauseApp() {
	 }
	 protected void startApp() throws MIDletStateChangeException {
	  display.setCurrent(myform);
	 }
	 public void itemStateChanged(Item item) {
	  //下面代码是测试，对应的各个ChoiceGroup被改变时，将其显示通过StringItem显示出来
	   /*if(item==myExclusiveChoiceGroup){
	   int index=myExclusiveChoiceGroup.getSelectedIndex();
	   myChoice.setText("/n"+myExclusiveChoiceGroup.getString(index)+"/n");
	  }
	  if(item==myMultipleChoiceGroup){
	   String tmp="/n";
	   for(int i=0;i<myMultipleChoiceGroup.size();i++){
	    boolean index=myMultipleChoiceGroup.isSelected(i);
	    if(index){
	     tmp=tmp+myMultipleChoiceGroup.getString(i)+"/n";
	    }
	   }
	   myChoice.setText(tmp);
	  }
	  if(item==mypopChoiceGroup){
	   int index=mypopChoiceGroup.getSelectedIndex();
	   myChoice.setText("/n"+mypopChoiceGroup.getString(index)+"/n");
	  }*/
	  
	  //下面代码实现的功能：当发生变化时，将所有选择信息显示在myform的mychoice中
	  myChoice.setText("/n");
	  int index=myExclusiveChoiceGroup.getSelectedIndex();
	  myChoice.setText(myChoice.getText()+myExclusiveChoiceGroup.getString(index)+"/n");
	  String tmp="";
	  for(int i=0;i<myMultipleChoiceGroup.size();i++){
	   boolean index1=myMultipleChoiceGroup.isSelected(i);
	   if(index1){
	    tmp=tmp+myMultipleChoiceGroup.getString(i)+"/n";
	   }
	  }
	  myChoice.setText(myChoice.getText()+tmp);
	  int index2=mypopChoiceGroup.getSelectedIndex();
	  myChoice.setText(myChoice.getText()+mypopChoiceGroup.getString(index2)+"/n");
	 }
	}

