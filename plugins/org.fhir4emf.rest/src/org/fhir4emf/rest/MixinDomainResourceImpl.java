/**
 * Copyright (c) 2017 Joerg Kiegeland
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.fhir4emf.rest;

import java.util.List;

import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.impl.ResourceImpl;
import org.raas4emf.cms.core.JaxbBasedDeserializer;
import org.raas4emf.cms.core.JaxbBasedSerializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public interface MixinDomainResourceImpl {

	@JsonDeserialize(using = JaxbBasedDeserializer.class, contentAs = ResourceImpl.class)
	@JsonSerialize(using = JaxbBasedSerializer.class, contentAs = ResourceContainer.class)
	List<ResourceContainer> getContained();

}
