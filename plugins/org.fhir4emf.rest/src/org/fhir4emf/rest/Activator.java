/**
 * Copyright (c) 2017 Joerg Kiegeland
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.fhir4emf.rest;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.osgi.framework.BundleContext;

import ca.uhn.fhir.context.FhirContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.fhir4emf.rest"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		final String restUri = System.getProperty("CALLBACK_URL");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	public static void log(String msg) {
		getDefault().getLog().log(new Status(Status.OK, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));
	}

	public static void info(String msg) {
		if (getDefault() == null)
			System.out.println(msg);
		else
			getDefault().getLog().log(new Status(Status.INFO, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));
	}

	public static void err(String msg) {
		if (getDefault() == null)
			System.err.println(msg);
		else
			getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, msg, null));
	}

	public static void err(String msg, Throwable e) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, msg, e));
	}

	public static void err(Throwable e) {
		getDefault().getLog().log(new Status(Status.ERROR, getDefault().getBundle().getSymbolicName(), Status.OK, e.getMessage(), e));
	}

	public static IBaseResource readHAPI(String type, String content, String filename) {
		FhirContext ctx = FhirContext.forDstu2();
		IBaseResource o;
		if (filename.toLowerCase().endsWith("xml"))
			o = ctx.newXmlParser().parseResource(content);
		else
			o = ctx.newJsonParser().parseResource(content);
		return o;
	}

	public static String writeHAPIXML(IBaseResource object) {
		FhirContext ctx = FhirContext.forDstu2();
		String result = ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(object);
		return result;
	}

	public static String writeHAPIJSON(IBaseResource object) {
		FhirContext ctx = FhirContext.forDstu2();
		String result = ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(object);
		return result;
	}

	public static String writeIG(IBaseResource object) {
		// try {
		// Publisher.main(new String[] {});
		// } catch (Exception e) {
		// e.printStackTrace();
		// }
		return "TODO";
	}
}
