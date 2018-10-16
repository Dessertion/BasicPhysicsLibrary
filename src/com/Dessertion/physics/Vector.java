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
     * @param x X component value
     * @param y Y component value
     */
    public Vector(double x, double y) {
	this.x=x;
	this.y=y;
	this.z=0;
    }
    
    /*
     * Vector constructor with all 3 components
     * @param x X component value
     * @param y Y component value
     * @param z Z component value
     */
    public Vector(double x, double y, double z) {
	this.x=x;
	this.y=y;
	this.z=z;
    }
    
    /*
     * Returns vector X component
     * @return X value
     */
    public double getX() {
	return x;
    }
    
    /*
     * Returns vector Y component
     * @return Y value
     */
    public double getY() {
	return y;
    }
    
    /*
     * Returns vector z component
     * @return Z value
     */
    public double getZ() {
	return z;
    }
    
    /*
     * Sets vector x component to given value
     * @param X value to be set
     */
    public void setX(double x) {
	this.x=x;
    }
    
    /*
     * Sets vector y component to given value
     * @param y Y value to be set
     */
    public void setY(double y) {
	this.y=y;
    }
    
    /*
     * Sets vector z component to given value
     * @param z Z value to be set
     */
    public void setZ(double z) {
	this.z=z;
    }
    
    /*
     * Returns The square of the magnitude (maybe to avoid unnecessary rounding)
     * @return The square of the magnitude 
     */
    public double getMagnitudeSquared() {
	return x*x+y*y+z*z;
    }
    
    /*
     * Returns the magnitude of the vector
     * @return Vector magnitude
     */
    public double getMagnitude() {
	return Math.sqrt(getMagnitudeSquared());
    }
    
    /*
     * Adds another vector to this vector
     * @param v Vector to be added
     */
    public void add(Vector v) {
	this.x+=v.x;
	this.y+=v.y;
	this.z+=v.z;
    }
    
    /*
     * Adds given components to this vector
     * @param x X component
     * @param y Y component
     * @param z Z component
     */
    public void add(double x, double y, double z) {
	this.x+=x;
	this.y+=y;
	this.z+=z;
    }
    
    /*
     * Subtracts another vector from this vector
     * @param v Vector to be subtracted
     */
    public void subtract(Vector v) {
	this.x-=v.x;
	this.y-=v.y;
	this.z-=v.z;
    }
    
    /*
     * Subtracts given components from this vector
     * @param x X component
     * @param y Y component
     * @param z Z component
     */
    public void subtract(double x, double y, double z) {
	this.x-=x;
	this.y-=y;
	this.z-=z;
    }
    
    /*
     * Multiplies this vector by a scalar 
     * @param m Scalar value
     */
    public void multiply(double m) {
	this.x*=m;
	this.y*=m;
	this.z*=m;
    }
    
    /*
     * Returns the dot product of this vector and another given vector
     * @param v The given vector
     * @return The dot product value
     */
    public double dot(Vector v) {
	return this.x*v.x+this.y*v.y+this.z*v.z;
    }
    
    /*	
     * Returns the dot product of two vectors (dot product is commutative)
     * @param v1 The first vector
     * @param v2 The second vector
     * @return The dot product
     */
    public static double dot(Vector v1, Vector v2) {
	return v1.x*v2.x+v1.y*v2.y+v1.z*v2.z;
    }
    
    /*
     * Returns the cross product of this vector and another vector 
     * @param v The given vector
     * @return The vector cross product
     */
    public Vector cross(Vector v) {
	return new Vector(this.y*v.z-this.z*v.y,this.z*v.x-this.x*v.z,this.x*v.y-this.y*v.x);
    }
    
    /*
     * Returns the cross product of two vectors (cross product is not commutative)
     * @param v1 The first vector
     * @param v2 The second vector
     * @return The vector cross product
     */
    public static Vector cross(Vector v1, Vector v2) {
	return new Vector(v1.y*v2.z-v1.z*v2.y,v1.z*v2.x-v1.x*v2.z,v1.x*v2.y-v1.y*v2.x);
    }
    
    /*
     * Normalizes this vector
     */
    public void normalize() {
	this.multiply(Math.sqrt(1/getMagnitude()));
    }
    
}
