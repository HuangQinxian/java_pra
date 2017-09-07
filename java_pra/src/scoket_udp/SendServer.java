package scoket_udp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class SendServer {
	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(9900);
		byte[] buf = new byte[1024];
		
		
		new Thread(new Runnable() {		
			@Override
			public void run() {
				System.out.println("SendServer send");
				String str = null;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				try {
					while((str = br.readLine()) != null) {
						byte[] strByte = str.getBytes();
						DatagramPacket dp = null;
						try {
							dp = new DatagramPacket(strByte,strByte.length,InetAddress.getByName("localhost"),9901);
						} catch (UnknownHostException e1) {
							e1.printStackTrace();
						}
						try {
							ds.send(dp);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		
		new Thread(new Runnable() {			
			@Override
			public void run() {
				System.out.println("SendServer receive");
				while(true) {
					DatagramPacket dp2 = new DatagramPacket(buf, buf.length);
					try {
						ds.receive(dp2);
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println(dp2.getAddress().getHostAddress());
					System.out.println(new String(dp2.getData(),0,dp2.getLength()));
				}
			}
		}).start();
	}
}
