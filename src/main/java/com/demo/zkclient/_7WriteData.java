package com.demo.zkclient;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

import com.demo.zkclient.model.User;

/**
 * 修改节点
 *
 * @author jerome_s@qq.com
 */
public class _7WriteData {

	public static void main(String[] args) {
		ZkClient zc = new ZkClient("192.168.10.5:2181", 10000, 10000, new SerializableSerializer());
		System.out.println("conneted ok!");
		
		User u = new User();
		u.setId(2);
		u.setName("test2");
		zc.writeData("/node1", u, -1);
	}

}