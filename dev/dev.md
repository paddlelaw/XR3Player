## dev

mvn clean package -DskipTests
`mvn javafx:run -f XR3Player`
## java17 vm

--add-exports
javafx.controls/com.sun.javafx.scene.control.behavior=com.jfoenix
--add-exports
javafx.controls/com.sun.javafx.scene.control=com.jfoenix
--add-exports
javafx.base/com.sun.javafx.binding=com.jfoenix
--add-exports
javafx.graphics/com.sun.javafx.stage=jxbrowser
--add-exports
javafx.graphics/com.sun.javafx.tk=jxbrowser
--add-exports
javafx.graphics/com.sun.glass.ui=jxbrowser
--add-exports
javafx.graphics/com.sun.javafx.stage=com.jfoenix
--add-exports
javafx.base/com.sun.javafx.event=com.jfoenix
--add-exports
javafx.graphics/com.sun.javafx.scene=org.controlsfx.controls
--add-exports
javafx.graphics/com.sun.javafx.scene.traversal=org.controlsfx.controls