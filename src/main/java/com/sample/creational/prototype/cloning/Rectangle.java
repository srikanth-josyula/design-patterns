package com.sample.creational.prototype.cloning;

public class Rectangle implements Cloneable{
    private int width;
    private int height;
  
    public Rectangle(int w, int h){
        width = w;
        height = h;
    }
    

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }


    public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
  
    //Comment this we get diff value
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rectangle other = (Rectangle) obj;
        if (this.width != other.width) {
            return false;
        }
        if (this.height != other.height) {
            return false;
        }
        return true;
    }


}