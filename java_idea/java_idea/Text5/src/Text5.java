/**
 * 类Tax描述出租车类，成员s、k与p分别表示起车价格、行驶公里数和每公里单价，
 * 其中成员函数count用于计算乘客使用出租车的费用；
 * 使用出租车的费用=起车价格+（公里数-2.5）*单价。
 * 类J描述学生成绩类，成员m、c和e分别表示数学、语文和英语成绩，
 * num表示学号，name表示姓名，其中成员方法count用于计算学生的数学、语文和英语的平均成绩，
 * 请通过抽象类K的抽象方法count实现某次使用出租车的费用和某个学生平均成绩的计算，写出主类的实现。
 */

public class Text5 {
    public static void main(String[] args) {
        K k = new Tax(10, 13.5, 5);
        System.out.println("出租车费用：" + k.count());
        k=new J(102,130,72);
        System.out.println("平均成绩：" + k.count());
    }
}

