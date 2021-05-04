/*
 * Car.java
 *
 * "Manufacturing Java Objects with the Factory Method Design Pattern"
 * Published August 14, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/factory/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.factory;

public abstract class Car {
	String make;
	String model;
	String manufacturer;

	void buildCar() {
		System.out.println("Building the " + getMake() + " " + getModel() + " at the " + getManufacturer() + " factory...");
		}

	void testCar() {
		System.out.println("Testing the " + getMake() + " " + getModel() + " at the " + getManufacturer() + " test track...");
		}

	void shipCar() {
		System.out.println("Shipping the " + getMake() + " " + getModel() + " at the " + getMake() + " dealership...");
		}

	public String getMake() {
		return make;
		}

	public String getModel() {
		return model;
		}

	public String getManufacturer() {
		return manufacturer;
		}
	}
