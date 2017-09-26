/*
 * ***************************************************
 * Class Name: State 
 * Author: Chris Tisdale
 * **************************************************** 
 * Purpose of the class:
 * This class defines the State object through private field variables
 *      and corresponding getter and setter methods.
 * **************************************************** 
 * September 11, 2017
 * *****************************************************
 */
public final class State {
    private String name;
    private double x_degreeAndIncome;
    private double y_crimeRate;
    private int cluster;
    private double distanceToCluster;
    
    /*
     * ***************************************************
     * Constructor: State 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose: instantiate State object with passed arguments.
     * Constructor parameters: String name, double x_degreeAndIncome, double y_crimeRate
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    State(String name, double x_degreeAndIncome, double y_crimeRate) {
        setName(name);
        setX(x_degreeAndIncome);
        setY(y_crimeRate);
    }
    
    /*
     * ***************************************************
     * Method Name: setName 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: sets name of State
     * Method parameters: String name
     * Return value: void
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /*
     * ***************************************************
     * Method Name: getName 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: return name of State
     * Method parameters: none
     * Return value: String
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public String getName() {
        return name;
    }
    
    /*
     * ***************************************************
     * Method Name: setX 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: sets x coord (degree and income) of State
     * Method parameters: double x_degreeAndIncome
     * Return value: void
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public void setX (double x_degreeAndIncome) {
        this.x_degreeAndIncome = x_degreeAndIncome;
    }
    
    /*
     * ***************************************************
     * Method Name: getX 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: gets x coord of State
     * Method parameters: none
     * Return value: double
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public Double getX() {
       return x_degreeAndIncome;
    }
    
    /*
     * ***************************************************
     * Method Name: setY
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: sets y coord (crime rate) of State
     * Method parameters: double y_crimeRate
     * Return value: void
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public void setY(double y_crimeRate) {
        this.y_crimeRate = y_crimeRate;
    }
    
    /*
     * ***************************************************
     * Method Name: getY 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: gets y coord of State
     * Method parameters: none
     * Return value: double
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public Double getY() {
       return y_crimeRate;
    }
    
    /*
     * ***************************************************
     * Method Name: setCluster 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: sets cluster of State
     * Method parameters: int cluster
     * Return value: void
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public void setCluster(int cluster) {
        this.cluster = cluster;
    }
    
    /*
     * ***************************************************
     * Method Name: getCluster 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: gets cluster of State
     * Method parameters: none
     * Return value: int
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public int getCluster() {
       return cluster;
    }
    
    /*
     * ***************************************************
     * Method Name: setDistanceToCluster 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: sets distanceToCluster for State
     * Method parameters: double distanceToCluster
     * Return value: void
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public void setDistanceToCluster(double distanceToCluster) {
        this.distanceToCluster = distanceToCluster;
    }
    
    /*
     * ***************************************************
     * Method Name: getDistanceToCluster 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: gets distanceToCluster State
     * Method parameters: double
     * Return value: void
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public Double getDistanceToCluster() {
       return distanceToCluster;
    }
}
