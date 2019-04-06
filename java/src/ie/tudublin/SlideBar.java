package ie.tudublin;

import processing.core.PApplet;

public class SlideBar extends UIElement
{
    private float distance;
    private float length;
    private float linex;
    private float liney;
    private boolean sliding;
    
    public SlideBar(float x, float y, PApplet ui, float distance, float length)
    {
        super(x, y, ui);
        this.distance = distance;
        this.length = length;
        this.linex = x;
        this.liney = y;
        this.sliding = false;
    }

    public void render()
    {
        ui.strokeWeight(4);
        ui.fill(255,255,0);
        ui.line(linex + length/2,liney, x + length/2, liney + distance);
        ui.strokeWeight(1);
        ui.fill(0,255,255);
        ui.rect(x,y,length,length/2);
        ui.fill(0,255,0);
        ui.line(x,y + length/4, x + length, y + length/4);

    }

    /**
     * @return the distance
     */
    public float getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(float distance) {
        this.distance = distance;
    }

    /**
     * @return the length
     */
    public float getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(float length) {
        this.length = length;
    }

    /**
     * @return the linex
     */
    public float getLinex() {
        return linex;
    }

    /**
     * @param linex the linex to set
     */
    public void setLinex(float linex) {
        this.linex = linex;
    }

    /**
     * @return the liney
     */
    public float getLiney() {
        return liney;
    }

    /**
     * @param liney the liney to set
     */
    public void setLiney(float liney) {
        this.liney = liney;
    }

    /**
     * @return the sliding
     */
    public boolean isSliding() {
        return sliding;
    }

    /**
     * @param sliding the sliding to set
     */
    public void setSliding(boolean sliding) {
        this.sliding = sliding;
    }
}