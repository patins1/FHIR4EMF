/**
 * Copyright (c) 2017 Joerg Kiegeland
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.fhir4emf.rest;

import java.util.Arrays;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.ResourceContainer;
import org.hl7.fhir.impl.ResourceImpl;

public class ResourceContainerImplAdapter extends XmlAdapter<ResourceImpl, ResourceContainer> {

	@Override
	public ResourceContainer unmarshal(ResourceImpl v) throws Exception {
		ResourceContainer rc = FhirFactory.eINSTANCE.createResourceContainer();
		for (EStructuralFeature f : rc.eClass().getEAllStructuralFeatures()) {
			if (f.getEType().isInstance(v)) {
				rc.eSet(f, v);
				break;
			}
		}
		return rc;
	}

	@Override
	public ResourceImpl marshal(ResourceContainer v) throws Exception {
		TreeIterator<Object> it = EcoreUtil.getAllContents(Arrays.asList(v));
		while (it.hasNext()) {
			Object o = it.next();
			if (o instanceof ResourceImpl)
				return (ResourceImpl) o;
		}
		return null;
	}
}
