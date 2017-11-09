package com.bingo.code.example.generatefile;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
  
import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;

public class PictureUtil {  
  
    private static void createImage(String fileLocation, BufferedImage image) {  
        try {  
            FileOutputStream fos = new FileOutputStream(fileLocation);  
            BufferedOutputStream bos = new BufferedOutputStream(fos);  
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);  
            encoder.encode(image);  
            bos.close();  
            fos.close();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
  
    public static void graphicsGeneration(String path) {
  
        int imageWidth = 1000;// 图片的宽度  
  
        int imageHeight = 1000;// 图片的高度  
  
        BufferedImage image = new BufferedImage(imageWidth, imageHeight,  
                BufferedImage.TYPE_INT_RGB);  
        Graphics graphics = image.getGraphics();  
        graphics.setColor(Color.white);  
        graphics.fillRect(0, 0, imageWidth, imageHeight);  
        graphics.setColor(Color.ORANGE);  
        graphics.setFont(new Font("宋体", Font.BOLD, 20));

        int num = 50;
        graphics.drawString("手机号      : " + "policyPersonDto.getMobile()", 50, num);
        num += 50;
        graphics.drawString("登陆密码    : " + "policyPersonDto.getPassword()", 50, num);
        num += 50;
        graphics.drawString("身份证号    : " + "policyPersonDto.getIdentityCard()", 50, num);
        num += 50;
        graphics.drawString("姓名        : " + "policyPersonDto.getUserName()", 50, num);
        num += 50;
        graphics.drawString("所在地区    : " + "policyPersonDto.getArea()", 50, num);
        num += 50;
        graphics.drawString("常住地址    : " + "policyPersonDto.getAddress()", 50, num);
        num += 50;
        graphics.drawString("微信号      : " + "policyPersonDto.getWechatNo()", 50, num);
        num += 50;
        graphics.drawString("QQ号        : " + "policyPersonDto.getQq()", 50, num);
        num += 50;
        graphics.drawString("Email       : " + "policyPersonDto.getEmail()", 50, num);
        num += 50;
        graphics.drawString("品牌        : " + "policyProductDto.getBrand()", 50, num);
        num += 50;
        graphics.drawString("型号        : " + "policyProductDto.getModel()", 50, num);
        num += 50;
        graphics.drawString("商品编号    : " + "policyProductDto.getProductId()", 50, num);
        num += 50;
        graphics.drawString("购买日期    : " + "policyProductDto.getPurchaseDate()", 50, num);
        num += 50;
        graphics.drawString("购买价格    : " + "policyProductDto.getPurchasePrice()", 50, num);
        num += 50;
        graphics.drawString("购买途径    : " + "policyProductDto.getPurchaseWay()", 50, num);
        num += 50;
        graphics.drawString("报修电话    : " + "policyProductDto.getWarrantyPhone()", 50, num);
        num += 50;
        graphics.drawString("延保单位    : " + "policyProductDto.getExtendedWarrantyUnit()", 50, num);
        num += 50;
        graphics.drawString("延保电话    : " + "policyProductDto.getExtendedWarrantyPhone()", 50, num);
        num += 50;
        graphics.drawString("发票编号    : " + "policyProductDto.getInvoiceNo()", 50, num);

        createImage(path, image);  
    }  
      
    public static void main(String[] args){  
        List<Map> list = new ArrayList<Map>();  
          
        Map<String, String> mapTitle1 = new HashMap<String, String>();  
        mapTitle1.put("title", "使用人信息");  
        list.add(mapTitle1);  
          
        Map<String, String> map1 = new HashMap<String, String>();  
        map1.put("客户姓名", "张三");  
        map1.put("手机号", "123123");  
        map1.put("身份证号", "230302198811241234");  
        list.add(map1);  
          
        Map<String, String> map2 = new HashMap<String, String>();  
        map2.put("送货地址", "北京市海淀区知春路113号银网中心B座1009室");  
        list.add(map2);  
          
        Map<String, String> map3 = new HashMap<String, String>();  
        map3.put("微信号码", "123123");  
        map3.put("qq号码", "123123");  
        map3.put("电子邮箱", "gaop@haierubic.com");  
        list.add(map3);  
  
        Map<String, String> mapTitle2 = new HashMap<String, String>();  
        mapTitle2.put("title", "购买人信息");  
        list.add(mapTitle2);  
          
        Map<String, String> map4 = new HashMap<String, String>();  
        map4.put("姓名", "张三朋友");  
        map4.put("手机号", "15612341122");  
        map4.put("身份证号", "230302198811241234");  
        list.add(map4);  
  
        Map<String, String> mapTitle3 = new HashMap<String, String>();  
        mapTitle3.put("title", "产品信息");  
        list.add(mapTitle3);  
  
        Map<String, String> map5 = new HashMap<String, String>();  
        map5.put("产品型号", "ALI88");  
        map5.put("凭证类型", "发票");  
        map5.put("购买日期", "2014-12-02");  
        list.add(map5);  
  
        Map<String, String> map6 = new HashMap<String, String>();  
        map6.put("购买商城", "ALI88");  
        map6.put("凭证编号", "发票");  
        list.add(map6);  
  
        int imageWidth = 1200;// 图片的宽度  
  
        int imageHeight = 1000;// 图片的高度  
  
        BufferedImage image = new BufferedImage(imageWidth, imageHeight,  
                BufferedImage.TYPE_INT_RGB);  
        Graphics graphics = image.getGraphics();  
        graphics.setColor(Color.white);  
        graphics.fillRect(0, 0, imageWidth, imageHeight);  
        graphics.setColor(Color.black);  
  
        int high = 100;  
        int wigth = 0;  
        graphics.setFont(new Font("宋体", Font.BOLD, 50));  
        graphics.drawString("注册保单", 500, high);  
        graphics.setFont(new Font("宋体", Font.BOLD, 20));  
        high += 10;  
        graphics.drawLine(50, high, 1150, high);  
          
        for(Map<String, String> rowMap : list){  
            high += 50;  
            wigth = 50;  
            for(Map.Entry<String, String> entry : rowMap.entrySet()){  
                String name = entry.getKey() + "：" + entry.getValue();  
                if("title".equals(entry.getKey())){  
                    high += 50;  
                    graphics.setFont(new Font("黑体", Font.BOLD, 30));  
                    graphics.drawString(entry.getValue(), wigth, high);  
                    graphics.setFont(new Font("宋体", Font.BOLD, 20));  
                } else {  
                    graphics.drawString(name, wigth, high);  
                    wigth += 400;  
                }  
                  
            }  
        }  
          
        createImage("D://test1.jpg", image);  
      
    }

    public void graphicsGeneration() throws Exception {
        // 实际数据行数+标题+备注
        int totalrow = 6;
        int totalcol = 5;
        int imageWidth = 1024;
        int imageHeight = totalrow * 40 + 20;
        int rowheight = 40;
        int startHeight = 10;
        int startWidth = 10;
        int colwidth = ((imageWidth - 20) / totalcol);

        BufferedImage image = new BufferedImage(imageWidth, imageHeight,
                BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();

        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, imageWidth, imageHeight);
        graphics.setColor(new Color(220, 240, 240));

        // 画横线
        for (int j = 0; j < totalrow - 1; j++) {
            graphics.setColor(Color.black);
            graphics.drawLine(startWidth, startHeight + (j + 1) * rowheight,
                    imageWidth - 5, startHeight + (j + 1) * rowheight);
        }
        // 末行
        graphics.setColor(Color.black);
        graphics.drawLine(startWidth, imageHeight - 90, imageWidth - 5,
                imageHeight - 90);

        // 画竖线
        for (int k = 0; k < totalcol; k++) {
            graphics.setColor(Color.black);
            graphics.drawLine(startWidth + k * colwidth, startHeight
                    + rowheight, startWidth + k * colwidth, imageHeight - 50);
        }
        // 末列
        graphics.setColor(Color.black);
        graphics.drawLine(imageWidth - 5, startHeight + rowheight,
                imageWidth - 5, imageHeight - 50);

        // 设置字体
        Font font = new Font("华文楷体", Font.BOLD, 20);
        graphics.setFont(font);

        // 写标题
        String title = "标题写在这里";
        graphics.drawString(title, imageWidth / 3 + startWidth, startHeight
                + rowheight - 10);

        font = new Font("华文楷体", Font.BOLD, 18);
        graphics.setFont(font);

        // 写入表头
        String[] headCells = { "编号", "名称", "年龄", "性别", "体重" };
        for (int m = 0; m < headCells.length; m++) {
            graphics.drawString(headCells[m].toString(), startWidth + colwidth
                    * m + 5, startHeight + rowheight * 2 - 10);
        }

        // 设置字体
        font = new Font("华文楷体", Font.PLAIN, 16);
        graphics.setFont(font);
        String[][] cellsValue = { { "101", "xiaozhang", "13", "M", "55" },
                { "102", "xiaowang", "14", "F", "53" },
                { "103", "同事接听，工作信息核实无误，收入纯打卡，无现金发薪同事接听，工作信息核实无误，收入纯打卡，无现金发薪同事接听，工作信息核实无误，收入纯打卡，无现金发薪同事接听，工作信息核实无误，收入纯打卡，无现金发薪", "15", "M", "58" } };
        // 写入内容
        for (int n = 0; n < cellsValue.length; n++) {
            String[] arr = cellsValue[n];
            for (int l = 0; l < arr.length; l++) {
                graphics.drawString(cellsValue[n][l].toString(), startWidth
                        + colwidth * l + 5, startHeight + rowheight * (n + 3)
                        - 10);
            }
        }

        font = new Font("华文楷体", Font.BOLD, 18);
        graphics.setFont(font);
        graphics.setColor(Color.RED);

        // 写备注
        String remark = "备注：备注写在这里。";
        graphics.drawString(remark, startWidth, imageHeight - 30);

        //createImage("D:\\1.jpg");

        ImageIO.write(image, "jpg", new File("D:\\1.jpg"));
    }

    /**
     * 打印模版
     *
     * @param imgWidth    图片的宽度
     * @param imgHeight   图片的高度
     * @param x           起始x轴
     * @param y           起始y轴
     * @param rowHeight   每行的高度
     * @param dataStart   数据缩进
     * @param firstWidth  第一列间距x坐标
     * @param secondWidth 第二列间距x坐标
     * @param thirdWidth  第三列间距x坐标
     * @param fourWidth   第四列间距x坐标
     * @param //  实体对象
     * @return BufferedImage
     *(参数自己定，我的是340, 200, 0, 0, 20, 10, 60, 190, 250, 340, tb)
     */
    private BufferedImage createTbGraphics(int imgWidth, int imgHeight, int x, int y, int rowHeight,
                                           int dataStart, int firstWidth, int secondWidth, int thirdWidth, int fourWidth) {
        //空白面板  也可是张图片
        BufferedImage image = new BufferedImage(imgWidth, imgHeight, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = null;

        try {

            g = image.createGraphics();// 得到图形上下文
            g.setBackground(Color.WHITE);//设置背景色
            g.fillRect(x, y, imgWidth, imgHeight);//填充整个屏幕
            g.setColor(Color.BLACK);//设置画笔颜色
//            g.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 12));// 设置字体   这种以及“非国产”是乱码  有办法解决的话也可为实线， 我认为乱码是因为条码打印机的缘故，这样就要二次开发打印机，所以我没要这种方法
            g.setFont(new Font("微软雅黑", Font.TYPE1_FONT, 12));// 设置字体 还可设置为Font.ITALIC 就这两种条码打印机打印出来的的线是实体线
//            g.setFont(new Font("simsun", Font.TYPE1_FONT, 12));// jvm里   想将字体格式simsun存入jvm里直接调用，打印出来也不成

            g.drawLine(x, y, imgWidth, y);// 第一条横线

            g.drawLine(x, y, x, rowHeight);//竖线
//            g.drawString(new String("名称".getBytes("utf-8"),"utf-8"), dataStart, rowHeight - 5);
            g.drawString("名称", dataStart, rowHeight - 5);
            g.drawLine(firstWidth, y, firstWidth, rowHeight);
            g.drawString("TBName" == null ? "" :  "TBName" , firstWidth + dataStart, rowHeight - 5);
            g.drawLine(imgWidth - 1, y, imgWidth - 1, rowHeight);

            g.drawLine(x, rowHeight, imgWidth, rowHeight); //横线
            g.drawLine(x, rowHeight, x, rowHeight * 2);
            g.drawString("代码", dataStart, rowHeight * 2 - 5);    // * 2代表第二行
            g.drawLine(firstWidth, rowHeight, firstWidth, rowHeight * 2);
            g.drawString("TBCode" == null ? "" : "TBCode"  , firstWidth + dataStart, rowHeight * 2 - 5);
            g.drawLine(secondWidth, rowHeight, secondWidth, rowHeight * 2);

            //其他数据....

            //最后一条线
            g.drawLine(x, imgHeight - 1, imgWidth, imgHeight - 1);

            //在指定坐标(198,61)处 写入二维码或其它图片
            g.drawImage(ImageIO.read((File) null/*getServletContext().getResourceAsStream("PicUrl")*/), null, 198, 61);
            g.dispose();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return image;
    }
  
}
