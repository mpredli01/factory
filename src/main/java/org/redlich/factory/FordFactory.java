/*
 * FordFactory.java
 *
 * "Manufacturing Java Objects with the Factory Method Design Pattern"
 * Published August 14, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/factory/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.factory;

public class FordFactory extends CarFactory {
	Car createCar(String model) {
		if(model.equals("Fusion"))
			return new Ford(model);
		else if(model.equals("Mark IV"))
			return new Mercury(model);
		else
			return null;
		}
	}
