package UML;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.paint.Color;

public class Buttons extends ToggleButton {
	public Buttons(String name,Node icon){
		this.setText(name);
		this.setGraphic(icon);
		this.setBackground(Background.EMPTY);
//		this.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, null)));
	}
	public void choosed(){
	}
}
