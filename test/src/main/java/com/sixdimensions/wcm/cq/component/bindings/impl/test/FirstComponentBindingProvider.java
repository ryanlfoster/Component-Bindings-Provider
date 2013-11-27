/*
 * Copyright 2013 - Six Dimensions
 * All Rights Reserved 
 */
package com.sixdimensions.wcm.cq.component.bindings.impl.test;

import javax.script.Bindings;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;

import com.sixdimensions.wcm.cq.component.bindings.CQVariables;
import com.sixdimensions.wcm.cq.component.bindings.ComponentBindingsProvider;

/**
 * 
 * @author dklco
 *
 */
@Component
@Service
@Properties({
		@Property(name = ComponentBindingsProvider.RESOURCE_TYPE_PROP, value = "test/bindings/order"),
		@Property(name = ComponentBindingsProvider.PRIORITY, intValue = 1) })
public class FirstComponentBindingProvider implements
		ComponentBindingsProvider {

	@Override
	public void addBindings(CQVariables variables, Bindings bindings) {
		bindings.put("message", "First");
		bindings.put("message2", "Third");
	}
}
