package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.LiType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "LiTypeRefElement")
public class LiTypeRef extends org.w3._1999.xhtml.jaxb.FlowRef  {

	
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
	public LiType createInstance() {
		return XhtmlFactory.eINSTANCE.createLiType();
	}
	
	public static LiTypeRef valueOf(String id) {
		LiTypeRef result = new LiTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}