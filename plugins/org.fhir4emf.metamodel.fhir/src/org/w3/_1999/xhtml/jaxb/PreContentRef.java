package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.PreContent;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "PreContentRefElement")
public class PreContentRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public PreContent createInstance() {
		return XhtmlFactory.eINSTANCE.createPreContent();
	}
	
	public static PreContentRef valueOf(String id) {
		PreContentRef result = new PreContentRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}