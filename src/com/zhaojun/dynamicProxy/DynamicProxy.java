package com.zhaojun.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//�̳�java�ж�̬�����Ľӿ�
public class DynamicProxy implements InvocationHandler{
	
	//�����������Ҫ��������ʵ����
	private Object subject;
	
	//���췽����������Ҫ��������ʵ���󸳳�ֵ
	public DynamicProxy(Object subject){
	    this.subject = subject;
	}
	
	@Override //�ýӿ�Ψһ��Ҫʵ�ֵķ��� 
	public Object invoke(Object object, Method method, Object[] args) throws Throwable{
	    //�ڴ�����ʵ����ǰ���ǿ�������һЩ�Լ��Ĳ���
	    System.out.println("before rent house");
	    
	    System.out.println("Method:" + method);
	    
	    //���������������ʵ����ķ���ʱ������Զ�����ת���������������handler�����invoke���������е���
	    method.invoke(subject, args);
	    
	    //�ڴ�����ʵ���������Ҳ��������һЩ�Լ��Ĳ���
	    System.out.println("after rent house");
	    
	    return null;
	}

}