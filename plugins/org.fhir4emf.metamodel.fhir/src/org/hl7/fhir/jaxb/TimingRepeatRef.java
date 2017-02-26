package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.TimingRepeat;

@XmlRootElement(name = "TimingRepeatRefElement")
public class TimingRepeatRef extends org.hl7.fhir.jaxb.ElementRef  {

	

	
	@Override
	public TimingRepeat createInstance() {
		return FhirFactory.eINSTANCE.createTimingRepeat();
	}
	
	public static TimingRepeatRef valueOf(String id) {
		TimingRepeatRef result = new TimingRepeatRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}