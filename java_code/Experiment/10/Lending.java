package bookLending;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lending {
	//定义函数，用于判断日期是否合法
	static boolean judge (String str) {
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");//括号内为日期格式，y代表年份，M代表年份中的月份（为避免与小时中的分钟数m冲突，此处用M），d代表月份中的天数
		try {
			sd.setLenient(false);//此处指定日期/时间解析是否不严格，在true是不严格，false时为严格
			sd.parse(str);//从给定字符串的开始解析文本，以生成一个日期
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}
	public static void printBook(String[] names, int[] times, int[] sortBook, int number){
		int[] another = times.clone();//复制数组
		int i = 0;
		int max = another[0];//求出借出次数的最大值，用于设置循环条件
		for(int p = 0;p <= max;p ++){//从0至借出次数最大值，依次查询借出次数对应的书的下标，并存储在sortBook数组中
			for(int q = 0;q < number;q ++){//遍历次数数组，将符合条件的数组值的下标存储在sortBook数组中
				if(times[q] == p){
					sortBook[i++] = q;
				}
			}
		}
		System.out.println("序号\t" + "书名\t\t" + "借出次数");
		for(int x = (number-1);x >= 0;x --){//打印借出次数排行榜
			System.out.println((number-x) + "\t" + names[sortBook[x]] + "\t\t" + times[sortBook[x]]);
		}
		System.out.println("*************************");
	}
	public static int daysBetween(String smdate,String bdate) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			Calendar cal = Calendar.getInstance();
			cal.setTime(sdf.parse(smdate));
			long time1 = cal.getTimeInMillis();
			cal.setTime(sdf.parse(bdate));
			long time2 = cal.getTimeInMillis();
			long between_days=(time2-time1)/(1000*3600*24);
		return Integer.parseInt(String.valueOf(between_days));
		}

	public static void main(String[] args) {
		//定义数据主体：图书
		int[] states = new int[50];//状态,0：已借出，1：可借
		String[] names = new String[50];//名称
		String[] dates = new String[50];//借出日期,二维数组将年月日分别存储，便于计算日期
		int[] times = new int[50];//借出次数

		//初始化四个数据
		states[0] = 0;//第一本书已借出
		names[0] = "数据结构";
		dates[0] = "2018-7-1";//第一本书于2018年7月1日借出
		times[0] = 1;//第一本书已借出一次
		
		states[1] = 1;//第二本书未借出
		names[1] = "数据库";
		dates[1] = null;
		times[1] = 0;//第二本书还未借出过
		
		states[2] = 1;//第三本书未借出
		names[2] = "离散数学";
		dates[2] = null;
		times[2] = 0;//第三本书还未借出过
		
		states[3] = 1;//第四本书未借出
		names[3] = "编译原理";
		dates[3] = null;
		times[3] = 0;//第四本书还未借出过
		
		//搭建程序流程框架
		Scanner input = new Scanner(System.in);
		int num = -1;//用户输入0时返回主菜单，num在借阅操作后进行重新赋值
		boolean flag = false;//记录用户是否退出系统，true为退出，false为不退出
		System.out.println("欢迎使用图书借阅系统");
		
		do{
			System.out.println("---------------------");
			System.out.println("0.借出排行榜");
			System.out.println("1.新增图书");
			System.out.println("2.查看图书");
			System.out.println("3.删除图书");
			System.out.println("4.借出图书");
			System.out.println("5.归还图书");
			System.out.println("6.退出");
			System.out.println("---------------------");
			System.out.println("请选择：");
			int choose = input.nextInt();
			switch(choose){
			case 0:
				int number = 0;//初始化书目总数未0
				for(;names[number] != null;number ++){}//求出当前书目总数
				int[] sortBook = new int[number];
	            printBook(names,times,sortBook, number);//调用函数导出借出排行榜
				break;
			case 1:
				System.out.println("--->新增图书");
				int a = 0;
				for(;a < names.length;a ++){
					if(names[a] == null){
					System.out.print("请输入图书名称：");
				    names[a]= input.next();//录入书名
					System.out.println("\n" + "新增《" +names[a] +"》成功！");
					
					//将图书信息存入数组中
					states[a] = 1;
					times[a] = 0;
					dates[a] = null;
					break;
					}
				}
				if(a == 50){
					System.out.println("货架已满，增加失败");
				}
				System.out.println("*************************");
				break;
			case 2:
				System.out.println("--->查看图书");
				System.out.println("序号\t状态\t名称\t\t借出日期");
				for(int i = 0;names[i] != null;i ++){
					String situation = (states[i] == 0)?"已借出":"可借";
					System.out.print((i+1) + "\t" + situation + "\t《" + names[i] + "》\t");
					if(states[i] == 0){
						System.out.println(dates[i]);
					}else{
						System.out.println();
					}
				}
				System.out.println("*************************");
				break;
			case 3:
				System.out.println("--->删除图书");
				System.out.println("请输入图书名称");
				String book = input.next();
				boolean check1 = false;//判断是否找到需要删除的书目，false为未找到
				for(int b = 0;names[b] != null;b ++){
					if(names[b].equals(book)){
						check1 = true;
						if(states[b] == 1){//图书未借出，可以删除
							System.out.println("删除《" +book + "》成功！");
							int i = b;
							for(;i <names.length-1;i ++){
								states[i] = states[i+1];//第三本书未借出
								names[i] = names[i+1];
								dates[i] = dates[i+1];
								times[i] = times[i+1];
							}//将数组内容前移
							
							//将最后一本书的位置进行初始化
							states[i] = 1;//第三本书未借出
							names[i] = null;
							dates[i] = null;
							times[i] = 0;
							break;
						}else{
							System.out.println("图书已借出，无法删除！");
							break;
						}
				    }
				}
				if(check1 == false){
					System.out.println("没有找到匹配信息！");
				}
				System.out.println("*************************");
				break;
			case 4:
				System.out.println("--->借出图书");
				System.out.println("请输入图书名称：");
				String lend = input.next();
				boolean check2 = false;//判断想要借出的书是否能找到，false为未找到，true为找到
				for(int b = 0;names[b] != null;b ++){
					if(names[b].equals(lend)){//如果该书存在
						check2 = true;//想要借的书能被找到
						if(states[b] == 1){//如果图书未借出
							System.out.println("请输入借出日期（年-月-日）:");
							dates[b] = input.next();
							while(judge(dates[b]) == false){
								System.out.println("日期非法，请重新输入！");
								dates[b] = input.next();
							}
							states[b] = 0;//将当前图书的状态转化为借出
							times[b] ++;//当前图书的借出次数加一
						}else{//如果图书已经借出
							System.out.println(names[b] + "已被借出！");						
						}
						break;
					}
				}
				if(check2 == false){
					System.out.println("没有找到匹配信息！");
				}
				System.out.println("*************************");
				break;
			case 5:
				System.out.println("--->归还图书");
				System.out.println("请输入图书名称:");
				String back = input.next();
				boolean check3 = false;//判断想要归还的书是否能找到，false为未找到，true为找到
				for(int b = 0;names[b] != null;b ++){
					if(names[b].equals(back)){//如果该书存在
						check3 = true;//想要借的书能被找到
						if(states[b] == 0){//如果图书已经借出
							System.out.println("请输入归还日期（年-月-日）:");
							String returnDate = input.next();
							while(judge(returnDate) == false){
								System.out.println("日期非法，请重新输入！");
								returnDate = input.next();
							}
							System.out.println("归还《" + back + "》成功！");
							System.out.println("借出日期：" + dates[b]);
							System.out.println("归还日期：" + returnDate);
							int money = 0;
							try {
								money = daysBetween(dates[b],returnDate);
							} catch (ParseException e) {
								e.printStackTrace();
							}
							System.out.println("应付租金（元）：" + money );
							states[b] = 1;//将当前图书的状态转化为未借出							
						}else{//如果图书未借出
							System.out.println("该书没有被借出，无法进行归还操作！");						
						}
						break;
					}
				}
				if(check3 == false){
					System.out.println("没有找到匹配信息！");
				}
				System.out.println("*************************");
				break;
			case 6:
				flag = true;
				break;
			default:
				flag = true;
				break;
		
			}
			if(flag == true){
				break;
			}else{
				System.out.println("输入0返回");
				num = input.nextInt();
			}
		}while(num == 0);
		System.out.println("谢谢使用！");
	}
}

