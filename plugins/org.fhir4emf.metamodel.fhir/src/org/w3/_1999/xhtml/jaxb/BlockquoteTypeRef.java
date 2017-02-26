package org.w3._1999.xhtml.jaxb;

import javax.xml.bind.annotation.*;
import org.eclipse.emf.ecore.jaxb.*;

import org.w3._1999.xhtml.BlockquoteType;
import org.w3._1999.xhtml.XhtmlFactory;

@XmlRootElement(name = "BlockquoteTypeRefElement")
public class BlockquoteTypeRef extends org.w3._1999.xhtml.jaxb.BlockRef  {

	
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
	public BlockquoteType createInstance() {
		return XhtmlFactory.eINSTANCE.createBlockquoteType();
	}
	
	public static BlockquoteTypeRef valueOf(String id) {
		BlockquoteTypeRef result = new BlockquoteTypeRef();
		result.setID(id);
		return result;
	}

	@Override
	public String toString() {
		return getID();
	}
	

}