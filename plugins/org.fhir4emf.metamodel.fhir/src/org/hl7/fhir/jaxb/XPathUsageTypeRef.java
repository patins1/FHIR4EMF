package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.XPathUsageType;

@XmlRootElement(name = "XPathUsageTypeRefElement")
public class XPathUsageTypeRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public XPathUsageType createInstance() {
		return FhirFactory.eINSTANCE.createXPathUsageType();
	}
	
	public static XPathUsageTypeRef valueOf(String id) {
		XPathUsageTypeRef result = new XPathUsageTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}