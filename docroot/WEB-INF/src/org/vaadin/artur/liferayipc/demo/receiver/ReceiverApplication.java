package org.vaadin.artur.liferayipc.demo.receiver;

import com.vaadin.Application;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class ReceiverApplication extends Application {

    public void init() {
        setMainWindow(new Window("Receiver", new ReceiverView()));
    }

}
