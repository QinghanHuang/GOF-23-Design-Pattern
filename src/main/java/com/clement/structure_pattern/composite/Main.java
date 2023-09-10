package com.clement.structure_pattern.composite;

/**
 * @Author Qinghan Huang
 * @Date 25/08/2023 18:09
 * @Desc
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        ConcreteCompany dublinHeadQuarter = new ConcreteCompany("Dublin Head Quarter");
        HR dublinHr = new HR("Dublin HR");
        Operation dublinOp = new Operation("Dublin OP");
        ConcreteCompany galwayQuarter = new ConcreteCompany("Galway Sub Quarter");
        HR galwayHr = new HR("Galway HR");
        Operation galWayOp = new Operation("GalWay OP");

        dublinHeadQuarter.add(galwayQuarter);
        dublinHeadQuarter.add(dublinOp);
        dublinHeadQuarter.add(dublinHr);


        galwayQuarter.add(galwayHr);
        galwayQuarter.add(galWayOp);

        dublinHeadQuarter.display(1);

    }
}
