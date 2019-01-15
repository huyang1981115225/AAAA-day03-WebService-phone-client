package cn.com.client;

import java.util.Scanner;

import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;
/**
 * 编写手机号归属地查询系统WebService
 * 
 * @author HY
 *
 */
public class ClientTest {
	public static void main(String[] args) {
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("欢迎进入手机号归属地查询系统");
			System.out.println("请输入需要查询的手机号...");
			String phone = scanner.nextLine();
			if (!"exit".equals(phone.toLowerCase())) {
				
				MobileCodeWS mobileCodeWS = new MobileCodeWS();
				
				MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getMobileCodeWSSoap();
				
				String result = mobileCodeWSSoap.getMobileCodeInfo(phone, null);
				System.out.println(result);
				System.out.println();
			}else {
				System.out.println("谢谢使用手机号归属地查询系统，Bye~");
				break;
			}
		}
	}
}
