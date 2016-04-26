package com.common.lang.test;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;

public class TimeTest {

	/**
	 * 1.DateFormatUtils:提供格式化日期和时间功能及相关常量
	 * 2.DateUtils：在Calendar和Date的基础上提供方便的访问
	 * 3.DurationFormatUtils:提供格式化时间跨度的功能及相关常量
	 * 4.FastDateFormat:为SimpleDateFormat提供一个线程安全的替代
	 * 5.StopWatch：一个方便的计时器
	 */
	@Test
	public void test(){
		
		System.out.println(StringUtils.center("demoDateUtils", 30,"====================="));
		Date date=new Date();
		String isoDateTime=DateFormatUtils.ISO_DATETIME_FORMAT.format(date);
		System.out.println(date);
		System.out.println(isoDateTime);
		String[] dt=StringUtils.split(isoDateTime, "T");
		System.out.println(Arrays.toString(dt));
		String isoTime=DateFormatUtils.ISO_TIME_NO_T_FORMAT.format(date);
		String isoTime2=DateFormatUtils.ISO_DATETIME_FORMAT.format(date);
		System.out.println(isoTime);
		System.out.println(isoTime2);
		System.out.println(DateUtils.round(date, Calendar.HOUR));
		System.out.println(DateUtils.truncate(date, Calendar.HOUR));
		
		/**
		 * round:对日期某个字段作为四舍五入
		 * truncate:对日期某个字段取整
		 */
		
	}
	/**
	 * 1.StopWatch:
	 * 2.start:开始计时
	 * 3.stop：停止计时
	 * 4.suspend：暂停
	 * 5.resume：继续
	 * 6.reset：重置
	 * 7.getTime：得到时间
	 */
	@Test
	public void testStopWatch(){
		StopWatch sw=new StopWatch();
		sw.start();
		try {
			Thread.sleep(5500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sw.stop();
		System.out.println(sw.getNanoTime());
	}
}
