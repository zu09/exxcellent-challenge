package de.exxcellent.challenge.dataclasses;

/**
 * Interface unifies both of the tasks (Football and Weather) to a more abstract task:
 * Get the absolute "range" between two bounds.
 * This works for the temperature spread and the absolute goal difference.
 */
public interface RangeClass {

    int bound1();

    int bound2();

    default int absoulteDifference(){
        int diff = this.bound1() - this.bound2() ;
        //Remove sign if needed
        if(diff < 0) diff = - diff;
        return diff;
    }

}
