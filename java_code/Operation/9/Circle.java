class Circle {
double radius;
Circle(double r) // 构造方法
{ radius = r; }
double Area() // 圆面积
{
	return 3.14 * radius * radius;
}
double length() // 圆周长
{
	return 2 * 3.14 * radius;
}
}
