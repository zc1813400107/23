package com.lh.pattern.create_type.abstract_factory;

import com.lh.pattern.create_type.simple_factory.Audi;
import com.lh.pattern.create_type.simple_factory.Car;

public class AudiFactory extends AbstractFactory {

	@Override
	Car getCar() {
		// TODO Auto-generated method stub
		return new Audi();
	}

}
