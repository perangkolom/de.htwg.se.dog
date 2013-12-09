package de.htwg.se.dog.models;

public interface FigureInterface<V> {
    /**
     * returns the owner of this figure
     * 
     * @return reference to the owner of the figure
     */
    V getOwner();

    /**
     * returns the PlayerNr of the owner
     * 
     * @return
     */
    int getOwnerNr();

    /**
     * returns the figurenum
     * 
     * @return returns the Figurenumber
     */
    int getFignr();
}