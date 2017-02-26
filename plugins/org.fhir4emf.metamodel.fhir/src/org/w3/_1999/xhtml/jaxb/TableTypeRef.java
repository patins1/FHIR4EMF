package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.TableType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "TableTypeRefElement")
public class TableTypeRef extends org.eclipse.emf.ecore.jaxb.EObjectRef  {

	
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
	public TableType createInstance() {
		return XhtmlFactory.eINSTANCE.createTableType();
	}
	
	public static TableTypeRef valueOf(String id) {
		TableTypeRef result = new TableTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}