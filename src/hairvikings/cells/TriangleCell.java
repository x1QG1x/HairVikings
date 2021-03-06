package hairvikings.cells;

import hairvikings.graph.Cell;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;

/**
 * Created by t00191774 on 14/11/2016.
 * Made by Roland -> http://stackoverflow.com/questions/30679025/graph-visualisation-like-yfiles-in-javafx
 */
public class TriangleCell extends Cell {

    public TriangleCell(String id) {
        super(id);

        double width = 50;
        double height = 50;

        Polygon view = new Polygon( width / 2, 0, width, height, 0, height);

        view.setStroke(Color.RED);
        view.setFill(Color.RED);

        setView(view);

    }

}