package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane {
	private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;
    
    public void onboard(String passengersname) {
        if(passengers.size() <= maxPassengers) {
            this.passengers.add(passengersname);
        }else {
            System.out.println("Plane is full");
        }
    }
    public Date takeOff() {
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }
public void land() {
    this.lastTimeLanded = new Date();
    this.passengers.clear();
}
    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }

    public List<String> getPassengers() {
        return passengers;
    }

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }}


