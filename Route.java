package FYP;

import java.util.*;

public class Route{
    String startTime;
    String startPosition;
    String destination;
    ArrayList<String> validBus = new ArrayList<>();

    public Route(String inputTime, String outset, String dest){
        startTime = inputTime;
        startPosition = outset;
        destination = dest;
    }

    public void computeLine(){//figure out which bused can be taken and store them in validBus

    }

    public void storeRoute(){//store the route info to a local file

    }


}