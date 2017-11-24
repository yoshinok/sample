import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {
	public static void main(String arg[]) throws IOException, InterruptedException{
		ServerSocket ss = new ServerSocket(80);
		Socket sock = ss.accept();
		BufferedReader br= new BufferedReader(new InputStreamReader(
				sock.getInputStream()));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(
				sock.getOutputStream()));
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
			if(str.equals("")){


				bw.write("HTTP/1.1 200");
				bw.flush();
				bw.newLine();
				bw.write("Content-Length: 1");
				for(int i=1;i<300;i++){
					Thread.sleep(5000);
				}
				//test
				bw.newLine();
				//develop04 comment
			}
		}
	}
}
