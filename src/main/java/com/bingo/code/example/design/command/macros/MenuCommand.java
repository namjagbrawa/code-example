package com.bingo.code.example.design.command.macros;
import java.util.*;
/**
 * �˵������Ǹ����������
 */
public class MenuCommand implements Command {
	/**
	 * ������¼��ϱ��˵��Ķ����Ʒ��Ҳ���Ƕ���������
	 */
	private Collection<Command> col = new ArrayList<Command>();
	/**
	 * ��ˣ��Ѳ�Ʒ���뵽�˵���
	 * @param cmd �ͻ���Ĳ�
	 */
	public void addCommand(Command cmd){
		col.add(cmd);
	}
	
	public void execute() {
		//ִ�в˵���ʵ����ѭ��ִ�в˵������ÿ����
		for(Command cmd : col){
			cmd.execute();
		}
	}
}
