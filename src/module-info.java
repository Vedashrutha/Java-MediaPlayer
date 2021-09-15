module Player {
	requires javafx.controls;
	requires javafx.media;
	requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	
	opens mediaplayer to javafx.graphics, javafx.fxml;
}
