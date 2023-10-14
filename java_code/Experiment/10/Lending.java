package bookLending;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Lending {
	//���庯���������ж������Ƿ�Ϸ�
	static boolean judge (String str) {
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");//������Ϊ���ڸ�ʽ��y������ݣ�M��������е��·ݣ�Ϊ������Сʱ�еķ�����m��ͻ���˴���M����d�����·��е�����
		try {
			sd.setLenient(false);//�˴�ָ������/ʱ������Ƿ��ϸ���true�ǲ��ϸ�falseʱΪ�ϸ�
			sd.parse(str);//�Ӹ����ַ����Ŀ�ʼ�����ı���������һ������
		}
		catch (Exception e) {
			return false;
		}
		return true;
	}
	public static void printBook(String[] names, int[] times, int[] sortBook, int number){
		int[] another = times.clone();//��������
		int i = 0;
		int max = another[0];//���������������ֵ����������ѭ������
		for(int p = 0;p <= max;p ++){//��0������������ֵ�����β�ѯ���������Ӧ������±꣬���洢��sortBook������
			for(int q = 0;q < number;q ++){//�����������飬����������������ֵ���±�洢��sortBook������
				if(times[q] == p){
					sortBook[i++] = q;
				}
			}
		}
		System.out.println("���\t" + "����\t\t" + "�������");
		for(int x = (number-1);x >= 0;x --){//��ӡ����������а�
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
		//�����������壺ͼ��
		int[] states = new int[50];//״̬,0���ѽ����1���ɽ�
		String[] names = new String[50];//����
		String[] dates = new String[50];//�������,��ά���齫�����շֱ�洢�����ڼ�������
		int[] times = new int[50];//�������

		//��ʼ���ĸ�����
		states[0] = 0;//��һ�����ѽ��
		names[0] = "���ݽṹ";
		dates[0] = "2018-7-1";//��һ������2018��7��1�ս��
		times[0] = 1;//��һ�����ѽ��һ��
		
		states[1] = 1;//�ڶ�����δ���
		names[1] = "���ݿ�";
		dates[1] = null;
		times[1] = 0;//�ڶ����黹δ�����
		
		states[2] = 1;//��������δ���
		names[2] = "��ɢ��ѧ";
		dates[2] = null;
		times[2] = 0;//�������黹δ�����
		
		states[3] = 1;//���ı���δ���
		names[3] = "����ԭ��";
		dates[3] = null;
		times[3] = 0;//���ı��黹δ�����
		
		//��������̿��
		Scanner input = new Scanner(System.in);
		int num = -1;//�û�����0ʱ�������˵���num�ڽ��Ĳ�����������¸�ֵ
		boolean flag = false;//��¼�û��Ƿ��˳�ϵͳ��trueΪ�˳���falseΪ���˳�
		System.out.println("��ӭʹ��ͼ�����ϵͳ");
		
		do{
			System.out.println("---------------------");
			System.out.println("0.������а�");
			System.out.println("1.����ͼ��");
			System.out.println("2.�鿴ͼ��");
			System.out.println("3.ɾ��ͼ��");
			System.out.println("4.���ͼ��");
			System.out.println("5.�黹ͼ��");
			System.out.println("6.�˳�");
			System.out.println("---------------------");
			System.out.println("��ѡ��");
			int choose = input.nextInt();
			switch(choose){
			case 0:
				int number = 0;//��ʼ����Ŀ����δ0
				for(;names[number] != null;number ++){}//�����ǰ��Ŀ����
				int[] sortBook = new int[number];
	            printBook(names,times,sortBook, number);//���ú�������������а�
				break;
			case 1:
				System.out.println("--->����ͼ��");
				int a = 0;
				for(;a < names.length;a ++){
					if(names[a] == null){
					System.out.print("������ͼ�����ƣ�");
				    names[a]= input.next();//¼������
					System.out.println("\n" + "������" +names[a] +"���ɹ���");
					
					//��ͼ����Ϣ����������
					states[a] = 1;
					times[a] = 0;
					dates[a] = null;
					break;
					}
				}
				if(a == 50){
					System.out.println("��������������ʧ��");
				}
				System.out.println("*************************");
				break;
			case 2:
				System.out.println("--->�鿴ͼ��");
				System.out.println("���\t״̬\t����\t\t�������");
				for(int i = 0;names[i] != null;i ++){
					String situation = (states[i] == 0)?"�ѽ��":"�ɽ�";
					System.out.print((i+1) + "\t" + situation + "\t��" + names[i] + "��\t");
					if(states[i] == 0){
						System.out.println(dates[i]);
					}else{
						System.out.println();
					}
				}
				System.out.println("*************************");
				break;
			case 3:
				System.out.println("--->ɾ��ͼ��");
				System.out.println("������ͼ������");
				String book = input.next();
				boolean check1 = false;//�ж��Ƿ��ҵ���Ҫɾ������Ŀ��falseΪδ�ҵ�
				for(int b = 0;names[b] != null;b ++){
					if(names[b].equals(book)){
						check1 = true;
						if(states[b] == 1){//ͼ��δ���������ɾ��
							System.out.println("ɾ����" +book + "���ɹ���");
							int i = b;
							for(;i <names.length-1;i ++){
								states[i] = states[i+1];//��������δ���
								names[i] = names[i+1];
								dates[i] = dates[i+1];
								times[i] = times[i+1];
							}//����������ǰ��
							
							//�����һ�����λ�ý��г�ʼ��
							states[i] = 1;//��������δ���
							names[i] = null;
							dates[i] = null;
							times[i] = 0;
							break;
						}else{
							System.out.println("ͼ���ѽ�����޷�ɾ����");
							break;
						}
				    }
				}
				if(check1 == false){
					System.out.println("û���ҵ�ƥ����Ϣ��");
				}
				System.out.println("*************************");
				break;
			case 4:
				System.out.println("--->���ͼ��");
				System.out.println("������ͼ�����ƣ�");
				String lend = input.next();
				boolean check2 = false;//�ж���Ҫ��������Ƿ����ҵ���falseΪδ�ҵ���trueΪ�ҵ�
				for(int b = 0;names[b] != null;b ++){
					if(names[b].equals(lend)){//����������
						check2 = true;//��Ҫ������ܱ��ҵ�
						if(states[b] == 1){//���ͼ��δ���
							System.out.println("�����������ڣ���-��-�գ�:");
							dates[b] = input.next();
							while(judge(dates[b]) == false){
								System.out.println("���ڷǷ������������룡");
								dates[b] = input.next();
							}
							states[b] = 0;//����ǰͼ���״̬ת��Ϊ���
							times[b] ++;//��ǰͼ��Ľ��������һ
						}else{//���ͼ���Ѿ����
							System.out.println(names[b] + "�ѱ������");						
						}
						break;
					}
				}
				if(check2 == false){
					System.out.println("û���ҵ�ƥ����Ϣ��");
				}
				System.out.println("*************************");
				break;
			case 5:
				System.out.println("--->�黹ͼ��");
				System.out.println("������ͼ������:");
				String back = input.next();
				boolean check3 = false;//�ж���Ҫ�黹�����Ƿ����ҵ���falseΪδ�ҵ���trueΪ�ҵ�
				for(int b = 0;names[b] != null;b ++){
					if(names[b].equals(back)){//����������
						check3 = true;//��Ҫ������ܱ��ҵ�
						if(states[b] == 0){//���ͼ���Ѿ����
							System.out.println("������黹���ڣ���-��-�գ�:");
							String returnDate = input.next();
							while(judge(returnDate) == false){
								System.out.println("���ڷǷ������������룡");
								returnDate = input.next();
							}
							System.out.println("�黹��" + back + "���ɹ���");
							System.out.println("������ڣ�" + dates[b]);
							System.out.println("�黹���ڣ�" + returnDate);
							int money = 0;
							try {
								money = daysBetween(dates[b],returnDate);
							} catch (ParseException e) {
								e.printStackTrace();
							}
							System.out.println("Ӧ�����Ԫ����" + money );
							states[b] = 1;//����ǰͼ���״̬ת��Ϊδ���							
						}else{//���ͼ��δ���
							System.out.println("����û�б�������޷����й黹������");						
						}
						break;
					}
				}
				if(check3 == false){
					System.out.println("û���ҵ�ƥ����Ϣ��");
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
				System.out.println("����0����");
				num = input.nextInt();
			}
		}while(num == 0);
		System.out.println("ллʹ�ã�");
	}
}

