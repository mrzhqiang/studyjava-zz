package com.github.youkuanzeng.rectangle;

public class Rectangle {
	double length;
	double brief;
	// 无参构造方法对于矩形来说，是不存在的。你能想象矩形创建出来就是固定的长和宽吗？
	// 当然需要创建它的人，来指定长宽，所以必定是有参构造方法
	//意思是下面这个都可以删掉,无参构造之后用this可以调用有参，那么无参在用了this之后是否跟有参的效果一样了？
	// 首先，不同的构造方法，比如有参数，无参数，从名字上来看，就是为了初始化方便而已。
	// 在无参构造方法中，this(参数,参数)，这样是可以的，也跟new (参数,参数)的效果一样。
	// java程序是很自由的，设计都特别宽松，但所有的规范和原则，都是为了方便开发者开发和维护代码，所以看你怎么方便怎么用了。
	//好吧，这个是不影响的，只是看谁方便就用谁。
	// 处理一下 下面的错误
	// run？？？
	public Rectangle() {
		length  = 1;
		brief = 2;
	}
	// 这个构造方法，传参进来，所以不需要无参构造方法
	public Rectangle(double length, double brief) {
		this.length = length;
		this.brief = brief;
	}
	public double getArea() {
		return length*brief;
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		System.out.println(r1.getArea());
		Rectangle r2 = new Rectangle(100, 1000);
		System.out.println(r2.getArea());
		// 完成了，有什么想法？在前面我给的初始化有木有问题
		// 有啊，你的构造方法，初始化，没有必要啊，还一直在里面计算面积，返回结果。都说了是其他方法返回结果。
	}
}
