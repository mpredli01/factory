/*
 * GeneralMotorsFactory.java
 *
 * "Manufacturing Java Objects with the Factory Method Design Pattern"
 * Published August 14, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/factory/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.factory;

public class GeneralMotorsFactory extends CarFactory {
	Car createCar(String model) {
		if(model.equals("Lucerne"))
			return new Buick(model);
		else if(model.equals("Corvette"))
			return new Chevrolet(model);
		else if(model.equals("GTO"))
			return new Pontiac(model);
		else if(model.equals("Vue"))
			return new Saturn(model);
		else
			return null;
		}
	}
