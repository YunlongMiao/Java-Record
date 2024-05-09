package demo;

import java.io.IOException;

import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
import javax.microedition.lcdui.*;

public class ChoiceGroupMIDlet extends MIDlet implements ItemStateListener{
	 private Display display;  //(ctrl+shift+O)������Ҫ�İ�
	 private Form myform;
	 //��������ChoiceGroup
	 private ChoiceGroup myExclusiveChoiceGroup;
	 private ChoiceGroup myMultipleChoiceGroup;
	 private ChoiceGroup mypopChoiceGroup;
	 //ͨ��StringItem��ѡ�е���Ϣ��ʾ����
	 private StringItem myChoice;
	 private Image img=null;
	  //���췽��
	 public ChoiceGroupMIDlet() {
	  //��ʼ��
	  display=Display.getDisplay(this);
	  myChoice=new StringItem("��ѡ��������ǣ�",null);
	  myform=new Form("ChoiceGropʵ������");
	  try {
	   img=Image.createImage("/test.png");
	  } catch (IOException e) {
	   img=null;
	  }
	  //����2�������Ĺ��췽������ChoiceGroup���������ǵ�ѡ��ť
	  myExclusiveChoiceGroup=new ChoiceGroup("ѡ���Ա�",Choice.EXCLUSIVE);
	  myExclusiveChoiceGroup.append("����", img);
	  myExclusiveChoiceGroup.append("Ů��", img);
	  //����4�������Ĺ��췽������ChoiceGroup���������Ƕ�ѡ��ť
	  String [] schoolType={
	    "����",
	    "ƻ��",
	    "�㽶",
	    "����"
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
	  myMultipleChoiceGroup=new ChoiceGroup("���Ե�ˮ��",Choice.MULTIPLE,schoolType,imageElements);
	  
	  //����2�������Ĺ��췽������ChoiceGroup���������ǵ���ʽ
	  mypopChoiceGroup=new ChoiceGroup("��ѡ��ϲ���ı������",Choice.POPUP);
	  mypopChoiceGroup.append("Java", null);
	  mypopChoiceGroup.append("C����", null);
	  
	  //��Item������ӵ�form�н�����ʾ
	  myform.append(myExclusiveChoiceGroup);
	  myform.append(myMultipleChoiceGroup);
	  myform.append(mypopChoiceGroup);
	  myform.append(myChoice);
	  //ע�����
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
	  //��������ǲ��ԣ���Ӧ�ĸ���ChoiceGroup���ı�ʱ��������ʾͨ��StringItem��ʾ����
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
	  
	  //�������ʵ�ֵĹ��ܣ��������仯ʱ��������ѡ����Ϣ��ʾ��myform��mychoice��
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

