import javax.microedition.lcdui.Choice;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Item;
import javax.microedition.lcdui.List;
import javax.microedition.lcdui.StringItem;

public class MyScreen extends Form  {
	private Command cmdBack;
	private Command cmdExit;	
	private List implicitList,multipleList;
	Item exclusiveList;
	public MyScreen(String title) {
		super(title);
		// TODO Auto-generated constructor stub
		this.append("开始游戏") ;
	    this.append(new StringItem(null,"游戏介绍"));  			
	    this.append(new StringItem("超级玛莉","主人公介绍")) ;
	    this.append(new StringItem("蘑菇道具 ","道具的使用")) ;
	}
}
