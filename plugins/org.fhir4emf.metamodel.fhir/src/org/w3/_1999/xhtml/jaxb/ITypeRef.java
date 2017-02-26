package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.IType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "ITypeRefElement")
public class ITypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
	private String id;

	@XmlValue
	@Override
	public String getID() {
		return id;
	}

	@Override
	public void setID(String id) {
		this.id = id;
	}
	

	
	@Override
	public IType createInstance() {
		return XhtmlFactory.eINSTANCE.createIType();
	}
	
	public static ITypeRef valueOf(String id) {
		ITypeRef result = new ITypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}