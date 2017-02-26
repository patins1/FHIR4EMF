/**
 * Copyright (c) 2017 Joerg Kiegeland
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.fhir4emf.rest;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jqvt.runtime.EMFJQVTEngine;
import org.fhir4emf.rest.gen.Transformation;
import org.raas4emf.cms.core.Activator;
import org.raas4emf.cms.core.ReflectiveQVTServiceHandler;

import fhirrest.FhirrestPackage;
import raascms.Artifact;
import raascms.Folder;

public class FhirServiceHandler extends ReflectiveQVTServiceHandler {

	protected EClass findEClass(String requestedClass) {
		return (EClass) FhirrestPackage.eINSTANCE.getEClassifier(requestedClass);
	}

	protected void executeSpecificQVTTransformation(final EMFJQVTEngine testTrafo, List<Object> targetModel) throws IllegalAccessException, InvocationTargetException, IOException {
		Transformation transformation = new Transformation() {
			@Override
			public <T> T create(Class<T> c) {
				T result = testTrafo.createInstanceRef(c);
				return result;
			}
		};
		testTrafo.execute(transformation, new ArrayList<Object>(), targetModel);

		List<Integer> sortedFailures = new ArrayList<Integer>(transformation.failures.keySet());
		Collections.sort(sortedFailures);
		for (int ii : sortedFailures) {
			if (!transformation.successes.keySet().contains(ii)) {
				Activator.err("Clause " + ii + " never successful (" + transformation.failures.get(ii) + " failures)");
			}
		}
	}

	@Override
	protected String getRootPathForFoldersAndArtifacts() {
		return "RepositoryRoot/FHIRResources";
	}

	@SuppressWarnings("unchecked")
	@Override
	protected <T> List<T> getInstancesFor(EObject request, List<Artifact> allArtifacts, List<Folder> allFolders, Class<T> clazz) {
		return super.getInstancesFor(request, allArtifacts, allFolders, clazz);
	}

}