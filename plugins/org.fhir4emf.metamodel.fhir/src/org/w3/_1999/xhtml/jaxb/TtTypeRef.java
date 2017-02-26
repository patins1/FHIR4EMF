package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.TtType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "TtTypeRefElement")
public class TtTypeRef extends org.w3._1999.xhtml.jaxb.InlineRef  {

	
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
	public TtType createInstance() {
		return XhtmlFactory.eINSTANCE.createTtType();
	}
	
	public static TtTypeRef valueOf(String id) {
		TtTypeRef result = new TtTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}