package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.AContent;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "AContentRefElement")
public class AContentRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public AContent createInstance() {
		return XhtmlFactory.eINSTANCE.createAContent();
	}
	
	public static AContentRef valueOf(String id) {
		AContentRef result = new AContentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}