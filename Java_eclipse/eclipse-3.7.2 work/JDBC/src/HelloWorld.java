//HelloWorld.java
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

public class HelloWorld extends MIDlet {
    Display display;

    public HelloWorld() {
        super();
        display = Display.getDisplay(this);
    }

    protected void startApp() {
        Form form = new Form("Hello World!");
        form.append("Welcome to J2ME world!");
        display.setCurrent(form);
    }

    protected void pauseApp() {
    }

    protected void destroyApp(boolean arg0) {
    }
}
