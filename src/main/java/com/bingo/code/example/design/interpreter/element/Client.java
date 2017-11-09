package com.bingo.code.example.design.interpreter.element;

public class Client {
	public static void main(String[] args) throws Exception {
		//׼��������
		Context c = new Context("InterpreterTest.xml");
		
		//��Ҫ��ȡcԪ�ص�ֵ��Ҳ�������±��ʽ��ֵ��"root/a/b/c"
		
//		//����Ҫ�����������ĳ����﷨��
//		ElementExpression root = new ElementExpression("root");
//		ElementExpression aEle = new ElementExpression("a");
//		ElementExpression bEle = new ElementExpression("b");
//		ElementTerminalExpression cEle = new ElementTerminalExpression("c");
//		//�������
//		root.addEle(aEle);
//		aEle.addEle(bEle);
//		bEle.addEle(cEle);
//		
//		//����
//		String ss[] = root.interpret(c);
//		System.out.println("c��ֵ��="+ss[0]);
		
		//��Ҫ��ȡcԪ�ص�name���ԣ�Ҳ�������±��ʽ��ֵ��"root/a/b/c.name"
		//���ʱ��c�����ս��ˣ���Ҫ��c�޸ĳ�ElementExpressioin
		ElementExpression root = new ElementExpression("root");
		ElementExpression aEle = new ElementExpression("a");
		ElementExpression bEle = new ElementExpression("b");
		ElementExpression cEle = new ElementExpression("c");
		PropertyTerminalExpression prop = new PropertyTerminalExpression("name");
		//���
		root.addEle(aEle);
		aEle.addEle(bEle);
		bEle.addEle(cEle);
		cEle.addEle(prop);
		
		//����
		String ss[] = root.interpret(c);
		System.out.println("c������name��ֵ��="+ss[0]);
		
		//���Ҫʹ��ͬһ�������ģ��������н�������Ҫ���³�ʼ�������Ķ���
		//����Ҫ�����������ٻ�ȡһ������name��ֵ����Ȼ������������Ԫ�أ�
		//���½�����ֻҪ����ʹ��ͬһ�������ģ�����Ҫ���³�ʼ�������Ķ���
		c.reInit();
		String ss2[] = root.interpret(c);
		System.out.println("���»�ȡc������name��ֵ��="+ss2[0]);
	}
}
