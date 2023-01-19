module XR3Player {
    requires java.desktop;
    requires java.net.http;
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires jdk.jsobject;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;
    requires java.logging;
//    requires com.jfoenix;
    requires java.sql;
    requires FX.BorderlessScene;
    requires evo.inflector;
    requires com.jfoenix;
    requires java.google.speech.api;
//    requires evo.inflector;
//    requires FX.BorderlessScene;
    opens com.goxr3plus.xr3player.application to com.fasterxml.jackson.core, com.fasterxml.jackson.databind, com.fasterxml.jackson.annotation, javafx.fxml, javafx.web;
    exports com.goxr3plus.xr3player.application;
//    exports com.goxr3plus.xr3player.controllers;
    exports com.goxr3plus.xr3player.database;
    exports com.goxr3plus.xr3player.enums;
    exports com.goxr3plus.xr3player.models.lists;
//    exports com.goxr3plus.xr3player.services;
    exports com.goxr3plus.xr3player.utils.javafx;
}