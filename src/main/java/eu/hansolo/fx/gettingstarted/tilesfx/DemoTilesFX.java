package eu.hansolo.fx.gettingstarted.tilesfx;

import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.TileBuilder;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Random;

public class DemoTilesFX extends Application {
    private static final Random RND = new Random();

    private Tile           tile;
    private long           lastTimerCall;
    private AnimationTimer timer;


    @Override public void init() {
        tile = TileBuilder.create()
                .skinType(Tile.SkinType.GAUGE)
                .title("Demo")
                .text("Text")
                .build();

        lastTimerCall = System.nanoTime();
        timer         = new AnimationTimer() {
            @Override public void handle(final long now) {
                if (now > lastTimerCall + 2_000_000_000l) {
                    tile.setValue(RND.nextDouble() * (tile.getMaxValue() - tile.getMinValue()) + tile.getMinValue());
                    lastTimerCall = now;
                }
            }
        };

    }

    @Override public void start(final Stage stage) {
        StackPane pane = new StackPane(tile);
        pane.setPadding(new Insets(10));

        Scene scene = new Scene(pane, 800, 600);

        stage.setTitle("Getting started TilesFX");
        stage.setScene(scene);
        stage.show();

        timer.start();
    }

    @Override public void stop() {
        Platform.exit();
    }


    public static void main(String[] args) {
        launch(args);
    }
}