package com.stly7.eland.collection.tree_node;
/**
 * ѡ������:ѡ������ʹ������ѭ����ÿÿһ����ȥ���Լ����������
 * ѡ��������Ҫ�����±꽻������ʽ���е�
 * @author Administrator
 *
 */
public class Select_BubbleSort {
	
	//ѡ������,��ǰһ������һ����ʣ�����бȽ�
	public void selectSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			//��һ���� �ѵ�һλ����������λ���бȽ�
	        //�����������λ�õ����ݱȵ�һλС���ͽ��н���
			//�����ݴ�ӡ����
	        //���Է��֣���С��һ������������ǰ��
			//�ڶ����� �ѵڶ�λ�ĺ�ʣ�µ�����λ���бȽ�
			//���Է��֣������ڶ�С���������˵ڶ���λ��
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	//���������������Ƚ�
	public void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			//�����ݴ�ӡ����
	        //���Է��֣����ĵ��������
			//�ڶ����� ����һ�Σ�ֻ�������ñȽ����һλ
			//�����ݴ�ӡ����
	        //���Է��֣������ڶ���ĵ��˵����ڶ���λ��
			for (int j = i; j < arr.length - 1; j++) {
				if(arr[j]>arr[j+1]){  
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
			}
		}
	}
	
}
