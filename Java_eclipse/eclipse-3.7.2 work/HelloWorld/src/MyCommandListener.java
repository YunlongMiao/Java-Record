import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.midlet.MIDletStateChangeException;
/** *//**
*
* @author 计21-2苗云龙
*/
public class MyCommandListener implements CommandListener {
	 private MyCanvasTest app;
	 
	 private MyScreen ms;
	 private MyCanvas canvas;
	 public MyCommandListener(MyCanvasTest app,MyCanvas canvas) {
		 this.app = app;
		 this.canvas = canvas;
		 }
	 public MyCommandListener(MyCanvasTest app,MyScreen ms) {
		 this.app = app;
		 this.ms = ms;
		 }
	public void commandAction(Command cmd, Displayable display) {
		// TODO Auto-generated method stub
		if(cmd.getLabel().equalsIgnoreCase("退出"))
		{
			 try {
				app.destroyApp(false);
			} catch (MIDletStateChangeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 app.notifyDestroyed();
		 }
		else if(cmd.getLabel().equalsIgnoreCase("高级界面"))
		{
			ms = new MyScreen("MyScreen");
            app.display.setCurrent(ms);			
		}
	}
}
