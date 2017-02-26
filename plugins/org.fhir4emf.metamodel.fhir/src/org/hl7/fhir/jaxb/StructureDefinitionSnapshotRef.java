package org.hl7.fhir.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.hl7.fhir.FhirFactory;
import org.hl7.fhir.StructureDefinitionSnapshot;

@XmlRootElement(name = "StructureDefinitionSnapshotRefElement")
public class StructureDefinitionSnapshotRef extends org.hl7.fhir.jaxb.BackboneElementRef  {

	

	
	@Override
	public StructureDefinitionSnapshot createInstance() {
		return FhirFactory.eINSTANCE.createStructureDefinitionSnapshot();
	}
	
	public static StructureDefinitionSnapshotRef valueOf(String id) {
		StructureDefinitionSnapshotRef result = new StructureDefinitionSnapshotRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}