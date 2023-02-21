
/**
 * 
 * @author Nhu Ly
 * @date 11/27/2022
 * 
 */
import javafx.animation.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Sphere;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Animation extends Application {
    /**
     * 2D and 3D Shapes
     */
    private Box box;
    private Polygon polygon;
    private Sphere sphere;
    private Cylinder cylinder;

    /**
     * Rotate Transition Button for all shapes
     */
    private Button rotateTransitionButtonPolygon;
    private Button rotateTransitionButtonBox;
    private Button rotateTransitionButtonCylinder;
    private Button rotateTransitionButtonSphere;

    /**
     * Scale Transition button for all shapes
     */
    private Button scaleTransitionButtonPolygon;
    private Button scaleTransitionButtonBox;
    private Button scaleTransitionButtonCylinder;
    private Button scaleTransitionButtonSphere;

    /**
     * Sequential Transition button for all shapes
     */
    private Button sequentialTransitionButtonPolygon;
    private Button sequentialTransitionButtonBox;
    private Button sequentialTransitionButtonCylinder;
    private Button sequentialTransitionButtonSphere;
    private Button fadeTransitionButtonPolygon;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        /**
         * Create 2 rows and 2 columns
         */
        int rows = 2;
        int columns = 2;

        GridPane root = new GridPane();
        FlowPane flowPanePolygon = new FlowPane();
        FlowPane flowPaneBox = new FlowPane();
        FlowPane flowPaneSphere = new FlowPane();
        FlowPane flowPaneCylinder = new FlowPane();

        /**
         * Create the border lines
         */
        for (int i = 0; i < columns; i++) {
            // 50 pixels wide
            ColumnConstraints columnConstraints = new ColumnConstraints(300);
            root.getColumnConstraints().add(columnConstraints);
        }

        for (int i = 0; i < rows; i++) {
            RowConstraints rowConstraints = new RowConstraints(300);
            root.getRowConstraints().add(rowConstraints);
        }

        /**
         * Create 2D items,
         * Add flow pane
         * Root
         */
        setUpPolygon();
        flowPanePolygon.getChildren().add(polygon);

        setUpBox();
        flowPaneBox.getChildren().add(box);

        /**
         * Create 3D items,
         * Add flow pane
         * Root
         */
        setUpCylinder();
        flowPaneCylinder.getChildren().add(cylinder);

        setUpSphere();
        flowPaneSphere.getChildren().add(sphere);

        root.add(flowPanePolygon, 0, 0);
        root.add(flowPaneBox, 1, 0);
        root.add(flowPaneCylinder, 0, 1);
        root.add(flowPaneSphere, 1, 1);

        /**
         * Create rotate transition buttons
         */
        setUpRotateTransitionPolygonButton();
        flowPanePolygon.getChildren().add(rotateTransitionButtonPolygon);

        setUpRotateTransitionBoxButton();
        flowPaneBox.getChildren().add(rotateTransitionButtonBox);

        setUpRotateTransitionCylinderButton();
        flowPaneCylinder.getChildren().add(rotateTransitionButtonCylinder);

        setUpRotateTransitionSphereButton();
        flowPaneSphere.getChildren().add(rotateTransitionButtonSphere);

        /**
         * Create scale transition buttons
         */
        setUpScaleTransitionPolygonButton();
        flowPanePolygon.getChildren().add(scaleTransitionButtonPolygon);

        setUpScaleTransitionBoxButton();
        flowPaneBox.getChildren().add(scaleTransitionButtonBox);

        setUpScaleTransitionCylinderButton();
        flowPaneCylinder.getChildren().add(scaleTransitionButtonCylinder);

        setUpScaleTransitionSphereButton();
        flowPaneSphere.getChildren().add(scaleTransitionButtonSphere);

        /**
         * Create sequential transition buttons
         */
        setUpSequentialTransitionPolygonButton();
        flowPanePolygon.getChildren().add(sequentialTransitionButtonPolygon);

        setUpSequentialTransitionBoxButton();
        flowPaneBox.getChildren().add(sequentialTransitionButtonBox);

        setUpSequentialTransitionSphereButton();
        flowPaneSphere.getChildren().add(sequentialTransitionButtonSphere);

        setUpSequentialTransitionCylinderButton();
        flowPaneCylinder.getChildren().add(sequentialTransitionButtonCylinder);

        /**
         * Create fade transition for polygon buttons
         */
        setUpFadeTransitionPolygonButton();
        flowPanePolygon.getChildren().add(fadeTransitionButtonPolygon);

        root.setStyle("-fx-background-color: white; -fx-grid-lines-visible: true");
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Animation");
        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(600);
        primaryStage.show();
    }

    /**
     * Set up Fade Transition Polygon button
     */
    private void setUpFadeTransitionPolygonButton() {
        fadeTransitionButtonPolygon = new Button("Fade Transition");
        fadeTransitionButtonPolygon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FadeTransition ft = new FadeTransition(Duration.seconds(3), polygon);
                ft.setFromValue(1.0f);
                ft.setToValue(0.3f);
                ft.setCycleCount(2);
                ft.setAutoReverse(true);
                ft.play();
            }
        });
    }

    /**
     * Set up Sequential Transition Polygon button
     */
    private void setUpSequentialTransitionPolygonButton() {
        sequentialTransitionButtonPolygon = new Button("Sequential Transition");
        FadeTransition ft = new FadeTransition(Duration.seconds(3));
        ft.setFromValue(1.0f);
        ft.setToValue(0.3f);
        ft.setCycleCount(1);
        ft.setAutoReverse(true);

        TranslateTransition tt = new TranslateTransition(Duration.seconds(3));
        tt.setFromX(-50f);
        tt.setToX(25f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);

        sequentialTransitionButtonPolygon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SequentialTransition seqT = new SequentialTransition(polygon, ft, tt);
                seqT.play();
            }
        });
    }

    /**
     * Set up sequential Transition box button
     */
    private void setUpSequentialTransitionBoxButton() {
        sequentialTransitionButtonBox = new Button("Sequential Transition");
        RotateTransition rt = new RotateTransition(Duration.seconds(3));
        rt.setByAngle(360);
        rt.setAutoReverse(true);

        TranslateTransition tt = new TranslateTransition(Duration.seconds(3));
        tt.setFromX(-50f);
        tt.setToX(25f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);

        sequentialTransitionButtonBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SequentialTransition seqT = new SequentialTransition(box, tt, rt);
                seqT.play();
            }
        });
    }

    /**
     * Set up Sequential Transition Cylinder button
     */
    private void setUpSequentialTransitionCylinderButton() {
        sequentialTransitionButtonCylinder = new Button("Sequential Transition");
        TranslateTransition tt = new TranslateTransition(Duration.seconds(3));
        tt.setFromX(-50f);
        tt.setToX(25f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);

        RotateTransition rt = new RotateTransition(Duration.seconds(3));
        rt.setByAngle(360);
        rt.setAutoReverse(true);

        sequentialTransitionButtonCylinder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SequentialTransition seqT = new SequentialTransition(cylinder, tt, rt);
                seqT.play();
            }
        });
    }

    /**
     * Set up Sequential Transition Sphere button
     */
    private void setUpSequentialTransitionSphereButton() {
        sequentialTransitionButtonSphere = new Button("Sequential Transition");
        TranslateTransition tt = new TranslateTransition(Duration.seconds(3));
        tt.setFromX(-50f);
        tt.setToX(25f);
        tt.setCycleCount(2);
        tt.setAutoReverse(true);

        ScaleTransition st = new ScaleTransition(Duration.seconds(3));
        st.setByX(1.5f);
        st.setByY(1.5f);
        st.setCycleCount(4);
        st.setAutoReverse(true);

        sequentialTransitionButtonSphere.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                SequentialTransition seqT = new SequentialTransition(sphere, tt, st);
                seqT.play();
            }
        });
    }

    /**
     * Set up Scale Transition Polygon button
     */
    private void setUpScaleTransitionPolygonButton() {
        scaleTransitionButtonPolygon = new Button("Scale Transition");
        scaleTransitionButtonPolygon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScaleTransition st = new ScaleTransition(Duration.seconds(3), polygon);
                st.setByX(1.5f);
                st.setByY(1.5f);
                st.setCycleCount(4);
                st.setAutoReverse(true);

                st.play();
            }
        });
    }

    /**
     * Set up Scale Transition Box button
     */
    private void setUpScaleTransitionBoxButton() {
        scaleTransitionButtonBox = new Button("Scale Transition");
        scaleTransitionButtonBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScaleTransition st = new ScaleTransition(Duration.seconds(3), box);
                st.setByX(1.5f);
                st.setByY(1.5f);
                st.setCycleCount(4);
                st.setAutoReverse(true);

                st.play();
            }
        });
    }

    /**
     * Set up Scale Transition Cylinder button
     */
    private void setUpScaleTransitionCylinderButton() {
        scaleTransitionButtonCylinder = new Button("Scale Transition");
        scaleTransitionButtonCylinder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScaleTransition st = new ScaleTransition(Duration.seconds(3), cylinder);
                st.setByX(1.5f);
                st.setByY(1.5f);
                st.setCycleCount(4);
                st.setAutoReverse(true);

                st.play();
            }
        });
    }

    /**
     * Set up Scale Transition Sphere button
     */
    private void setUpScaleTransitionSphereButton() {
        scaleTransitionButtonSphere = new Button("Scale Transition");
        scaleTransitionButtonSphere.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ScaleTransition st = new ScaleTransition(Duration.seconds(3), sphere);
                st.setByX(1.5f);
                st.setByY(1.5f);
                st.setCycleCount(4);
                st.setAutoReverse(true);

                st.play();
            }
        });
    }

    /**
     * Set up Rotate Transition Polygon button
     */
    private void setUpRotateTransitionPolygonButton() {
        rotateTransitionButtonPolygon = new Button("Rotate Transition");
        rotateTransitionButtonPolygon.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), polygon);
                rotateTransition.setByAngle(360);
                rotateTransition.play();
            }
        });
    }

    /**
     * Set up Rotate Transition Box button
     */
    private void setUpRotateTransitionBoxButton() {
        rotateTransitionButtonBox = new Button("Rotate Transition");

        rotateTransitionButtonBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), box);
                rotateTransition.setByAngle(360);
                rotateTransition.play();
            }
        });
    }

    /**
     * Set up Rotate Transition Cylinder button
     */
    private void setUpRotateTransitionCylinderButton() {
        rotateTransitionButtonCylinder = new Button("Rotate Transition");
        rotateTransitionButtonCylinder.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), cylinder);
                rotateTransition.setByAngle(360);
                rotateTransition.play();
            }
        });
    }

    /**
     * Set up Rotate Transition Sphere button
     */
    private void setUpRotateTransitionSphereButton() {
        rotateTransitionButtonSphere = new Button("Rotate Transition");
        rotateTransitionButtonSphere.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), sphere);
                rotateTransition.setByAngle(360);
                rotateTransition.play();
            }
        });
    }

    /**
     * Set up Polygon shape
     */
    private void setUpPolygon() {
        polygon = new Polygon();
        polygon.getPoints().addAll(0.0, 0.0,
                100.0, 50.0,
                50.0, 100.0);
        polygon.setFill(Color.CORNFLOWERBLUE);
    }

    /**
     * Set up Box shape
     */
    private void setUpBox() {
        box = new Box();
        box.setHeight(100);
        box.setWidth(100);
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseColor(Color.ORCHID);
        box.setMaterial(phongMaterial);
    }

    /**
     * Set up Sphere shape
     */
    private void setUpSphere() {
        sphere = new Sphere(100);
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseColor(Color.DARKSEAGREEN);
        sphere.setMaterial(phongMaterial);
    }

    /**
     * Set up Cylinder shape
     */
    private void setUpCylinder() {
        cylinder = new Cylinder(100, 200);
        PhongMaterial phongMaterial = new PhongMaterial();
        phongMaterial.setDiffuseColor(Color.LAVENDERBLUSH);
        cylinder.setMaterial(phongMaterial);
    }
}