package com_java_maintenance_application_model_package_sama_velma_andin;

public class MaintenanceSchedule {
    private String vehicle_matricule;
    private String maintenance_part;
    private String maintenance_time;

    public MaintenanceSchedule(String vehicle_matricule, String maintenance_part, String maintenance_time) {
        this.vehicle_matricule = vehicle_matricule;
        this.maintenance_part = maintenance_part;
        this.maintenance_time = maintenance_time;
    }
 
    public String getVehicle_matricule() {
        return vehicle_matricule;
    }

    public void setVehicle_matricule(String vehicle_matricule) {
        this.vehicle_matricule = vehicle_matricule;
    }

    public String getMaintenance_part() {
        return maintenance_part;
    }

    public void setMaintenance_part(String maintenance_part) {
        this.maintenance_part = maintenance_part;
    }

    public String getMaintenance_time() {
        return maintenance_time;
    }

    public void setMaintenance_time(String maintenance_time) {
        this.maintenance_time = maintenance_time;
    }

}
