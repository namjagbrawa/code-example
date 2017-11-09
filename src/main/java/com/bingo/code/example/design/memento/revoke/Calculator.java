package com.bingo.code.example.design.memento.revoke;

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
    /**
     * ���������Ӧ�ı���¼�������ʷ��¼���ڳ���ʱ����
     * ���ڶ���ÿ��������󣬳�����������״̬�ǲ�һ���ģ�
     * �����ǻص��������ǰ��״̬���������ǻص�����������״̬��
     * ��˶�ÿһ�����ʹ��һ������¼�������������¼��Ӧ��״̬
     */
    private List<Memento[]> undoMementos = new ArrayList<Memento[]>();
    /**
     * �����������Ӧ�ı���¼�������ʷ��¼���ڻָ�ʱ����,
     * ����������Ԫ�أ���һ��������ִ��ǰ��״̬���ڶ���������ִ�к��״̬
     */
    private List<Memento[]> redoMementos = new ArrayList<Memento[]>();

    private Command addCmd = null;
    private Command substractCmd = null;

    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }

    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }

    public void addPressed() {
        //��ȡ��Ӧ�ı���¼���󣬲���������Ӧ����ʷ��¼����
        Memento m1 = this.addCmd.createMemento();

        //ִ������
        this.addCmd.execute();

        //�Ѳ�����¼����ʷ��¼����
        undoCmds.add(this.addCmd);

        //��ȡִ�������ı���¼����
        Memento m2 = this.addCmd.createMemento();
        //���õ���������ʷ��¼����
        this.undoMementos.add(new Memento[]{m1, m2});
    }

    public void substractPressed() {
        //��ȡ��Ӧ�ı���¼���󣬲���������Ӧ����ʷ��¼����
        Memento m1 = this.substractCmd.createMemento();

        //ִ������
        this.substractCmd.execute();

        //�Ѳ�����¼����ʷ��¼����
        undoCmds.add(this.substractCmd);

        //��ȡִ�������ı���¼����
        Memento m2 = this.substractCmd.createMemento();
        //���õ���������ʷ��¼����
        this.undoMementos.add(new Memento[]{m1, m2});
    }

    public void undoPressed() {
        if (undoCmds.size() > 0) {
            //ȡ�����һ������������
            Command cmd = undoCmds.get(undoCmds.size() - 1);
            //��ȡ��Ӧ�ı���¼����
            Memento[] ms = undoMementos.get(undoCmds.size() - 1);

            //����
            cmd.undo(ms[0]);

            //������лָ��Ĺ��ܣ��ǾͰ���������¼���ָ�����ʷ��¼����
            redoCmds.add(cmd);
            //����Ӧ�ı���¼����Ҳ��ӹ�ȥ
            redoMementos.add(ms);

            //Ȼ������һ������ɾ������
            undoCmds.remove(cmd);
            //����Ӧ�ı���¼����Ҳɾ����
            undoMementos.remove(ms);
        } else {
            System.out.println("�ܱ�Ǹ��û�пɳ���������");
        }
    }

    public void redoPressed() {
        if (redoCmds.size() > 0) {
            //ȡ�����һ������������
            Command cmd = redoCmds.get(redoCmds.size() - 1);
            //��ȡ��Ӧ�ı���¼����
            Memento[] ms = redoMementos.get(redoCmds.size() - 1);

            //����
            cmd.redo(ms[1]);

            //����������¼���ɳ�������ʷ��¼����
            undoCmds.add(cmd);
            //����Ӧ�ı���¼����Ҳ��ӹ�ȥ
            undoMementos.add(ms);
            //Ȼ������һ������ɾ����
            redoCmds.remove(cmd);
            //����Ӧ�ı���¼����Ҳɾ����
            redoMementos.remove(ms);
        } else {
            System.out.println("�ܱ�Ǹ��û�пɻָ�������");
        }
    }
}
