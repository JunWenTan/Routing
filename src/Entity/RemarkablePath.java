package Entity;

import java.sql.Timestamp;

/**
 * Created by admin on 1/31/2017.
 */
public class RemarkablePath {
    private String startPoint;
    private String endPoint;
    private double effortCoeff;
    private Timestamp time;
    private String description;
    private boolean solved;

    public RemarkablePath(String startPoint, String endPoint, double effortCoeff, Timestamp time, String description)
    {
        this.setStartPoint(startPoint);
        this.setEndPoint(endPoint);
        this.setEffortCoeff(effortCoeff);
        this.setTime(time);
        this.setDescription(description);
        this.setSolved(false);
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public double getEffortCoeff() {
        return effortCoeff;
    }

    public void setEffortCoeff(double effortCoeff) {
        this.effortCoeff = effortCoeff;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }

    public void solved(){
        this.setSolved(true);
    }
}
