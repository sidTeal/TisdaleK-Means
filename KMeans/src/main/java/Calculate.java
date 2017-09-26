import java.util.ArrayList;

/*
 * ***************************************************
 * Class Name: Calculate 
 * Author: Chris Tisdale
 * **************************************************** 
 * Purpose of the class:
 * This class provides calculation functionality for this project. It has
 * methods that allow it to perform and return different calculations.
 * **************************************************** 
 * September 11, 2017
 * *****************************************************
 */
public class Calculate {

    /*
     * ***************************************************
     * Method Name: calcDistance 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: calculate Euclidean distance between two points
     * Method parameters: double x1, double y1, double x2, double y2 
     * Return value: double
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public double calcDistance(double x1, double y1, double x2, double y2) {
        double answer = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        return answer;
    }

    /*
     * ***************************************************
     * Method Name: normalize 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: Normalizes the list of double to values between 0 and 1.
     *     It subtracts the min value from each number in the list, then it divides 
     *      each number by the max value in the list
     * Method parameters: ArrayList<Double> listToNormalize
     * Return value: double
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    public ArrayList<Double> normalize(ArrayList<Double> listToNormalize) {
        ArrayList<Double> normalizedList = new ArrayList<>(listToNormalize);
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        // find min value in list
        for (Double num : normalizedList) {
            if (num < min) {
                min = num;
            }
        }

        // subtract min value from each number in list
        for (int i = 0; i < normalizedList.size(); i++) {
            double temp = normalizedList.get(i) - min;
            normalizedList.set(i, temp);
        }

        // find max value in list
        for (Double num : normalizedList) {
            if (num > max) {
                max = num;
            }
        }

        // divide max value from each number in list
        // format this to 4 decimal places
        for (int i = 0; i < normalizedList.size(); i++) {
            double temp = normalizedList.get(i) / max;
            temp = (double) Math.round(temp * 10000) / 10000;
            normalizedList.set(i, temp);
        }

        return normalizedList;
    }

    /*
     * ***************************************************
     * Method Name: calculateAverage 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: return average of two doubles
     * Method parameters: double num1, double num2
     * Return value: double
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    double calculateAverage(double num1, double num2) {
        double average = (num1 + num2) / 2;
        return average;
    }

    /*
     * ***************************************************
     * Method Name: calculateMean 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: return mean from array list
     * Method parameters: ArrayList<Double> list
     * Return value: double
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    double calculateMean(ArrayList<Double> list) {
        double mean;
        double sum = 0;
        int inputs = 0;

        for (Double number : list) {
            sum += number;
            inputs++;
        }

        mean = sum / inputs;
        return mean;
    }

    /*
     * ***************************************************
     * Method Name: calculateStandardDeviation 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: return standard deviation from array list
     * Method parameters: ArrayList<Double> list, double listMean
     * Return value: double
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    double calculateStandardDeviation(ArrayList<Double> list, double listMean) {
        double mean = listMean;
        double squaredSum = 0;
        int inputs = 0;
        double standardDeviation;

        // get squared sum after subtracting mean from each number
        for (Double number : list) {
            squaredSum += Math.pow((number - mean), 2);
            inputs++;
        }

        // get square root of the squared sum divided by number of inputs
        standardDeviation = Math.sqrt(squaredSum / inputs);

        return standardDeviation;
    }

    /*
     * ***************************************************
     * Method Name: getZScoreList 
     * Author: Chris Tisdale
     * ***************************************************** 
     * Purpose of the Method: return Z score from array list
     * Method parameters: ArrayList<Double> list, double listMean, double listStandardDeviation
     * Return value: double
     * ***************************************************** 
     * Date: September 11, 2017
     * ****************************************************
     */
    ArrayList getZScoreList(ArrayList<Double> list, double listMean, double listStandardDeviation) {
        double zScore;
        double mean = listMean;
        double standardDeviation = listStandardDeviation;
        ArrayList<Double> answer = new ArrayList<>();

        for (Double number : list) {
            zScore = (number - mean) / standardDeviation;
            answer.add(zScore);
        }
        return answer;
    }

}
