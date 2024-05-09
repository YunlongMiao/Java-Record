import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;
import javax.microedition.midlet.MIDletStateChangeException;
/** *//**
*
* @author　计21-2苗云龙
* @version
*/
public class MyCanvasTest extends MIDlet {
	private MyCanvas canvas = new MyCanvas();
	public Display display = null;
	private Command exitCommand = new Command("退出",Command.EXIT,1);
	private Command ScreenCommand = new Command("高级界面",Command.OK,1);
	public MyCanvasTest() {
		// TODO Auto-generated constructor stub
	}

	protected void destroyApp(boolean arg0) throws MIDletStateChangeException {
		// TODO Auto-generated method stub

	}

	protected void pauseApp() {
		// TODO Auto-generated method stub
	}
	protected void startApp() throws MIDletStateChangeException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		if(display==null){
			 display = Display.getDisplay(this);
			 canvas.addCommand(exitCommand);
			 canvas.addCommand(ScreenCommand);
			 canvas.setCommandListener(new MyCommandListener(this,canvas));
			 display.setCurrent(canvas);
		}
	}
}
