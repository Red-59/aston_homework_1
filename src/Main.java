import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Tools tools1 = new Tools("Wrench","Screwdriver", "Hammer", "Pliers");

        String tool1 = tools1.getTool1();
        String tool2 = tools1.getTool2();
        String tool3 = tools1.getTool3();
        String tool4 = tools1.getTool4();

        List<String>setTool1=Arrays.asList(tool1,tool2);
        List<String>setTool2=Arrays.asList(tool3,tool4);
        List<String>setTool3=Arrays.asList(tool1,tool2,tool3);

        Tools tools2 = new Tools(setTool1);
        ToolBox size = new ToolBox(30, 50, 10, tools1);

        System.out.println();
    }
}