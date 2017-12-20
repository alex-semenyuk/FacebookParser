package parser.model;

import java.util.ArrayList;
import java.util.List;

public class Profile {

    private String name;
    private List<Education> educationList = new ArrayList<>();
    private List<Work> workList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Education> getEducationList() {
        return educationList;
    }

    public void setEducationList(List<Education> educationList) {
        this.educationList = educationList;
    }

    public List<Work> getWorkList() {
        return workList;
    }

    public void setWorkList(List<Work> workList) {
        this.workList = workList;
    }
}
