/*
 * Mercury.java
 *
 * "Manufacturing Java Objects with the Factory Method Design Pattern"
 * Published August 14, 2006
 * Java Boutique
 * http://javaboutique.internet.com/tutorials/factory/
 *
 * Barry A. Burd and Michael P. Redlich
 */

package org.redlich.factory;

public class Mercury extends Car {
	public Mercury(String type) {
		make = "Mercury";
		model = type;
		manufacturer = "Ford";
		}
	}
