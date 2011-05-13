package org.vaadin.artur.liferayipc.demo.sender;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class SenderApplication extends Application {

    public void init() {
        setMainWindow(new Window("Sender", new SenderView()));
    }
}
