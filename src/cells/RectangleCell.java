package cells;

import graph.Cell;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by t00191774 on 14/11/2016.
 * Made by Roland -> http://stackoverflow.com/questions/30679025/graph-visualisation-like-yfiles-in-javafx
 *
 */
public class RectangleCell extends Cell {

    public RectangleCell(String id) {
        super(id);

        Rectangle view = new Rectangle(50,50);

        view.setStroke(Color.DODGERBLUE);
        view.setFill(Color.DODGERBLUE);

        setView(view);

    }
}
