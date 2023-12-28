package ru.vsu.cs.ryndin_denis;

public class Main {
    public static void main(String[] args) {
        Faculty fkn = new Faculty("FKN");
        Institute toizi = new Institute("ISIT", "297");
        Institute is = new Institute("VVIP", "387");
        Institute itu = new Institute("MKN", "312п");
        Institute piit = new Institute("PIIT", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Denis Ryindin Dmitrievich",
                "data protection");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Golovlev Gordey Stepanovich",
                "systems modeling");
        ResearchAssociate emp3 = new ResearchAssociate(1234, "Sviridov Danil Petrovich",
                "\n" +
                        "intelligent systems");
        ResearchAssociate emp4 = new ResearchAssociate(1234, "Denis Ryindin Dmitrievich",
                "pattern recognition");
        ResearchAssociate emp5 = new ResearchAssociate(1234, "Denis Ryindin Dmitrievich",
                "information processing technologies");

        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("\n" +
                "Departments " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");



    }
}
