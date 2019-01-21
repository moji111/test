package util;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.servlet.http.HttpSession;

public class FormatAuthCode {
	private static char[] chs= "1234568970QWERTYUIOPLKJHGFDSAZXCVBNM".toCharArray();//随机数组
	
	public static BufferedImage getAuthCode (int count,int width,int height,HttpSession session){
		if(count<1||width<1||height<1||session==null)
		return null;//判断为空
 
	BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_3BYTE_BGR);//生成面板缓冲区
	Graphics2D graphics2d = image.createGraphics();//生成平面
	graphics2d.setColor(new Color(238,238,238));//设置背景色
	graphics2d.fillRect(0,0,width,height);//设置坐标
	graphics2d.setFont(new Font("Times New Roman", Font.BOLD, 25));//设置字体
	
	StringBuffer code = new StringBuffer();//设置字符串缓冲区
	Random random = new Random();//生成随机数
	for (int i = 0; i <count;i++) {//生成个数
		int index = random.nextInt(chs.length);//得到随机数
		graphics2d.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));//生成随机颜色
		graphics2d.drawString(String.valueOf(chs[index]), 20*i+5, 23 );//平面置数
		code.append(chs[index]);//缓冲区置数
	}
	session.setAttribute("authCode", code.toString());//保留缓冲区数值
	return image;
	}
	
	private FormatAuthCode() {}
}