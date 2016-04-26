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
	 * 1.DateFormatUtils:�ṩ��ʽ�����ں�ʱ�书�ܼ���س���
	 * 2.DateUtils����Calendar��Date�Ļ������ṩ����ķ���
	 * 3.DurationFormatUtils:�ṩ��ʽ��ʱ���ȵĹ��ܼ���س���
	 * 4.FastDateFormat:ΪSimpleDateFormat�ṩһ���̰߳�ȫ�����
	 * 5.StopWatch��һ������ļ�ʱ��
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
		 * round:������ĳ���ֶ���Ϊ��������
		 * truncate:������ĳ���ֶ�ȡ��
		 */
		
	}
	/**
	 * 1.StopWatch:
	 * 2.start:��ʼ��ʱ
	 * 3.stop��ֹͣ��ʱ
	 * 4.suspend����ͣ
	 * 5.resume������
	 * 6.reset������
	 * 7.getTime���õ�ʱ��
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
