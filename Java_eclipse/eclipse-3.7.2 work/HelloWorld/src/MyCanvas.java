import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
/*
*
* @author ��21-2������
*/
public class MyCanvas extends Canvas {
	public MyCanvas() {
		
	}
	
	protected void paint(Graphics g) {
		//�������
		   clearBackground(g);
		   //��ʾ�ɹ���ͼ������Ĵ�С
		    g.drawString("��ȣ�",10,10,Graphics.LEFT|Graphics.TOP);
		    g.drawString(String.valueOf(getWidth()),50,10,Graphics.LEFT|Graphics.TOP);
		    g.drawString("�߶ȣ�",10,25,Graphics.LEFT|Graphics.TOP);
		    g.drawString(String.valueOf(getHeight()),50,25,Graphics.LEFT|Graphics.TOP);
	}
	public void clearBackground(Graphics g){
		int color = g.getColor();
		   g.setColor(0xffffff);
		   g.fillRect(0,0,getWidth(),getHeight());
		   g.setColor(color);  
	}
}
