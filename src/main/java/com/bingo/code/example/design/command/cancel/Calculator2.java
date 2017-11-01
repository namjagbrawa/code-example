package com.bingo.code.example.design.command.cancel;

/**
 * �������࣬���������мӷ���ť��������ť
 */
public class Calculator2 {
    /**
     * ����ִ�мӷ����������
     */
    private Command addCmd = null;
    /**
     * ����ִ�м������������
     */
    private Command substractCmd = null;

    /**
     * ����ִ�мӷ����������
     *
     * @param addCmd ִ�мӷ����������
     */
    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }

    /**
     * ����ִ�м������������
     *
     * @param substractCmd ִ�м������������
     */
    public void setSubstractCmd(Command substractCmd) {
        this.substractCmd = substractCmd;
    }

    /**
     * �ṩ���ͻ�ʹ�ã�ִ�мӷ�����
     */
    public void addPressed() {
        this.addCmd.execute();
    }

    /**
     * �ṩ���ͻ�ʹ�ã�ִ�м�������
     */
    public void substractPressed() {
        this.substractCmd.execute();
    }
}
