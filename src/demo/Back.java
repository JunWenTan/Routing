package demo;

import Entity.Point;
import Entity.RemarkablePath;
import Entity.Route;
import Entity.Waypoint;

import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.Arrays;


/**
 * Created by admin on 1/31/2017.
 */
public class Back {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH.mm.ss");
    public static void run()
    {
        ArrayList<Route> routeList = new ArrayList<Route>();
        routeList.add(new Route("1", "7", "Best"));
        routeList.add(new Route("10", "3", "Access"));

        //initialize dummy waypoints on map
        ArrayList<Point> pointList = new ArrayList<Point>();
        pointList.add(new Waypoint("1", 0, 0, false, new ArrayList<String>(Arrays.asList("3", "8"))));
        pointList.add(new Waypoint("2", 1, 0, true, new ArrayList<String>(Arrays.asList("1", "3"))));
        pointList.add(new Waypoint("3", 2, 0, false, new ArrayList<String>(Arrays.asList("1", "5", "6"))));
        pointList.add(new Waypoint("4", 3, 0, true, new ArrayList<String>(Arrays.asList("3", "5"))));
        pointList.add(new Waypoint("5", 4, 0, false, new ArrayList<String>(Arrays.asList("3", "7"))));

        pointList.add(new Waypoint("6", 2, 2, true, new ArrayList<String>(Arrays.asList("3", "10"))));
        pointList.add(new Waypoint("7", 4, 2, true, new ArrayList<String>(Arrays.asList("5", "12"))));

        pointList.add(new Waypoint("8", 0, 4, false, new ArrayList<String>(Arrays.asList("1", "13"))));
        pointList.add(new Waypoint("9", 1, 4, true, new ArrayList<String>(Arrays.asList("8", "10"))));
        pointList.add(new Waypoint("10", 2, 4, false, new ArrayList<String>(Arrays.asList("8", "12"))));
        pointList.add(new Waypoint("11", 3, 4, true, new ArrayList<String>(Arrays.asList("10", "12"))));
        pointList.add(new Waypoint("12", 4, 4, false, new ArrayList<String>(Arrays.asList("7", "10", "16"))));

        pointList.add(new Waypoint("13", 0, 5, false, new ArrayList<String>(Arrays.asList("8", "14"))));
        pointList.add(new Waypoint("14", 1, 5, false, new ArrayList<String>(Arrays.asList("9", "13"))));
        pointList.add(new Waypoint("15", 3, 5, false, new ArrayList<String>(Arrays.asList("11", "16"))));
        pointList.add(new Waypoint("16", 4, 5, false, new ArrayList<String>(Arrays.asList("12", "15"))));
//        pointList.add(new Waypoint("1", 0, 0, false, new ArrayList<String>(Arrays.asList("2", "5"))));
//        pointList.add(new Waypoint("2", 1, 0, true, new ArrayList<String>(Arrays.asList("1", "3"))));
//        pointList.add(new Waypoint("3", 2, 0, true, new ArrayList<String>(Arrays.asList("2", "7"))));
//
//        pointList.add(new Waypoint("5", 0, 1, false, new ArrayList<String>(Arrays.asList("1", "6", "9"))));
//        pointList.add(new Waypoint("6", 1, 1, false, new ArrayList<String>(Arrays.asList("5", "7", "10"))));
//        pointList.add(new Waypoint("7", 2, 1, false, new ArrayList<String>(Arrays.asList("3", "6", "11"))));
//
//        pointList.add(new Waypoint("9", 0, 2, false, new ArrayList<String>(Arrays.asList("5", "10"))));
//        pointList.add(new Waypoint("10", 1, 2, false, new ArrayList<String>(Arrays.asList("6", "9", "11"))));
//        pointList.add(new Waypoint("11", 2, 2, false, new ArrayList<String>(Arrays.asList("", "10"))));




        Timestamp time = new Timestamp(System.currentTimeMillis());
        System.out.println(time);
        System.out.println(sdf.format(time));
        ArrayList<RemarkablePath> rpList = new ArrayList<RemarkablePath>();
        rpList.add(new RemarkablePath("6", "7", 10, time, ""));

        ArrayList<Point> accessPointList = new ArrayList<Point>();
        accessPointList.add(new Waypoint("2", 1, 0, true, new ArrayList<String>(Arrays.asList("17"))));
        accessPointList.add(new Waypoint("4", 3, 0, true, new ArrayList<String>(Arrays.asList("18"))));
        accessPointList.add(new Waypoint("17", 1, 2, true, new ArrayList<String>(Arrays.asList("2", "6", "9"))));
        accessPointList.add(new Waypoint("6", 2, 2, true, new ArrayList<String>(Arrays.asList("17", "18"))));
        accessPointList.add(new Waypoint("18", 3, 2, true, new ArrayList<String>(Arrays.asList("4", "6", "7", "11"))));
        accessPointList.add(new Waypoint("7", 4, 2, true, new ArrayList<String>(Arrays.asList("18"))));
        accessPointList.add(new Waypoint("9", 1, 4, true, new ArrayList<String>(Arrays.asList("17"))));
        accessPointList.add(new Waypoint("11", 3, 4, true, new ArrayList<String>(Arrays.asList("18"))));

        ArrayList<Point> accessBorderList = new ArrayList<Point>();
        accessBorderList.add(new Waypoint("2", 1, 0, true, new ArrayList<String>(Arrays.asList("17"))));
        accessBorderList.add(new Waypoint("4", 3, 0, true, new ArrayList<String>(Arrays.asList("18"))));

        accessBorderList.add(new Waypoint("6", 2, 2, true, new ArrayList<String>(Arrays.asList("17", "18"))));

        accessBorderList.add(new Waypoint("7", 4, 2, true, new ArrayList<String>(Arrays.asList("18"))));
        accessBorderList.add(new Waypoint("9", 1, 4, true, new ArrayList<String>(Arrays.asList("17"))));
        accessBorderList.add(new Waypoint("11", 3, 4, true, new ArrayList<String>(Arrays.asList("18"))));
        
        ArrayList<Point> universalPoints = new ArrayList<Point>();
        universalPoints.add(new Waypoint("1", 0, 0, false, new ArrayList<String>(Arrays.asList("3", "8"))));
   
        universalPoints.add(new Waypoint("3", 2, 0, false, new ArrayList<String>(Arrays.asList("1", "5", "6"))));
       
        universalPoints.add(new Waypoint("5", 4, 0, false, new ArrayList<String>(Arrays.asList("3", "7"))));

        

        universalPoints.add(new Waypoint("8", 0, 4, false, new ArrayList<String>(Arrays.asList("1", "13"))));
        universalPoints.add(new Waypoint("10", 2, 4, false, new ArrayList<String>(Arrays.asList("8", "12"))));
        universalPoints.add(new Waypoint("12", 4, 4, false, new ArrayList<String>(Arrays.asList("7", "10", "16"))));

        universalPoints.add(new Waypoint("13", 0, 5, false, new ArrayList<String>(Arrays.asList("8", "14"))));
        universalPoints.add(new Waypoint("14", 1, 5, false, new ArrayList<String>(Arrays.asList("9", "13"))));
        universalPoints.add(new Waypoint("15", 3, 5, false, new ArrayList<String>(Arrays.asList("11", "16"))));
        universalPoints.add(new Waypoint("16", 4, 5, false, new ArrayList<String>(Arrays.asList("12", "15"))));
        universalPoints.add(new Waypoint("2", 1, 0, true, new ArrayList<String>(Arrays.asList("17"))));
        universalPoints.add(new Waypoint("4", 3, 0, true, new ArrayList<String>(Arrays.asList("18"))));
        universalPoints.add(new Waypoint("17", 1, 2, true, new ArrayList<String>(Arrays.asList("2", "6", "9"))));
        universalPoints.add(new Waypoint("6", 2, 2, true, new ArrayList<String>(Arrays.asList("17", "18"))));
        universalPoints.add(new Waypoint("18", 3, 2, true, new ArrayList<String>(Arrays.asList("4", "6", "7", "11"))));
        universalPoints.add(new Waypoint("7", 4, 2, true, new ArrayList<String>(Arrays.asList("18"))));
        universalPoints.add(new Waypoint("9", 1, 4, true, new ArrayList<String>(Arrays.asList("17"))));
        universalPoints.add(new Waypoint("11", 3, 4, true, new ArrayList<String>(Arrays.asList("18"))));



        //routeList.get(0).setShortestRoute(pointList);
        ArrayList<String> strList = routeList.get(1).getAccessRoute(pointList, accessPointList, accessBorderList, universalPoints);
        System.out.print("Access: ");
        for(String a: strList)
        {
            System.out.print(a + ", ");
        }
    }


}
