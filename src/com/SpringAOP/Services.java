package com.SpringAOP;
/**
 * 业务类
 * 凡帅  2018年3月28日下午4:05:32
 *
 *
 */
public class Services {
	public void serv() {
		System.out.println("Services中的serv方法======");
		
//		throw new RuntimeException();
	}
	public void init(String name,int times) {
		System.out.println(name + " " + times);
	}
}
