/**
 * Copyright (c) 2017 Joerg Kiegeland
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.fhir4emf.rest;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class RESTFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// nothing to do
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String uri = httpRequest.getRequestURI();
		if (uri.startsWith(httpRequest.getContextPath()))
			uri = uri.substring(httpRequest.getContextPath().length());
		String querySuffix = httpRequest.getQueryString() != null ? "&" + httpRequest.getQueryString() : "";

		Map<String, String> redirections = new HashMap<String, String>();
		redirections.put("/api/v1/session/create", "CreateSessionRequest");
		redirections.put("/api/v1/comment/get", "GetCommentsRequest");
		redirections.put("/api/v1/document/status", "DocumentInformationRequest");
		redirections.put("/api/v1/document/upload", "DocumentUploadRequest");
		if (redirections.containsKey(uri)) {
			String url = "/embedded?servicehandler=embeddedapi&request=" + redirections.get(uri) + querySuffix;
			request.getRequestDispatcher(url).forward(request, response);
			return;
		}

		if (uri.startsWith("/view/")) {
			String url;
			String session = uri.substring("/view/".length());
			if (!httpRequest.getQueryString().contains("servicehandler")) {
				// initial retrieval
				url = "/embedded?servicehandler=downloadServiceHandler&artifact=/plugin/org.raas4emf.embedded.ui/WebContent/embedded.html&session=" + session + querySuffix;
			} else {
				// loading relative resources
				url = "/embedded?" + httpRequest.getQueryString();
			}
			url = url.replace("&session=undefined", "&session=" + session);
			request.getRequestDispatcher(url).forward(request, response);
			return;
		}

		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// nothing to do
	}

}
