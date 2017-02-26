package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.GroupCharacteristic;

@XmlRootElement(name = "GroupCharacteristicRefElement")
public class GroupCharacteristicRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public GroupCharacteristic createInstance() {
		return FhirFactory.eINSTANCE.createGroupCharacteristic();
	}
	
	public static GroupCharacteristicRef valueOf(String id) {
		GroupCharacteristicRef result = new GroupCharacteristicRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}