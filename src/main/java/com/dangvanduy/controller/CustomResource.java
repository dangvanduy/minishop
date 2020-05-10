package com.dangvanduy.controller;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomResource implements ResourceLoaderAware{
	ResourceLoader resource;
	public void setResourceLoader(ResourceLoader resourceLoader) {
		
		resource =resourceLoader;
	}
	public Resource getResource(String url) {
		return resource.getResource(url);
	}

}
