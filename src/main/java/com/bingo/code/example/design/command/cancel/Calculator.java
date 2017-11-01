package com.bingo.code.example.design.command.cancel;

import java.util.ArrayList;
import java.util.List;

/**
 * �������࣬���������мӷ���ť��������ť�����г����ͻָ��İ�ť
 */
public class Calculator {
    /**
     * ����Ĳ�������ʷ��¼���ڳ���ʱ����
     */
    private List<Command> undoCmds = new ArrayList<Command>();
    /**
     * �����������ʷ��¼���ڻָ�ʱ����
     */
    private List<Command> redoCmds = new ArrayList<Command>();

    private Command addCmd = null;
    private Command substractCmd = null;

    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }

    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }

    public void addPressed() {
        this.addCmd.execute();
        //�Ѳ�����¼����ʷ��¼����
        undoCmds.add(this.addCmd);
    }

    public void substractPressed() {
        this.substractCmd.execute();
        //�Ѳ�����¼����ʷ��¼����
        undoCmds.add(this.substractCmd);
    }

    public void undoPressed() {
        if (this.undoCmds.size() > 0) {
            //ȡ�����һ������������
            Command cmd = this.undoCmds.get(this.undoCmds.size() - 1);
            cmd.undo();
            //������лָ��Ĺ��ܣ��ǾͰ���������¼���ָ�����ʷ��¼����
            this.redoCmds.add(cmd);
            //Ȼ������һ������ɾ������
            this.undoCmds.remove(cmd);
        } else {
            System.out.println("�ܱ�Ǹ��û�пɳ���������");
        }
    }

    public void redoPressed() {
        if (this.redoCmds.size() > 0) {
            //ȡ�����һ������������
            Command cmd = this.redoCmds.get(this.redoCmds.size() - 1);
            cmd.execute();
            //����������¼���ɳ�������ʷ��¼����
            this.undoCmds.add(cmd);
            //Ȼ������һ������ɾ����
            this.redoCmds.remove(cmd);
        } else {
            System.out.println("�ܱ�Ǹ��û�пɻָ�������");
        }
    }
}
