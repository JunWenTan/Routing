package Entity;

import java.util.ArrayList;

/**
 * Created by admin on 1/31/2017.
 */
public class Waypoint extends Point{

    private String description;
    private String listValue;


    public Waypoint(String id, double offX, double offY, boolean access, ArrayList<String> connectedPointList) {
        super(id, offX, offY, access);
        this.setConnectedPointList(connectedPointList);
    }


}

