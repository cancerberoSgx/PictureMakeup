package org.sgx.picturemakeup.model;

import java.awt.image.BufferedImage;


public abstract class ImageTransformation extends AbstractPropertyHaver{

	public abstract BufferedImage applyTransformation(BufferedImage src);
	
	public abstract String shortDescription();
	
}
