package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GuidePageKind;

@XmlRootElement(name = "GuidePageKindRefElement")
public class GuidePageKindRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public GuidePageKind createInstance() {
		return FhirFactory.eINSTANCE.createGuidePageKind();
	}
	
	public static GuidePageKindRef valueOf(String id) {
		GuidePageKindRef result = new GuidePageKindRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}