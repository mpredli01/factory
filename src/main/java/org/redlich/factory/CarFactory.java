/*
 * CarFactory.java
 *
 * "Manufacturing Java Objects with the Factory Method Design Pattern"
 * Published August 14, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/factory/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.factory;

public abstract class CarFactory {
	abstract Car createCar(String model);

	public Car orderCar(String make,String model) {
		Car car = createCar(model);
		System.out.println("--- Fulfilling the order for a " + car.getMake() + " " + car.getModel() + " ---");
		car.buildCar();
		car.testCar();
		car.shipCar();
		System.out.println();
		return car;
		}
	}
