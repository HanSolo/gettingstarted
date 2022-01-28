module eu.hansolo.fx.gettingstarted {
// Java
    requires java.base;

    // Java-FX
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;
    requires transitive javafx.swing;
    requires transitive javafx.media;
    requires transitive javafx.web;

    // 3rd Party
    requires transitive eu.hansolo.jdktools;
    requires transitive eu.hansolo.toolbox;
    requires transitive eu.hansolo.toolboxfx;

    requires transitive eu.hansolo.fx.heatmap;
    requires transitive eu.hansolo.fx.countries;
    requires transitive eu.hansolo.fx.charts;
    requires transitive eu.hansolo.tilesfx;

    exports eu.hansolo.fx.gettingstarted.charts;
    exports eu.hansolo.fx.gettingstarted.tilesfx;
}