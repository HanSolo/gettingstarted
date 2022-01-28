module eu.hansolo.fx.gettingstarted {
// Java
    requires java.base;

    // Java-FX
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;
    // needed for Charts and TilesFX
    requires transitive javafx.swing;
    // needed for TilesFX
    requires transitive javafx.media;
    requires transitive javafx.web;

    // 3rd Party
    // needed for Charts and TilesFX
    requires transitive eu.hansolo.jdktools;
    requires transitive eu.hansolo.toolbox;
    requires transitive eu.hansolo.toolboxfx;
    requires transitive eu.hansolo.fx.heatmap;
    requires transitive eu.hansolo.fx.countries;
    // needed for Charts
    requires transitive eu.hansolo.fx.charts;
    // needed for TilesFX
    requires transitive eu.hansolo.tilesfx;

    // Exports
    exports eu.hansolo.fx.gettingstarted.charts;
    exports eu.hansolo.fx.gettingstarted.tilesfx;
}