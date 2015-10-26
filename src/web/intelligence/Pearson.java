
package web.intelligence;

import java.util.Vector;


public class Pearson {

    /**
     * Calculate the Pearson correlation coefficient of two lists, X and Y.
     *
     * @param X original human relatedness values
     * @param Y metric relatedness values
     *
     * @return measure of correlation between the two lists
     */
    public static double GetCorrelation(Vector<Double> xVect, Vector<Double> yVect) {
        double meanX = 0.0, meanY = 0.0;
        for (int i = 0; i < xVect.size(); i++) {
            meanX += xVect.elementAt(i);
            meanY += yVect.elementAt(i);
        }

        meanX /= xVect.size();
        meanY /= yVect.size();

        double sumXY = 0.0, sumX2 = 0.0, sumY2 = 0.0;
        for (int i = 0; i < xVect.size(); i++) {
            sumXY += ((xVect.elementAt(i) - meanX) * (yVect.elementAt(i) - meanY));
            sumX2 += Math.pow(xVect.elementAt(i) - meanX, 2.0);
            sumY2 += Math.pow(yVect.elementAt(i) - meanY, 2.0);
        }

        return (sumXY / (Math.sqrt(sumX2) * Math.sqrt(sumY2)));
    }//end: GetCorrelation(X,Y)
}
