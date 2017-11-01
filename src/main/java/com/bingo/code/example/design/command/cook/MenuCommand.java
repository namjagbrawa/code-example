package com.bingo.code.example.design.command.cook;
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
	public void setCookApi(CookApi cookApi){
		//ʲô��������
	}
	public int getTableNum(){
		//ʲô��������
		return 0;
	}
	/**
	 * ��ȡ�˵��еĶ���������
	 * @return �˵��еĶ���������
	 */
	public Collection<Command> getCommands(){
		return this.col;
	}	
	
	public void execute() {
		//ִ�в˵����ǰѲ˵����ݸ����
		CommandQueue.addMenu(this);
	}
}
