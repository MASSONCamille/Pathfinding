package controler;

import model.HexCell;
import model.cellDecorator.CellFog;
import model.cellDecorator.CellForest;
import model.cellDecorator.ClassicCell;
import view.MainWindow;

public class Main {

    public static void main(String[] args) {

        HexCell test = new CellFog(new CellForest(new ClassicCell()));
        System.out.println(test.getEnterCost());
        System.out.println(test.getExitCost());
        System.out.println(test.getViewRange());
        System.out.println(test.IsWalkable());
    }
}
