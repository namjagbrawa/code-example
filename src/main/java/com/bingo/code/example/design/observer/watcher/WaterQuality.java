package com.bingo.code.example.design.observer.watcher;

/**
 * �����ˮ�ʼ�����
 */
public class WaterQuality extends WaterQualitySubject {
    /**
     * ��Ⱦ�ļ���0��ʾ������1��ʾ�����Ⱦ��2��ʾ�ж���Ⱦ��3��ʾ�߶���Ⱦ
     */
    private int polluteLevel = 0;

    /**
     * ��ȡˮ����Ⱦ�ļ���
     *
     * @return ˮ����Ⱦ�ļ���
     */
    public int getPolluteLevel() {
        return polluteLevel;
    }

    /**
     * �����ˮ�����������ˮ����Ⱦ�ļ���
     *
     * @param polluteLevel ˮ����Ⱦ�ļ���
     */
    public void setPolluteLevel(int polluteLevel) {
        this.polluteLevel = polluteLevel;
        //֪ͨ��Ӧ�Ĺ۲���
        this.notifyWatchers();
    }

    /**
     * ֪ͨ��Ӧ�Ĺ۲��߶���
     */
    public void notifyWatchers() {
        //ѭ������ע��Ĺ۲���
        for (WatcherObserver watcher : observers) {
            //��ʼ������Ⱦ�����ж��Ƿ���Ҫ֪ͨ���������ܿ�
            if (this.polluteLevel >= 0) {
                //֪ͨ���Ա����¼
                if ("�����Ա".equals(watcher.getJob())) {
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >= 1) {
                //֪ͨԤ����Ա
                if ("Ԥ����Ա".equals(watcher.getJob())) {
                    watcher.update(this);
                }
            }
            if (this.polluteLevel >= 2) {
                //֪ͨ��ⲿ���쵼
                if ("��ⲿ���쵼".equals(watcher.getJob())) {
                    watcher.update(this);
                }
            }
        }
    }
}