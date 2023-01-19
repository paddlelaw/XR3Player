# Logbook

- 2021-07-06 09:01:01.609
- root = `F:\z-openjfx\Z_xr3player\XR3Player`
- external-modules = `.bach\external-modules`
- external-tools = `.bach\external-tools`
- workspace = `.bach\workspace`

## Modules

Streaming directory `.bach\workspace\modules` failed

> .bach\workspace\modules

## Tool Run Overview

Recorded 1 tool run.

|Thread| Duration |Tool|Arguments
|-----:|---------:|----|---------
|     1|    0.456s|[javac](#javac-1757cd72)|`--module` `XR3Player` `--module-version` `17-bach` `--module-source-path` `XR3Player=src\main\java` `--module-path` `.bach\external-modules` `-d` `.bach\workspace\classes-main-16`

## Tool Run Details

1 recording

### javac-1757cd72

- tool = `javac`
- args = `--module` `XR3Player` `--module-version` `17-bach` `--module-source-path` `XR3Player=src\main\java` `--module-path` `.bach\external-modules` `-d` `.bach\workspace\classes-main-16`
- thread = 1
- duration = 0.456s
- code = 1

```text
src\main\java\com\goxr3plus\xr3player\controllers\librarymode\LibraryMode.java:477: error: illegal character: '\u00bb'
        colorPicker.setOnAction(Î» -> Main.dbManager.getPropertiesDb().updateProperty("Libraries-Background-Color",
                                 ^
src\main\java\com\goxr3plus\xr3player\controllers\librarymode\LibraryMode.java:478: error: ';' expected
                JavaFXTool.colorToWebColor(colorPicker.getValue())));
                                                                   ^
src\main\java\com\goxr3plus\xr3player\services\xplayer\XPlayerPlayService.java:247: error: unmappable character (0x9D) for encoding windows-1252
         "We canâ€™t find an audio device.\nMake sure that headphones or speakers are connected.\n For more info, search your device for â€œManage audio devicesâ€�",
                                                                                                                                                                  ^
3 errors
```

## Log Messages

```text
[D] Computed additionally required modules: 0
[D] Computed module lookup functions: 5
[D] External modules directory present: .bach\external-modules
[D] Compute spaces out of 2 modules
[D] Skip module .bach\bach.info\module-info.java - it contains `.bach` in its path names
[D] No or multiple main modules declare a main class: []
[I] Bach 17-ea-2 (Java 16.0.1+9, Windows 10, F:\z-openjfx\Z_xr3player\XR3Player)
[D] Perform main action: `build`
[I] Build XR3Player 17-bach
[D] Load missing external modules
[D] Computed 11 required modules: [com.fasterxml.jackson.annotation, com.fasterxml.jackson.core, com.fasterxml.jackson.databind, java.desktop, java.logging, java.net.http, java.sql, javafx.controls, javafx.fxml, javafx.web, jdk.jsobject]
[D] Loaded 0 modules
[I] Verify external modules located in file:///F:/z-openjfx/Z_xr3player/XR3Player/.bach/external-modules/
[D] Verify module com.fasterxml.jackson.annotation@2.12.1 (com.fasterxml.jackson.annotation.jar)
[D] No verification metadata available for module: com.fasterxml.jackson.annotation
[D] Verify module com.fasterxml.jackson.core@2.12.1 (com.fasterxml.jackson.core.jar)
[D] No verification metadata available for module: com.fasterxml.jackson.core
[D] Verify module com.fasterxml.jackson.databind@2.12.1 (com.fasterxml.jackson.databind.jar)
[D] No verification metadata available for module: com.fasterxml.jackson.databind
[I] Verified 3 external modules
[I] Build 1 main module: XR3Player
[I]   javac    --module XR3Player --module-version 17-bach --module-source-path XR3Player=src\main\java --module-path .bach\ext[...]
[I] Action build failed: java.lang.RuntimeException: javac returned code 1
    Run[name=javac, args=[--module, XR3Player, --module-version, 17-bach, --module-source-path, XR3Player=src\main\java, --module-path, .bach\external-modules, -d, .bach\workspace\classes-main-16], thread=1, duration=PT0.4569998S, code=1, output=, errors=src\main\java\com\goxr3plus\xr3player\controllers\librarymode\LibraryMode.java:477: error: illegal character: '\u00bb'
            colorPicker.setOnAction(Î» -> Main.dbManager.getPropertiesDb().updateProperty("Libraries-Background-Color",
                                     ^
    src\main\java\com\goxr3plus\xr3player\controllers\librarymode\LibraryMode.java:478: error: ';' expected
                    JavaFXTool.colorToWebColor(colorPicker.getValue())));
                                                                       ^
    src\main\java\com\goxr3plus\xr3player\services\xplayer\XPlayerPlayService.java:247: error: unmappable character (0x9D) for encoding windows-1252
    									"We canâ€™t find an audio device.\nMake sure that headphones or speakers are connected.\n For more info, search your device for â€œManage audio devicesâ€�",
    									                                                                                                                                                         ^
    3 errors]

```

## Thanks for using Bach

Support its development at <https://github.com/sponsors/sormuras>
