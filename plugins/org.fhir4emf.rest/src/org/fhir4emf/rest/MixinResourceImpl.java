/**
 * Copyright (c) 2017 Joerg Kiegeland
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.fhir4emf.rest;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(property = "resourceType", include = JsonTypeInfo.As.EXTERNAL_PROPERTY, use = JsonTypeInfo.Id.NAME)
public interface MixinResourceImpl {

}
