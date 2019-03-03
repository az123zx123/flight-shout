
public class Bullet extends FlyingObject {
private int speed=5;
public Bullet(int x,int y) {
	this.x=x;
	this.y=y;
	this.image=ShootGame.bullet;
}
public void step() {
	this.y-=speed;
}
public boolean outOfBounds() {
	return this.y<-height;
}
}
