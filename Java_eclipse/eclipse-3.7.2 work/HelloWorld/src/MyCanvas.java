import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Graphics;
/*
*
* @author 计21-2苗云龙
*/
public class MyCanvas extends Canvas {
	public MyCanvas() {
		
	}
	
	protected void paint(Graphics g) {
		//清除背景
		   clearBackground(g);
		   //显示可供绘图的区域的大小
		    g.drawString("宽度：",10,10,Graphics.LEFT|Graphics.TOP);
		    g.drawString(String.valueOf(getWidth()),50,10,Graphics.LEFT|Graphics.TOP);
		    g.drawString("高度：",10,25,Graphics.LEFT|Graphics.TOP);
		    g.drawString(String.valueOf(getHeight()),50,25,Graphics.LEFT|Graphics.TOP);
	}
	public void clearBackground(Graphics g){
		int color = g.getColor();
		   g.setColor(0xffffff);
		   g.fillRect(0,0,getWidth(),getHeight());
		   g.setColor(color);  
	}
}
