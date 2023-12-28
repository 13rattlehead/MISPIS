package ru.vsu.cs.ryndin_denis;

public class Participation {
    private int hours;
    private ResearchAssociate researchAssociate;
    private Project project;
    private ResearchAssociate atribute;
    private ResearchAssociate atribute2;

    public Participation(int hours, ResearchAssociate researchAssociate, Project project, ResearchAssociate atribute, ResearchAssociate atribute2) {
        this.hours = hours;
        this.researchAssociate = researchAssociate;
        this.project = project;
        this.atribute = atribute;
        this.atribute2 = atribute2;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public ResearchAssociate getResearchAssociate() {
        return researchAssociate;
    }

    public void setResearchAssociate(ResearchAssociate researchAssociate) {
        this.researchAssociate = researchAssociate;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ResearchAssociate getAtribute() {
        return atribute;
    }

    public void setAtribute(ResearchAssociate atribute) {
        this.atribute = atribute;
    }

    public ResearchAssociate getAtribute2() {
        return atribute2;
    }

    public void setAtribute2(ResearchAssociate atribute2) {
        this.atribute2 = atribute2;
    }
}
