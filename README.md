## Getting started

A little demo project which shows how to use libraries like

[Charts](https://github.com/HanSolo/charts/tree/jdk17)

[TilesFX](https://github.com/HanSolo/tilesfx/tree/jdk17)

in combination with JDK 17

Please take a look at the [build.gradle](https://github.com/HanSolo/gettingstarted/blob/main/build.gradle) file to see which imports are needed for
those libraries.
And in addition please also take a look at the [module-info.java](https://github.com/HanSolo/gettingstarted/blob/main/src/main/java/module-info.java) file which contains the
required modules for each library;

For each library you will find a separate package with a demo class that shows
how to make use of the library:
- Charts : [eu.hansolo.fx.gettingstarted.charts.DemoCharts](https://github.com/HanSolo/gettingstarted/blob/main/src/main/java/eu/hansolo/fx/gettingstarted/charts/DemoCharts.java)
- TilesFX: [eu.hansolo.fx.gettingstarted.tilesfx.DemoTilesFX](https://github.com/HanSolo/gettingstarted/blob/main/src/main/java/eu/hansolo/fx/gettingstarted/tilesfx/DemoTilesFX.java)

Both demos can be started using the gradle wrapper from the command line as follows:
- Charts : ```./gradlew DemoCharts```
- TilesFX: ```/gradlew DemoTilesFX```