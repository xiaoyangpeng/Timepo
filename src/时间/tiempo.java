package 时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class tiempo{

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Date now = new Date();
		// 把Date按照格式转换成字符串
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(now));
		
		String jj=sdf.format(now);
		System.out.println("Date 转成 String"+jj);
		
		// 把字符串按照格式转换成Date对象
		////////////////////////////////////////////////////////	
		SimpleDateFormat dia=new SimpleDateFormat("dd-MM-yyyy");
		String s1 = "20-11-2020";
		
		Date date1 = dia.parse(s1);// 用 		SimpleDateFrmat
		//把String 转换成 Date  
		System.out.println("String to Date"+date1);
		System.out.println("String to Date 再变成String"+dia.format(date1));
		
	
	//////////////////////////////////////////////////////
		
		//System.currentTimeMillis())获取系统毫秒的时间
		SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println("直接用System.currentTimeMillis() 获取时间"+ff.format(System.currentTimeMillis()));
		
		
		//用 Calendar来获取时间 
		Calendar ahora=Calendar.getInstance();//用 Calendar来获取时间 
		System.out.println("Calentar en milisegundi "+ahora.get(Calendar.MILLISECOND));
		System.out.println("Calendar en año "+ahora.get(Calendar.YEAR));
		
		//注意在获取月的时候会少一个月我们要加上一个月
		System.out.println("calendar en mes "+(ahora.get(Calendar.MONTH)+1));
		
///////////////////////////////////////////////////////////////
		//用calender获取之前或者之后的日子
		Calendar antes14 = Calendar.getInstance();
		
		antes14.add(Calendar.DATE, -14);//获取14天之前
		//antes14.add(Calendar.DATE, 14);//获取14天之后
		
		Date dia14antes=antes14.getTime();
		
		System.out.println("14天之前 "+dia.format(dia14antes));
		//如果写了14天之前又写了之后会抵消掉
		//System.out.println("抵消"+dia.format(dia14antes));
	/////////////////////////////////////	
		
		//用date比时间的早还是迟
		Date dateahora=new Date();
		
		System.out.println("现在比14天迟"+	dateahora.after(dia14antes));
	
		System.out.println("现在比14天早"+	dateahora.before(dia14antes));
		
		}

}
