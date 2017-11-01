package com.bingo.code.example.design.command.macros;

/**
 * ����Ա��������ϲ˵���������װÿ���˺;����ʵ���ߣ�
 * ������ִ�е��ã��൱�ڱ�׼Commandģʽ��Client+Invoker
 */
public class Waiter {
	/**
	 * ����һ����������󡪡��˵�
	 */
	private MenuCommand menuCommand = new MenuCommand();
	/**
	 * �ͻ����
	 * @param cmd �ͻ���Ĳˣ�ÿ������һ���������
	 */
	public void orderDish(Command cmd){
		//�ͻ������������������û�кͽ�������װ��
		//��������װ��
		CookApi hotCook = new HotCook();
		CookApi coolCook = new CoolCook();
		//�ж��������������ʦ�������Ȳ�ʦ��
		//�򵥵���������ԭʼ������������ж�
		if(cmd instanceof DuckCommand){
			((DuckCommand)cmd).setCookApi(hotCook);
		}else if(cmd instanceof ChopCommand){
			((ChopCommand)cmd).setCookApi(hotCook);
		}else if(cmd instanceof PorkCommand){
			//���Ǹ����ˣ�����Ҫ������˵�ʦ��
			((PorkCommand)cmd).setCookApi(coolCook);
		}
		//��ӵ��˵���
		menuCommand.addCommand(cmd);
	}
	/**
	 * �ͻ������ϣ���ʾҪִ�������ˣ��������ִ�в˵�����������
	 */
	public void orderOver(){
		this.menuCommand.execute();
	}
}
