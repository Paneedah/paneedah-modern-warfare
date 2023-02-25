package project.paneedah.mw.Entities;

public enum Vehicles {
    TankChassis("Tank Chassis"),
    PlaneChassis("Plane Chassis"),
    JetChassis("Jet Chassis"),
    NavyChassis("Navy Chassis"),
    CarChassis("Car Chassis"),
    MilitaryCarChassis("Military Car Chasis");

    private final String name;

    Vehicles(String name) {
        this.name = name;
    }

    public String GetName() { return name; }
}
