package com.devsuperior.dslits.dto;

public class ReplacementDTO {

    private int sourceIndex;
    private int destinationIndex;

    public int getSourceIndex() {
        return sourceIndex;
    }

    public void setSourceIndex(int sourceIndex) {
        this.sourceIndex = sourceIndex;
    }

    public int getDestinationIndex() {
        return destinationIndex;
    }

    public void setDestinationIndex(int destinationIndex) {
        this.destinationIndex = destinationIndex;
    }

    @Override
    public String toString() {
        return "ReplacementDTO{" +
                "sourceIndex=" + sourceIndex +
                ", destinationIndex=" + destinationIndex +
                '}';
    }
}