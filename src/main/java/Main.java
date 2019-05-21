import javax.swing.event.ChangeListener;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChristmasTree tree = new BubbleLights(new BubbleLights(new ChristmasTreeImpl()));
        tree.decorate();

    }
}

interface ChristmasTree{
    void decorate();
}

class ChristmasTreeImpl implements ChristmasTree{
    private String str = "Tree";

    @Override
    public void decorate() {
        System.out.print(str);
    }
}
class BubbleLights implements ChristmasTree{
    private ChristmasTree christmasTree;

    public BubbleLights(ChristmasTree tree){
        christmasTree = tree;
    }

    @Override
    public void decorate() {
        christmasTree.decorate();
        System.out.print(" with bubles");
    }
}

