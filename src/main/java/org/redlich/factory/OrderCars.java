/*
 * OrderCars.java
 *
 * "Manufacturing Java Objects with the Factory Method Design Pattern"
 * Published August 14, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/factory/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.factory;

public class OrderCars {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("*--------------------------*");
		System.out.println("* Car Ordering Application *");
		System.out.println("*--------------------------*");
		System.out.println();

		CarFactory gmfactory = new GeneralMotorsFactory();
		CarFactory fordfactory = new FordFactory();

		Car car = gmfactory.orderCar("Pontiac","GTO");
		car = fordfactory.orderCar("Mercury","Mark IV");
		car = gmfactory.orderCar("Saturn","Vue");
		car = fordfactory.orderCar("Ford","Fusion");
		car = gmfactory.orderCar("Chevrolet","Corvette");
		car = gmfactory.orderCar("Buick","Lucerne");
		}
	}
