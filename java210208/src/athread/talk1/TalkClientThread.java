package athread.talk1;

import java.util.StringTokenizer;

public class TalkClientThread extends Thread {
	TalkClient tc = null;
	TalkClientVer2 tcv2 = null;
	
	public TalkClientThread(TalkClient talkClient) {
		this.tc = talkClient;//조립이다. 연결
	}

	public TalkClientThread(TalkClientVer2 talkClientVer2) {
		this.tcv2 = talkClientVer2;
	}

	@Override
	public void run() { //여기는 듣는 곳이다.
		System.out.println("run호출 성공");
		boolean isStop = false;
		while(!isStop) {
			try {
				String msg = "";
				msg = (String)tc.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;
				if(msg!=null) {//100#재훈#오늘 스터디 할까?
					st = new StringTokenizer(msg,"#");
					protocol = Integer.parseInt(st.nextToken());//100
				}
				switch(protocol) {
				case Protocol.ROOM_IN:{
					String nickName = st.nextToken();
					tc.jta_display.append(nickName+"님이 입장하였습니다.\n");
				};
				case Protocol.MESSAGE:{
					String nickName = st.nextToken();
					String msg2 = st.nextToken(); //오늘 스터디 할까?
					tc.jta_display.append("["+nickName+"]"+msg2+"\n");
				};
				}////////////////end of switch
			} catch (Exception e) {
				// TODO: handle exception
			}
		}///////////////////end of while
	}

}