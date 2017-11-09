package com.bingo.code.example.design.memento.revoke;

/**
 * �������Ĺ�������ʵ�ָ����������Ĺ�������
 */
public abstract class AbstractCommand implements Command {
    /**
     * ����Ĺ���ʵ�֣����ﲻ��
     */
    public abstract void execute();

    /**
     * ��������������ʵ���߶���
     */
    protected OperationApi operation = null;

    public void setOperation(OperationApi operation) {
        this.operation = operation;
    }

    public Memento createMemento() {
        return this.operation.createMemento();
    }

    public void redo(Memento m) {
        this.operation.setMemento(m);
    }

    public void undo(Memento m) {
        this.operation.setMemento(m);
    }
}
