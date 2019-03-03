import java.awt.image.BufferedImage;  
public abstract class FlyingObject {
protected int x;
protected int y;
protected int width;
protected int height;
protected BufferedImage image;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHight() {
	return height;
}
public void setHight(int hight) {
	this.height = hight;
}
public BufferedImage getImage() {
	return image;
}
public void setImage(BufferedImage image) {
	this.image = image;
}
public abstract boolean outOfBounds();  
/*
 检查飞行物是否出界
 */
public abstract void step();  
/*
 前进一步
 */
public boolean shootBy(Bullet bullet) {
	int x1=bullet.x;
	int y1=bullet.y;
	return (this.x<x1&&x1<this.x+width&&this.y<y1&&y1<this.y+height);
}
}
