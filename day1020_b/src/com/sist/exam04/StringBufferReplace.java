package com.sist.exam04;

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer data = new StringBuffer("hello korea");
		//"hello"f�� "hi"�� ����
		
		//data.replace(0,5,"hi");
		//System.out.println(data);
		
		//�ٸ�������� �غ���
		String oldString = "hello"; // hello���ڿ��� ã�Ƽ�
		String newString = "hi"; // hi�� �ٲ���
		
		//data�κ��� oldString�� ��ġ�� �˾Ƴ�����
		int start = data.indexOf(oldString);
		
		int end = start + oldString.length();
		data.replace(start, end, newString);
		System.out.println(data); // hi korea
		
	}

}
