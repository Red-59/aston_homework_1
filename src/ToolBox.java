import java.util.ArrayList;
import java.util.List;



public final class ToolBox {

    private final int width;
    private final int length;
    private final int height;
    private final Tools tools;


    public ToolBox(int width, int length, int height, Tools tools ) {

        this.width=width;
        this.length=length;
        this.height=height;
        this.tools=tools;
    }


    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }
    public Tools getTools() {
        return tools;
    }
}
