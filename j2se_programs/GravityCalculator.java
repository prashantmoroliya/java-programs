// Compute the position of a falling object: x(t) = 0.5 × at^2 + v(i)t + x(i)

public class GravityCalculator {
    public static void main(String[] args) {
        double gravity = -9.8;          // It is falling so it is negative.
        double initialVelocity = 0.0;   // we assume that initial velocity is zero.
        double fallingTime = 10.0;      // It is static data so we took falling time of the object as 10 seconds.
        double initialPosition = 0.0;   // We took the the object is at zero when the object is just about to fall.

        //Final position is calculated by the formula as 0.5*a*t^2 + v*t + finalPosition --> where a is gravity, t is fallingTime and v is initial velocity.
        double finalPosition = 0.5*gravity*fallingTime*fallingTime;
        finalPosition += (initialVelocity*fallingTime); // can also be written as finalPosition = finalPosition + initialVelocity * fallingTime.
        finalPosition += initialPosition;               // can also written as finalPosition = finalPosition + initialPosition.
        /*
         * We calculated final position in three steps here.
         */

         System.out.println("An object's position after "+fallingTime+" seconds is "+finalPosition+" m.");
    }
}

/*
 * OUTPUT should be....
 * --------------------------------------------------------------------
 * An object's position after 10.0 seconds is -490.0 m.
 */
