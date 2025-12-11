import java.util.ArrayList;
import java.util.List;

public class Tools {

    private String tool1;
    private String tool2;
    private String tool3;
    private String tool4;
    private List<String> setTool;


    public Tools(String tool1, String tool2, String tool3, String tool4) {
        this.tool1=tool1;
        this.tool2=tool2;
        this.tool3=tool3;
        this.tool4=tool4;
    }
    public Tools(List<String> setTool) {
        this.setTool=new ArrayList<>(setTool);
    }

    public String getTool1() {
        return tool1;
    }

    public String getTool2() {
        return tool2;
    }

    public String getTool3() {
        return tool3;
    }

    public String getTool4() {
        return tool4;
    }

    public List<String> getSetTool() {
        return setTool;
    }
}
