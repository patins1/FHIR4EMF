package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.Flow;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "FlowRefElement")
public class FlowRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	

	
	@Override
	public Flow createInstance() {
		return XhtmlFactory.eINSTANCE.createFlow();
	}
	
	public static FlowRef valueOf(String id) {
		FlowRef result = new FlowRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}