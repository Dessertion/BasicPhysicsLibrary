package com.Dessertion.physics;

public class Vector {
    private double x,y,z;
    
    
    /*
     * Default constructor for vectors; initializes all components to 0
     */
    public Vector() {
	this.x=0;
	this.y=0;
	this.z=0;
    }
    
    /*
     * Constructor for x and y; initializes z to 0
     * @param x x component value
     * @param y y component value
     */
    public Vector(double x, double y) {
	this.x=x;
	this.y=y;
	this.z=0;
    }
    
    /*
     * Vector constructor with all 3 components
     * @param x x component value
     * @param y y component value
     * @param z z component value
     */
    public Vector(double x, double y, double z) {
	this.x=x;
	this.y=y;
	this.z=z;
    }
    
    /*
     * Returns vector X component
     * @return X component value
     */
    public double getX() {
	return x;
    }
    
    public double getY() {
	return y;
    }
    
    public double getZ() {
	return z;
    }
    
    public double getMagnitudeSquared() {
	return x*x+y*y+z*z;
    }
    
    public double getMagnitude() {
	return Math.sqrt(getMagnitudeSquared());
    }
    
    public void add(Vector v) {
	this.x+=v.x;
	this.y+=v.y;
	this.z+=v.z;
    }
    
    public void add(double x, double y, double z) {
	this.x+=x;
	this.y+=y;
	this.z+=z;
    }
    
    public void subtract(Vector v) {
	this.x-=v.x;
	this.y-=v.y;
	this.z-=v.z;
    }
    
    public void subtract(double x, double y, double z) {
	this.x-=x;
	this.y-=y;
	this.z-=z;
    }
    
    public void multiply(double m) {
	this.x*=m;
	this.y*=m;
	this.z*=m;
    }
    
    public double dot(Vector v) {
	return this.x*v.x+this.y*v.y+this.z*v.z;
    }
    
    public static double dot(Vector v1, Vector v2) {
	return v1.x*v2.x+v1.y*v2.y+v1.z*v2.z;
    }
    
    public Vector cross(Vector v) {
	return new Vector(this.y*v.z-this.z*v.y,this.z*v.x-this.x*v.z,this.x*v.y-this.y*v.x);
    }
    
    public static Vector cross(Vector v1, Vector v2) {
	return new Vector(v1.y*v2.z-v1.z*v2.y,v1.z*v2.x-v1.x*v2.z,v1.x*v2.y-v1.y*v2.x);
    }

    public void normalize() {
	this.multiply(Math.sqrt(1/getMagnitude()));
    }
    
}
